public class AnimalType {
    public final String type;
    public final boolean active;
    public final double kgMeat;

    public AnimalType(String type, boolean active, double kgMeat) {
        this.type = type;
        this.active = active;
        this.kgMeat = kgMeat;
    }

    public void getInfo(){
        System.out.printf(" It's a %s and it needs %s kg meat %n",type,kgMeat);
        if (active){
            System.out.printf(" It's like play with u) %n %n");
        } else {
            System.out.printf(" It's like sit on your knees %n %n");
        }
    }
}
