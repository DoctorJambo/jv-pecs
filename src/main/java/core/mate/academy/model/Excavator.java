package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasBucket;

    public Excavator() {
    }

    public Excavator(boolean hasBucket) {
        this.hasBucket = hasBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
