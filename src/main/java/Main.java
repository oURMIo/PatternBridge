public class Main {
    public static void all(Animal animal){
        animal.print();
        animal.feed();
        animal.send();
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();

        cat.print();
        cat.feed();
        cat.send();

        all(cat);
//        all(dog);
    }
}