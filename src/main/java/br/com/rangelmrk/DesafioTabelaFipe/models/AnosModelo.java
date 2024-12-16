package br.com.rangelmrk.DesafioTabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record AnosModelo(@JsonAlias("codigo") String ano,
                         @JsonAlias("nome")String modelo) {
}
