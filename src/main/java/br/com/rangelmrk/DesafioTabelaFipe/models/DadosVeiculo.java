package br.com.rangelmrk.DesafioTabelaFipe.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(@JsonAlias("CodigoFipe") String codigoFipe,
                           @JsonAlias("Marca") String montadora,
                           @JsonAlias("Modelo") String modeloVeiculo,
                           @JsonAlias("AnoModelo") Integer anoVeiculo,
                           @JsonAlias("Valor") String valor,
                           @JsonAlias("Combustivel") String combustivel) {
}
