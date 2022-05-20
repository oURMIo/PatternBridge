public class Animal {
    private AnimalType animalType;

    private String name;
    private boolean act;
    private double meal;

    public Animal(Cat cat) {
        this.name = cat.getType();
        this.act = cat.isActive();
        this.meal = cat.getKgMeat();
    }
    public Animal(Dog dog){
        this.name = dog.getType();
        this.act = dog.isActive();
        this.meal = dog.getKgMeat();
    }

    public void feed(){
        System.out.printf("give %s kg meat",meal);
    }

    public void send() {
        if (act) {
            System.out.printf("     Send this animal in village %n %n");
        } else {
            System.out.printf("     Send this animal in home %n %n");
        }
    }

    public void print(){
        System.out.printf(" It's a %s and it needs %s kg meat %n",name,meal);
        if (act){
            System.out.printf(" It's like play with u) %n %n");
        } else {
            System.out.printf(" It's like sit on your knees %n %n");
        }
    }
}