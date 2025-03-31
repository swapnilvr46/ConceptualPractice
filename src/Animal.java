public class Animal {
    String animalSpices;
    String animalType;
    String animalAge;
    String animalColour;
    String animalSound;

    public Animal() {
        System.out.println("Welcome to the pet shop");
    }
    Animal(String spices,String type, String age,String colour,String sound){
        this.animalSpices = spices;
        this.animalType = type;
        this.animalAge = age;
        this.animalColour = colour;
        this.animalSound = sound;
    }
    void animalEat(){
        System.out.println("Aniaml : Having Food");
    }
    void animalSleep(){
        System.out.println("Aniaml : Sleeping");
    }
    void animalAwake(){
        System.out.println("Animal : Just Woke Up");
    }
    void animalWalk(){
        System.out.println("Aniaml : Just Walking");
    }
    void animalFly(){
        System.out.println("Animal : Flying");
    }
    void aniamlDetails(){
        System.out.println("Which Spices: "+animalSpices);
        System.out.println("Animal Type : "+animalType);
        System.out.println("How Old is : "+animalAge);
        System.out.println("Animal Color: "+animalColour);
        System.out.println("What Sound Produce: "+animalSound);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Animal("Cat","Persian","2 months","brown","Meow");
        Animal dog = new Animal("Dog","Husky","1 month","black","Bow-Bow");
        Animal bird = new Animal("Bird","Parrot","15 days","Green","Whisle");
        cat.animalEat();
        cat.aniamlDetails();
        dog.animalSleep();
        bird.animalFly();
    }

}
