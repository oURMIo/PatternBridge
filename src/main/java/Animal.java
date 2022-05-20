public class Animal {
    private AnimalType animalType;

    private String name;
    private boolean act;
    private double meal;

    public Animal(AnimalType animalType) {
        this.name = animalType.getType();
        this.act = animalType.isActive();
        this.meal = animalType.getKgMeat();
    }

    public void feed(){
        System.out.printf("give %s kg meal %n",meal);
    }

    public void send() {
        if (act) {
            System.out.printf(" Send this animal in village %n %n");
        } else {
            System.out.printf(" Send this animal in home %n %n");
        }
    }

    public void print(){
        System.out.printf(" It's a %s and it needs %s kg meal %n",name,meal);
        if (act){
            System.out.printf(" It's like play with u) %n");
        } else {
            System.out.printf(" It's like sit on your knees %n");
        }
    }
}