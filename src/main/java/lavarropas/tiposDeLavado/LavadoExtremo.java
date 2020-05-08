package lavarropas.tiposDeLavado;

public class LavadoExtremo extends TipoDeLavado {
    protected void iniciarLavado() {
        System.out.println("Iniciando ciclo de lavado Rapido Duracion 45 minutos");
        this.comenzarEnjuague();
        this.prepararLavado();
        System.out.println("iniciando ultimo ciclo..");
    }

    protected void centrifugar() {
        System.out.println("Iniciando centrifugado...");
        System.out.println("Tipo de centrifugado: suave");
    }
}
