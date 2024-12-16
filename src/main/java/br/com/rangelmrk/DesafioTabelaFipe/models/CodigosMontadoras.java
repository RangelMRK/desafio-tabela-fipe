package br.com.rangelmrk.DesafioTabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CodigosMontadoras(@JsonAlias("codigo") Integer codigo,
                                @JsonAlias("nome") String nome) {
}
