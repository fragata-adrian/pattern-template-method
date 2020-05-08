package lavarropas.tiposDeLavado;

public class LavadoNormal extends TipoDeLavado {
    @Override
    protected void iniciarLavado() {
        System.out.println("Iniciando ciclo de lavado Normal Duracion 30 minutos");
    }

    @Override
    protected void centrifugar() {
        System.out.println("Iniciando centrifugado...");
        System.out.println("Tipo de centrifugado: suave");
    }
}
