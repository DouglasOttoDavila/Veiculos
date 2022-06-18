package app;

public abstract class Veiculo {

    protected String nome;
    protected int anoFabricacao;
    protected int capacidade;
    protected String nomeFabricante;
    protected String paisDeOrigemFabricante;

    Fabricante fabricante = new Fabricante(nomeFabricante, paisDeOrigemFabricante);

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public Veiculo(String nomeFabricante, String paisDeOrigemFabricante, String nome, int anoFabricacao, int capacidade) {    
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
        this.nomeFabricante = nomeFabricante;
        this.paisDeOrigemFabricante = paisDeOrigemFabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract String acelerar();

    public void mostrarDetalhes(){
        
    }

    public String getPaisDeOrigem() {
        return null;
    }
    
    
    
}
