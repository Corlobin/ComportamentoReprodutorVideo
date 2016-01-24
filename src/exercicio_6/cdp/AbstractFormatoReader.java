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
public abstract class AbstractFormatoReader {
    protected int numeroFrames;
    protected abstract int getArquivo(String arquivo);
    protected abstract void getLegenda(String legenda);
    protected abstract void reproduzirArquivo(int frame);
    protected abstract void finalizaReproducao();
    
    public final void start(String arquivo, String legenda) {
        this.numeroFrames = getArquivo(arquivo);
        this.getLegenda(legenda);
        int frameAtual = 0;
        while (frameAtual != this.numeroFrames) {
            reproduzirArquivo(frameAtual);
            frameAtual += 1;
        }
        this.finalizaReproducao();
    }
    
     public int getNumeroFrames() {
        return numeroFrames;
    }

}
