public class Wild extends Animal{
    public Wild(AnimalType animalType) {
        super("Wild", true,animalType);
        if (animalType.getType() == "Cat"){
            animalType.setType("Cat");
            animalType.setKgMeat(0.6);
        } else {
            animalType.setType("Dog");
            animalType.setKgMeat(1.2);
        }
    }
}
