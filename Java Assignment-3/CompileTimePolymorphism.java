class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }

    public void sound(String message) {
        System.out.println("Animal says: " + message);
    }

    public void sound(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Animal makes a sound.");
        }
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    public void sound(String message) {
        System.out.println("Dog says: " + message);
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    public void sound(String message) {
        System.out.println("Cat says: " + message);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.sound();
        animal1.sound("Hello");

        animal2.sound();
        animal2.sound("Woof");

        animal3.sound();
        animal3.sound("Meow");
    }
}
