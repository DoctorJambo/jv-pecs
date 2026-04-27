package core.mate.academy.model;

public class Truck extends Machine {
    private boolean hasTrailer;

    public Truck() {
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
