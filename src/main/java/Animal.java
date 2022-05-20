public record Animal(AnimalType animalType) {

    public void feed() {
        System.out.printf("give %s kg meal %n", animalType.getKgMeat());
    }

    public void send() {
        if (animalType.isActive()) {
            System.out.printf(" Send this animal in village %n %n");
        } else {
            System.out.printf(" Send this animal in home %n %n");
        }
    }

    public void print() {
        System.out.printf(" It's a %s and it needs %s kg meal %n", animalType.getType(), animalType.getKgMeat());
        if (animalType.isActive()) {
            System.out.printf(" It's like play with u) %n");
        } else {
            System.out.printf(" It's like sit on your knees %n");
        }
    }
}