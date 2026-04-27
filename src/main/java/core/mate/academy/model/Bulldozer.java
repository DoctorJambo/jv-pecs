package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasBlade;
    private String typeOfUndercarriage;

    public Bulldozer() {
    }

    public boolean isHasBlade() {
        return hasBlade;
    }

    public void setHasBlade(boolean hasBlade) {
        this.hasBlade = hasBlade;
    }

    public String getTypeOfUndercarriage() {
        return typeOfUndercarriage;
    }

    public void setTypeOfUndercarriage(String typeOfUndercarriage) {
        this.typeOfUndercarriage = typeOfUndercarriage;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
