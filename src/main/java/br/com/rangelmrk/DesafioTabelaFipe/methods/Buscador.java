package br.com.rangelmrk.DesafioTabelaFipe.methods;

import br.com.rangelmrk.DesafioTabelaFipe.models.*;
import br.com.rangelmrk.DesafioTabelaFipe.service.ConsumoApi;
import br.com.rangelmrk.DesafioTabelaFipe.service.ConverteDados;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Buscador {
    private Scanner input = new Scanner(System.in);
    private ConsumoApi consumoApi = new ConsumoApi();
    String opcao;
    private ConverteDados conversor = new ConverteDados();
    Opcoes opcoes = new Opcoes();

    public void buscaCarro(){
        System.out.println("""
                Olá bem vindo a consulta de Tabela Fipe
                """);
        opcoes.listarOpcoes();
        System.out.println("Escolha a opção de conversão que deseja realizar (1-3):");
        int inputOpcao = 0;

        try {
            inputOpcao = input.nextInt();
            if (inputOpcao < 1 || inputOpcao > 3) {
                System.out.println("Esta opção não é válida, por favor, escolha um número entre 1 e 3.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            input.next();
            return;
        }

        opcao = opcoes.getOpcao(inputOpcao);
        String endereco = "https://parallelum.com.br/fipe/api/v1/" + opcao +"/marcas";
        var jsonMontadoras = consumoApi.obterDados(endereco);



        List<CodigosMontadoras> montadoras = conversor.obterDados(jsonMontadoras, new TypeReference<List<CodigosMontadoras>>() {});

        for (CodigosMontadoras montadora : montadoras) {
            System.out.println("Código: " + montadora.codigo() + ", Nome: " + montadora.nome());
        }

        System.out.println("Digite o código da Montadora que deseja verificar o Modelo:");
        var inputMontadora = input.nextInt();

        endereco = "https://parallelum.com.br/fipe/api/v1/" + opcao +"/marcas/"+ inputMontadora +"/modelos";
        var jsonModelos = consumoApi.obterDados(endereco);

        RespostaModelos resposta = conversor.obterDados(jsonModelos, new TypeReference<RespostaModelos>() {});

        List<ModelosMontadoras> modelos = resposta.getModelos();

        for (ModelosMontadoras modelo : modelos) {
            System.out.println("Código: " + modelo.codigo() + ", Modelo: " + modelo.modelo());
        }

    }
}
