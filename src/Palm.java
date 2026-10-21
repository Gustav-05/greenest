// Palm ärver egenskaper och metoder från Plant
class Palm extends Plant {

    private static final double TAP_WATER_PER_METER = 0.5;

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.TAP_WATER;
    }

    @Override
    public double calculateLiquid() {
        return TAP_WATER_PER_METER * getHeight();
    }

    @Override
    public String printLiquid() {
        return super.printLiquid() + " liter per dag";

    }
}




