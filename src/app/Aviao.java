package app;

public class Aviao extends Veiculo {
    
    private int numTurbinas;

    public Aviao(String nome, int anoFabricacao, int capacidade, int numTurbinas, Fabricante fabricante) {
        super(nome, anoFabricacao, capacidade, fabricante);
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
        System.out.println("O avião " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela " + super.fabricante.getNome() + " (" + super.fabricante.getPaisDeOrigem() + ") utiliza " + numTurbinas + " turbinas e possui capacidade para " + super.capacidade + " pessoas.");
    }

    public String decolar(){
        return "O avião decolou.";
    }

    public String pousar(){
        return "O avião pousou.";
    }
    
}
