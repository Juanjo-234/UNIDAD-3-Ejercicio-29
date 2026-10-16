public abstract class FiguraGeometrica {
private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String obtenerColor() {
        return color;
    }
}
