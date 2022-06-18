package app;

public class Automovel extends Veiculo {

    private int diametroRoda;

    public Automovel(String nome, int anoFabricacao, int capacidade, int diametroRoda, Fabricante fabricante) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.diametroRoda = diametroRoda;
    }

    public Automovel(String nome, int anoFabricacao, int capacidade, int diametroRoda, String nomeFabricante, String paisDeOrigemFabricante) {
        super(nome, anoFabricacao, capacidade);
        this.diametroRoda = diametroRoda;
        fabricante.setNome(nomeFabricante);
        fabricante.setPaisDeOrigem(paisDeOrigemFabricante);
    }

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    @Override
    public String acelerar(){
        return "O automóvel acelerou.";
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("O automóvel " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela " + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza rodas de " + diametroRoda + " polegadas e possui capacidade para " + super.capacidade + " pessoas.");
    }

    public String abrirPortaMalas(){
        return "O porta-malas foi aberto.";
    }

}
