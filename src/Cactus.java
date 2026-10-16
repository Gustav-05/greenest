class Cactus extends Plant {

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.SPARKLING_WATER;
    }

    @Override
    public double calculateLiquid() {
        return 2;
    }

    @Override
    public void printLiquid() {
        System.out.println(getName() + " behöver " + calculateLiquid() +  " " + getLiquid() + " cl per dag");
    }


}
