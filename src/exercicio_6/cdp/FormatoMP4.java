/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_6.cdp;

/**
 *
 * @author Ricardo
 */
public class FormatoMP4 extends AbstractFormatoReader {
    @Override
    protected int getArquivo(String arquivo) {
        System.out.println("[AVI] Obtendo frames do arquivo " + arquivo);
        return 32;
    }

    @Override
    protected void getLegenda(String legenda) {
        System.out.println("[AVI] Obtendo legendas do arquivo " + legenda);
    }

    @Override
    protected void reproduzirArquivo(int frame) {
        System.out.printf("    [AVI] Reproduzindo frame %d de %d\n", frame, numeroFrames);     
        System.out.println("   [AVI] Legenda");
    }

    @Override
    protected void finalizaReproducao() {
        System.out.println("[AVI] Finalizando reprodução");
    }
    
}
