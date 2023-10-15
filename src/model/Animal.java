package model;

public class Animal {
    public String nickname;
    private double weight;

    //Конструктор без параметров(по умолчанию)
    public Animal() {
        nickname = "noname";
        weight = 0.1;
    }

    //Конструктор - метод, вызывается автоматически при создании объекта
    // цель конструктора сразу при создании обьекта придать его полям конкретные значения
    public Animal(String nickname, double weight) {
        this.nickname = nickname;
        if (weight > 0) {
            this.weight = weight;
        }
    }

    //метод доступа сеттер
    //принимаем значение, если оно положительное, то присваиваем его в значение веса животного
    //когда запускается метод у него всегда есть один неявный аргумент
    //this - ссылка на объект для которого работает метод
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    //метод доступа гетер
    public double getWeight() {
        return weight;
    }

    public void info() {
        System.out.println("Кличка: " + nickname + ", Вес: " + weight);
    }
}
