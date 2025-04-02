public class Animal {
    String spices;
    String type;
    String age;
    String colour;
    String sound;
    String name;

    Animal(String spices, String type, String age, String colour, String sound) {
        this.spices = spices;
        this.type = type;
        this.age = age;
        this.colour = colour;
        this.sound = sound;
    }

    void animalEat() {

        System.out.println("Aniaml : Having Food");
    }

    void animalSleep() {

        System.out.println("Aniaml : Sleeping");
    }

    void animalAwake() {

        System.out.println("Animal : Just Woke Up");
    }

    void animalWalk() {

        System.out.println("Aniaml : Just Walking");
    }

    void animalFly() {

        System.out.println("Animal : Flying");
    }

    void aniamlDetails() {
        System.out.println("Which Spices: " + spices);
        System.out.println("Animal Type : " + type);
        System.out.println("How Old is : " + age);
        System.out.println("Animal Color: " + colour);
        System.out.println("What Sound Produce: " + sound);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the pet shop");
        Animal cat = new Animal("Cat", "Persian", "2 months", "brown", "Meow");
        Animal dog = new Animal("Dog", "Husky", "1 month", "black", "Bow-Bow");
        Animal bird = new Animal("Bird", "Parrot", "15 days", "Green", "Whisle");
        cat.animalEat();
        cat.aniamlDetails();
        dog.animalSleep();
        bird.animalFly();
    }
}
