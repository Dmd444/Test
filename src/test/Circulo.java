package test;

public class Circulo extends FiguraCircular {

    public Circulo(int radio) {
        super(radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String imprimeFigura() {
        String areaStr = String.format("%.2f", calcularArea());
        String perStr = String.format("%.2f", calcularPerimetro());
        return "Se imprime un Circulo con radio: " + radio + ", area: " + areaStr + ", perimetro: " + perStr;
    }
}
