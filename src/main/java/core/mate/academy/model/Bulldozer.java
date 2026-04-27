package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean hasBlade;
    private String typeOfUndercarriage;

    public Bulldozer() {
    }

    public Bulldozer(boolean hasBlade, String typeOfUndercarriage) {
        this.hasBlade = hasBlade;
        this.typeOfUndercarriage = typeOfUndercarriage;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
