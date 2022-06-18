package app;

public class Aviao extends Veiculo {
    
    private int numTurbinas;

    public Aviao(String nomeFabricante, String paisDeOrigemFabricante, String nome, int anoFabricacao, int capacidade, int numTurbinas) {
        super(nomeFabricante, paisDeOrigemFabricante, nome, anoFabricacao, capacidade);
        this.numTurbinas = numTurbinas;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }

    @Override
    public String acelerar(){
        return "O avião acelerou.";
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("O avião " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela " + super.fabricante.getNome() + " (" + super.getPaisDeOrigem() + ") utiliza " + numTurbinas + " turbinas e possui capacidade para " + super.capacidade + " pessoas.");
    }

    public String decolar(){
        return "O avião decolou.";
    }

    public String pousar(){
        return "O avião pousou.";
    }
    
}
