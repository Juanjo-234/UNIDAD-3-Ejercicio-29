//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
FiguraGeometrica circulo = new Circulo("Rojo", 5.2);
FiguraGeometrica rectangulo = new Rectangulo("Azul", 4.0, 7.5);

System.out.println("Area del circulo: " + circulo.calcularArea());
System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());


System.out.println("Area del rectnagulo: " + rectangulo.calcularArea());
System.out.println("Perimetro del rectnagulo: " + rectangulo.calcularPerimetro());

}
