package lavarropas;

import lavarropas.tiposDeLavado.LavadoExtremo;
import lavarropas.tiposDeLavado.LavadoNormal;
import lavarropas.tiposDeLavado.LavadoRapido;
import lavarropas.tiposDeLavado.TipoDeLavado;

public class Lavarropa {

    public void iniciarLavado(TipoDeLavado tipo) {
        tipo.lavar();
    }

    public static void main(String[] args) {
        Lavarropa l = new Lavarropa();
        TipoDeLavado normal = new LavadoNormal();
        TipoDeLavado rapido = new LavadoRapido();
        TipoDeLavado extremo = new LavadoExtremo();

        l.iniciarLavado(normal);
    }
}
