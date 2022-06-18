package app;

public class Barco extends Veiculo {
    
    private int numVelas;


    public Barco(String nomeFabricante, String paisDeOrigemFabricante, String nome, int anoFabricacao, int capacidade, int numVelas) {
        super(nomeFabricante, paisDeOrigemFabricante, nome, anoFabricacao, capacidade);
        this.numVelas = numVelas;
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    public String icarVelas(){
        return "O barco está com as velas içadas.";
    }

    public String recolherVelas(){
        return "Velas recolhidas.";
    }

    @Override
    public String acelerar(){
        return "O barco acelerou.";
    }

    /* public void mostrarDetalhes(){
        System.out.println("O barco " + Veiculo.getNome());
        
    } */

}
