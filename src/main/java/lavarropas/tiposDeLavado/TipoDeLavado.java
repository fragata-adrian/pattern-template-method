package lavarropas.tiposDeLavado;

public abstract class TipoDeLavado {

    public void lavar() {
        this.prepararLavado();
        this.iniciarLavado();
        this.comenzarEnjuague();
        this.centrifugar();
        System.out.println("Fin del lavado!");
    }

    protected void prepararLavado() {
        System.out.println("Comenzando carga de agua..");
    }

    protected void comenzarEnjuague() {
        System.out.println("Lavado terminado. Comenzando enjuague..");
    }

    protected abstract void iniciarLavado();

    protected abstract void centrifugar();
}
