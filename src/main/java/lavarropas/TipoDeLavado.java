package lavarropas;

import lavarropas.tiposDeLavado.TipoDeLavado;

public abstract class Lavado {

    public void lavar() {
        this.prepararLavado();
        this.iniciarLavado();
        this.comenzarEnjuague();
        this.centrifugar();
    }

    private void prepararLavado() {
        System.out.println("Comenzando carga de agua..");
    }

    private void comenzarEnjuague() {
        System.out.println("Lavado terminado. Comenzando enjuague..");
    }

    protected abstract void iniciarLavado();

    protected abstract void centrifugar();
}
