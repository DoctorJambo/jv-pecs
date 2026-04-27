package core.mate.academy.model;

public class Excavator extends Machine {
    private boolean hasBucket;

    public Excavator() {
    }

    public boolean isHasBucket() {
        return hasBucket;
    }

    public void setHasBucket(boolean hasBucket) {
        this.hasBucket = hasBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
