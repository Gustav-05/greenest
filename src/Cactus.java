class Cactus extends Plant {

    private static final double SPARKLING_WATER_PER_DAY = 2;

    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public Liquid getLiquid() {
        return Liquid.SPARKLING_WATER;
    }

    @Override
    public double calculateLiquid() {
        return SPARKLING_WATER_PER_DAY;
    }

    @Override
    public void printLiquid() {
        System.out.println(getName() + " behöver " + calculateLiquid() +  " " + getLiquid() + " cl per dag");
    }


}
