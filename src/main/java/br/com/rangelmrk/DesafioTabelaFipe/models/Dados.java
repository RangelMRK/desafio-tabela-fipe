package br.com.rangelmrk.DesafioTabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record Dados(@JsonAlias("codigo") String codigo,
                    @JsonAlias("nome") String nome) {

}
