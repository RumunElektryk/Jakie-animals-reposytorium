abstract class Animal {
    private String name;
 
    public Animal(String name) {
this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void describe() {
        System.out.println("Jestem zwierzęciem o imieniu " + name);
    }
 
    abstract public void makeSound();
}
 
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
 
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
 
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
 
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
 
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Burek");
        Animal cat = new Cat("Mruczek");
 
        dog.describe();
        dog.makeSound();
 
        cat.describe();
        cat.makeSound();
    }
}