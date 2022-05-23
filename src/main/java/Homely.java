public class Homely extends Animal{
    public Homely(AnimalType animalType) {
        super("Homely",false);
        animalType.setType("Cat");
        animalType.setKgMeat(0.6);
    }
}
