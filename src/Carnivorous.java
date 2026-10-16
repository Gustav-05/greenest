class Carnivorous extends Plant {

    public Carnivorous(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.PROTEIN_SHAKE;
    }

    @Override
    public double calculateLiquid() {
        return 0.1 + (0.2 * getHeight());
    }

    @Override
    public void printLiquid() {
        System.out.println(getName() + " behöver " + calculateLiquid() +  " " + getLiquid() + " liter per dag");
    }

}
