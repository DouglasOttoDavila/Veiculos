package app;

public class Aviao extends Veiculo {
    
    private int numTurbinas;

    Fabricante fabricante = new Fabricante();

    public Aviao(String nome, int anoFabricacao, int capacidade, int numTurbinas, String nomeFabricante, String paisDeOrigemFabricante) {
        super(nome, anoFabricacao, capacidade);
        this.numTurbinas = numTurbinas;
        fabricante.setNome(nomeFabricante);
        fabricante.setPaisDeOrigem(paisDeOrigemFabricante);
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String acelerar(){
        return "O avião acelerou.";
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("O avião " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela " + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza " + numTurbinas + " turbinas e possui capacidade para " + super.capacidade + " pessoas.");
    }

    public String decolar(){
        return "O avião decolou.";
    }

    public String pousar(){
        return "O avião pousou.";
    }
    
}
