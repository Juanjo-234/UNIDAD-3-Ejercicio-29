public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    private String color;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public String obtenerDetalle() {
        return "Rectángulo [Color: " + color + " | Base: " + base + " | Altura: " + altura + "]";
    }
}
