public class Main {
    public static void all(Animal animal){
        animal.print();
        animal.feed();
        animal.send();
    }

    public static void main(String[] args) {
        Animal cat = new Animal(new Cat());
        Animal dog = new Animal(new Dog());

        all(cat);
        all(dog);
    }
}