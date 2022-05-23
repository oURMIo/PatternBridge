public class Wild extends Animal{
    public Wild(AnimalType animalType) {
        super("Wild", true);
        animalType.setType("Cat");
        animalType.setKgMeat(0.6);
    }
}
