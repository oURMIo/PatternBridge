public class Animal {

    private AnimalType animalType;

    public void feed(){
        System.out.printf("give %s kg meat",animalType.kgMeat);
    }

    public void send() {
        if (animalType.active) {
            System.out.printf("     Send this animal in village %n %n");
        } else {
            System.out.printf("     Send this animal in home %n %n");
        }
    }

    public void print(){
        animalType.getInfo();
    }
}
