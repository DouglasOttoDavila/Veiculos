## Questão (8,0) - Neste desafio, você deve programar uma solução orientada a objetos utilizando Java. Desenvolva um código claro e eficiente. Sua tarefa como desenvolvedor, consiste em implementar a estrutura de classes apresentada neste diagrama:

https://i.ibb.co/2jqRCfL/Screenshot-62.jpg

## Implemente as classes e relacionamentos especificados no diagrama considerando atendendo aos seguintes pontos:

1) Atente as relações que acontecem com a classe veículo para que o sistema funcione corretamente.
2) Todos os atributos devem ser definidos como públicos, protegidos ou privados, além de possuir os métodos de acesso (get / set).
3) A classe veículo representa uma classe abstrata, e deve ter os métodos Acelerar e Mostrar .
4) Cada veículo possui um Fabricante, por exemplo: Boeing, Fiat, etc. Um Fabricante, por sua vez, possui um país de origem (Ex: Boeing é uma empresa dos Estados Unidos).
5) O método acelerar, deve exibir mensagens especificas conforme a classe, por exemplo:
“O automóvel acelerou”.
“O avião acelerou”.
“O barco acelerou”.
6) O método AbrirPortaMalas de Carro deve exibir a mensagem na tela: “O porta malas do carro foi aberto”.
7) O método Decolar, da classe Aviao deve exibir a mensagem na tela: “O avião decolou”. Já o método Pousar, deve exibir a mensagem: “O avião pousou”;
8) O método IcarVelas, da classe Barco deve exibir a mensagem na tela: “O barco está com as velas içadas”. Já o método RecolherVelas, deve exibir a mensagem: “Velas recolhidas”;
9) O método MostrarDetalhes, deve ter um comportamento diferente em cada classe e, apresentar TODOS os atributos envolvidos na classe herdeira bem como os herdados da classe base. Exemplo onde os itens sublinhados representam os valores armazenados nos atributos: O avião 737, ano 1990, produzido pela Boeing (Estados Unidos) utiliza 24 turbinas e possui capacidade para 200 pessoas.
10) Crie um programa main para testar as classes. Nele, crie 2 objetos para cada classe herdeira e defina as informações específicas (se necessário, pesquise especificidades de barcos, aviões e automóveis para criar objetos diferentes). Faça a chamada dos métodos para mostrar o correto funcionamento dos objetos.
