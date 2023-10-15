package model;

public class Worker {
    private String name;
    private double salary;//оклад
    private double bonus;//премия

    public Worker() {
    }

    public Worker(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double generalSalary() {
        double res = 0.0;
        res = salary + bonus;
        return res;
    }

    public void info(){
        System.out.println("Имя: "+name+", оклад: "+salary+ ", премия: "+bonus+ ", итого: "+generalSalary());
    }
}
