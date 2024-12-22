import java.util.ArrayList;

interface Animal {
    void Sound(); 

    default void eat() { 
        System.out.println("Eating...");
    }
}

class Dog implements Animal {
    @Override
    public void Sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal {
    @Override
    public void Sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        var dog = new Dog();
        var cat = new Cat();
        var animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        for (var animal : animals) {
            animal.Sound(); 
            animal.eat();       
        }
    }
}
