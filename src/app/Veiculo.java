package app;

public abstract class Veiculo {

    protected String nome;
    protected int anoFabricacao;
    protected int capacidade;
    protected Fabricante fabricante;

    public Veiculo(){
        this.fabricante = new Fabricante(nome, nome);
    }

    public Veiculo (String nome, int anoFabricacao, int capacidade){
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
        this.fabricante = new Fabricante(nome, nome);
    }

    public Veiculo(String nome, int anoFabricacao, int capacidade, Fabricante fabricante) {    
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.capacidade = capacidade;
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

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public abstract String acelerar();

    public void mostrarDetalhes(){
        
    }
    
    
    
}
