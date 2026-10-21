// Plant implementerar interfacet LiquidAble
// Men eftersom Plant är en abstrakt klass lämnar den över
// ansvaret till underklasserna.
public abstract class Plant implements LiquidAble {

    // Inkapsling: Dessa fält är privata och då är växtens data skyddad från direkt åtkomst
    // utifrån klassen. Getters används för att läsa värden.
    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    // Getters är public och ger därmed kontrollerad åtkomst
    // till de privata variablerna name och height.
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public abstract Liquid getLiquid();

}