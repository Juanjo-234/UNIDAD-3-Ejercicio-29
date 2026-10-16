public class Circulo extends FiguraGeometrica{
    private double radio;
    private String color;

    public Circulo(String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String obtenerDetalle() {
        return "Círculo [Color: " + color + " | Radio: " + radio + "]";
    }
}
