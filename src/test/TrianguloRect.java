package test;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        String areaStr = String.format("%.2f", calcularArea());
        String perStr = String.format("%.2f", calcularPerimetro());
        return "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + ", area: " + areaStr + ", perimetro: " + perStr + "\n";
    }
}
