import model.Animal;
import model.Person;
import model.Worker;

public class Main {
    public static void main(String[] args) {
        new Person();//создание объекта класса Person, однако при таком создании объекта мы в
        // дальнейшем не можем с ним взаимодействовать, так как нет ссылки указывающей на этот объект

        //создание объекта и запись его адреса в переменную ссылку person1
        Person person1 = new Person();
        person1.name = "Igor";
        person1.age = 35;
        System.out.println("Имя: " + person1.name + ", возраст: " + person1.age);

        Animal animal1 = new Animal();
        animal1.nickname = "Myrzik";
        animal1.setWeight(5.5);
        System.out.println("Вес: " + animal1.getWeight());

        animal1.info();

        Animal animal2 = new Animal();
        animal2.info();

        Animal animal3 = new Animal("Kesha",0.5);
        animal3.info();

        System.out.println("================================================");

        Worker worker1 = new Worker();
        worker1.info();
        worker1.setName("Misha");
        worker1.setSalary(1000);
        worker1.setBonus(500);
        worker1.info();

        Worker worker2 = new Worker("Grisha", 1500, 700);
        worker2.info();

    }
}
