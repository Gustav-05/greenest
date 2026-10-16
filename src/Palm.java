// Palm ärver egenskaper och metoder från Plant
class Palm extends Plant {

    public Palm(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.TAP_WATER;
    }

    @Override
    public double calculateLiquid() {
        return 0.5 * getHeight();
    }

    @Override
    public void printLiquid() {
        System.out.println(getName() + " behöver " + calculateLiquid() +  " " + getLiquid() + " liter per dag");

    }
}




