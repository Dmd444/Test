package test;

public abstract class Figura2D implements FiguraPlana {

    public Figura2D() {
        System.out.println("Se imprime una FiguraPlana...\n");
    }

    protected abstract String imprimeFigura();
}
