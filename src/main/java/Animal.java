public class Animal {
    AnimalType animalType;
    private static String character;
    private static boolean active;

    public Animal(String character,boolean active){
        Animal.character = character;
        Animal.active = active;
    }

    public void feed() {
        System.out.printf("give %s kg meal %n", animalType.getKgMeat());
    }

    public void send() {
        if (active) {
            System.out.printf(" This animal is %s and send in village %n %n",character);
        } else {
            System.out.printf(" This animal is %s and send in home %n %n",character);
        }
    }

    public void print() {
        System.out.printf(" It's a %s and it needs %s kg meal %n. /// %s ///", animalType.getType(), animalType.getKgMeat(),character);
    }
}