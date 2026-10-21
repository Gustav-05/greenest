class Carnivorous extends Plant {

    private static final double PROTEIN_SHAKE_PER_METER = 0.2;
    private static final double PROTEIN_SHAKE_BASIC_LEVEL = 0.1;

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.PROTEIN_SHAKE;
    }

    @Override
    public double calculateLiquid() {
        return PROTEIN_SHAKE_BASIC_LEVEL + (PROTEIN_SHAKE_PER_METER * getHeight());
    }

    @Override
    public String printLiquid() {
        return super.printLiquid() + " liter per dag";
    }

}
