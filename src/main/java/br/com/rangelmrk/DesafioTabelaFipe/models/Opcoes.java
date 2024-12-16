package br.com.rangelmrk.DesafioTabelaFipe.models;

import java.util.HashMap;
import java.util.Map;

public class Opcoes {

    private final Map<Integer, String> menu;

    public Opcoes() {
        menu = new HashMap<>();
        menu.put(1, "carros");
        menu.put(2, "motos");
        menu.put(3, "caminhoes");
    }

    public String getOpcao(int chave) {
        return menu.get(chave);
    }

    public void listarOpcoes() {
        System.out.println("""
                **** OPÇÕES ****
                
                1.Carro
                
                2.Moto
                
                3.Caminhão
                
                """);
    }
}
