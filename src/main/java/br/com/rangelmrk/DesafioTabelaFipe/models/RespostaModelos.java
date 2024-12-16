package br.com.rangelmrk.DesafioTabelaFipe.models;

import java.util.List;

public class RespostaModelos {
    private List<ModelosMontadoras> modelos;
    private List<Object> anos; // Pode ser ajustado dependendo do que é necessário


    public List<ModelosMontadoras> getModelos() {
        return modelos;
    }

    public void setModelos(List<ModelosMontadoras> modelos) {
        this.modelos = modelos;
    }

    public List<Object> getAnos() {
        return anos;
    }

    public void setAnos(List<Object> anos) {
        this.anos = anos;
    }
}
