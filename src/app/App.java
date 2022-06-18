package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Utilidades u = new Utilidades();
        Scanner scan = new Scanner(System.in);

        int opcao = 0;

        while (opcao >= 0) {
            u.limparTela();
            System.out.println("| Sistema de Controle de Veículos 1.0");
            System.out.println("| Escolha um tipo de veículo...");
            System.out.println("| 1 - Avião");
            System.out.println("| 2 - Automóvel");
            System.out.println("| 3 - Barco");
            System.out.println("| 4 - Sair");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    u.limparTela();
                    System.out.println("| Painel de Controle: Avião");
                    System.out.println("| Nome/Modelo: ");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Fabricante: ");
                    String fabricante = scan.nextLine();
                    u.limparTela();
                    System.out.println("| País de Origem : ");
                    String pais = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Ano de Fabricação : ");
                    int ano = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Capacidade (máxima): ");
                    int capacidade = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Quantidade de Turbinas: ");
                    int turbinas = scan.nextInt();
                    u.limparTela();

                    Aviao aviao = new Aviao(nome, ano, capacidade, turbinas, fabricante, pais);

                    while (opcao >= 0) {
                        u.limparTela();
                        System.out.println("| Escolha uma ação...");
                        System.out.println("| 1 - Acelerar");
                        System.out.println("| 2 - Mostrar detalhes e Status");
                        System.out.println("| 3 - Decolar");
                        System.out.println("| 4 - Pousar");
                        System.out.println("| 5 - Voltar");
                        opcao = scan.nextInt();
                        switch (opcao) {
                            case 1:
                                u.limparTela();
                                System.out.println(aviao.acelerar());
                                u.aguardaInput();
                                break;
                            case 2:
                                u.limparTela();
                                aviao.mostrarDetalhes();
                                aviao.atualizarStatus();
                                aviao.mostrarStatus();
                                u.aguardaInput();
                                break;
                            case 3:
                                u.limparTela();
                                System.out.println(aviao.decolar());
                                u.aguardaInput();
                                break;
                            case 4:
                                u.limparTela();
                                System.out.println(aviao.pousar());
                                u.aguardaInput();
                                break;
                            case 5:
                                u.limparTela();
                                System.out.println("Voltando ao menu anterior...");
                                opcao = -1;
                                u.aguardaInput();
                                break;
                            default:
                                u.limparTela();
                                System.out.println("Opção inválida!");
                                u.aguardaInput();
                                break;
                        }
                    }
                    opcao = 0;
                    break;
                case 2:
                    u.limparTela();
                    System.out.println("| Painel de Controle: Automóvel");
                    System.out.println("| Nome/Modelo: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Fabricante: ");
                    fabricante = scan.nextLine();
                    u.limparTela();
                    System.out.println("| País de Origem : ");
                    pais = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Ano de Fabricação : ");
                    ano = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Capacidade (máxima): ");
                    capacidade = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Tamanho das Rodas (polegadas): ");
                    int diametroRoda = scan.nextInt();
                    u.limparTela();

                    Automovel automovel = new Automovel(nome, ano, capacidade, diametroRoda, fabricante, pais);

                    while (opcao >= 0) {
                        u.limparTela();
                        System.out.println("| Escolha uma ação...");
                        System.out.println("| 1 - Acelerar");
                        System.out.println("| 2 - Mostrar detalhes");
                        System.out.println("| 3 - Abrir Porta-Malas");
                        System.out.println("| 4 - Voltar");
                        opcao = scan.nextInt();
                        switch (opcao) {
                            case 1:
                                u.limparTela();
                                System.out.println(automovel.acelerar());
                                u.aguardaInput();
                                break;
                            case 2:
                                u.limparTela();
                                automovel.mostrarDetalhes();
                                u.aguardaInput();
                                break;
                            case 3:
                                u.limparTela();
                                System.out.println(automovel.abrirPortaMalas());
                                u.aguardaInput();
                                break;
                            case 4:
                                u.limparTela();
                                System.out.println("Voltando ao menu anterior...");
                                opcao = -1;
                                u.aguardaInput();
                                break;
                            default:
                                u.limparTela();
                                System.out.println("Opção inválida!");
                                u.aguardaInput();
                                break;
                        }
                    }
                    opcao = 0;
                    break;
                case 3:
                    u.limparTela();
                    System.out.println("| Painel de Controle: Barco");
                    System.out.println("| Nome/Modelo: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Fabricante: ");
                    fabricante = scan.nextLine();
                    u.limparTela();
                    System.out.println("| País de Origem : ");
                    pais = scan.nextLine();
                    u.limparTela();
                    System.out.println("| Ano de Fabricação : ");
                    ano = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Capacidade (máxima): ");
                    capacidade = scan.nextInt();
                    u.limparTela();
                    System.out.println("| Quantidade de Velas: ");
                    int velas = scan.nextInt();
                    u.limparTela();

                    Barco barco = new Barco(nome, ano, capacidade, velas, fabricante, pais);

                    while (opcao >= 0) {
                        u.limparTela();
                        System.out.println("| Escolha uma ação...");
                        System.out.println("| 1 - Acelerar");
                        System.out.println("| 2 - Mostrar detalhes");
                        System.out.println("| 3 - Içar Velas");
                        System.out.println("| 4 - Recolher Velas");
                        System.out.println("| 5 - Voltar");
                        opcao = scan.nextInt();
                        switch (opcao) {
                            case 1:
                                u.limparTela();
                                System.out.println(barco.acelerar());
                                u.aguardaInput();
                                break;
                            case 2:
                                u.limparTela();
                                barco.mostrarDetalhes();
                                u.aguardaInput();
                                break;
                            case 3:
                                u.limparTela();
                                System.out.println(barco.icarVelas());
                                u.aguardaInput();
                                break;
                            case 4:
                                u.limparTela();
                                System.out.println(barco.recolherVelas());
                                u.aguardaInput();
                                break;
                            case 5:
                                u.limparTela();
                                System.out.println("Voltando ao menu anterior...");
                                opcao = -1;
                                u.aguardaInput();
                                break;
                            default:
                                u.limparTela();
                                System.out.println("Opção inválida!");
                                u.aguardaInput();
                                break;
                        }
                    }
                    opcao = 0;
                    break;
                case 4:
                    u.limparTela();
                    System.out.println("Sistema encerrado!");
                    opcao = -1;
                    u.aguardaInput();
                    break;
                default:
                    u.limparTela();
                    System.out.println("Opção inválida!");
                    u.aguardaInput();
            }
        }

        scan.close();

    }
}
