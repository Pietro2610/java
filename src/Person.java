public class Person {

    public String name;
    public int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("I like pizza");
    }

    public void walk() {
        System.out.println("I like walking");
    }

    public void sayHello() {
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + age);
    }
}
