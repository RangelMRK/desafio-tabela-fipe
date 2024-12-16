package br.com.rangelmrk.DesafioTabelaFipe.models;

import java.util.List;

public class RespostaModelos {
    private List<Dados> modelos;
    private List<Object> anos;


    public List<Dados> getModelos() {
        return modelos;
    }

    public void setModelos(List<Dados> modelos) {
        this.modelos = modelos;
    }

    public List<Object> getAnos() {
        return anos;
    }

    public void setAnos(List<Object> anos) {
        this.anos = anos;
    }
}
