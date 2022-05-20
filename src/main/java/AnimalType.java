public class AnimalType {
    private final String type;
    private final boolean active;
    private final double kgMeat;

    public AnimalType(String type, boolean active, double kgMeat) {
        this.type = type;
        this.active = active;
        this.kgMeat = kgMeat;
    }

    //getters
    public String getType() {
        return type;
    }
    public boolean isActive() {
        return active;
    }
    public double getKgMeat() {
        return kgMeat;
    }
}