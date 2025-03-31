public class Fruits {
    String fruitName;
    String fruitType;
    String fruitColour;
    String fruitVitamin;
    String fruitFlavour;

    Fruits() {
        System.out.println(" Which fruits are you looking for ? ");
    }

    Fruits(String fruitName, String fruitType, String fruitColour, String fruitVitamin, String fruitFlavour) {
        this.fruitName = fruitName;
        this.fruitType = fruitType;
        this.fruitColour = fruitColour;
        this.fruitVitamin = fruitVitamin;
        this.fruitFlavour = fruitFlavour;
    }

    void fruitStartedBuddingStage() {

        System.out.println("Fruits Begins with Budding Process");
    }

    void fruitStartedFloweringStage() {

        System.out.println("Fruits Begins with Flowering Process");
    }

    void fruitStartedDevlopingStage() {
        System.out.println("Fruits Begins with Development Process");
    }

    void fruitReadyForConsume() {
        System.out.println("Fruit is  ready to eat");
    }

    void fruitDetails() {
        System.out.println("Fruit Name: " + fruitName);
        System.out.println("Fruit Type: " + fruitType);
        System.out.println("Fruit colour: " + fruitColour);
        System.out.println("Fruit vitamin: " + fruitVitamin);
        System.out.println("Fruit flavour: " + fruitFlavour);
    }

    public static void main(String[] args) {
        Fruits fruits = new Fruits();
        Fruits apple = new Fruits("Apple", "all season", "red", "vitamin C", "sweet and mild sour");
        Fruits blackberry = new Fruits("blackberry", "monsoon season", "blackpurple", "vitamin c & a", "sour");
        Fruits watermelon = new Fruits("watermelon", "summer season", "green and red", "vitamin c & a", "Sweet");
        apple.fruitDetails();
        apple.fruitReadyForConsume();
        watermelon.fruitDetails();
        watermelon.fruitReadyForConsume();
    }


}
