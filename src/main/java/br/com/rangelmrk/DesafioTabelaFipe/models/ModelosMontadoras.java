package br.com.rangelmrk.DesafioTabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ModelosMontadoras(@JsonAlias("codigo") Integer codigo,
                                @JsonAlias("nome") String modelo) {
}
