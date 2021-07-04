package javaDemo;

public class main {
    public static void main(String[] args) {
        Parent parent = new Parent("DAD");
        parent.printInfo();

        Child child = new Child("SON",5);
        child.printInfo();


    }
}

class Parent {
    protected String name;

    public Parent(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("I am Parent. My name is:" + name + "\n");
    }
}

class Child extends Parent {

    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void printInfo() {
        System.out.println("I am Child. My name is:" + super.name + " I am" + age + ".\n");
    }
}