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
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
