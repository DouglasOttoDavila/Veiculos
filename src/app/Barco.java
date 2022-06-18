package app;

public class Barco extends Veiculo {
    
    private int numVelas;
    private boolean statusVelas;
    private boolean acelerado;

    Fabricante fabricante = new Fabricante();

    public Barco(String nome, int anoFabricacao, int capacidade, int numVelas, Fabricante fabricante) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.numVelas = numVelas;
    }

    public Barco(String nome, int anoFabricacao, int capacidade, int numVelas, String nomeFabricante, String paisDeOrigemFabricante) {
        super(nome, anoFabricacao, capacidade);
        this.numVelas = numVelas;
        fabricante.setNome(nomeFabricante);
        fabricante.setPaisDeOrigem(paisDeOrigemFabricante);
    }

    public int getNumVelas() {
        return numVelas;
    }

    public void setNumVelas(int numVelas) {
        this.numVelas = numVelas;
    }

    public String icarVelas(){
        if (statusVelas == true){
            return "O barco já está com as velas içadas.";
        } else {
            return "O barco içou as velas.";
        }
    }

    public String recolherVelas(){
        if (statusVelas != true){
            return "O barco já está com as velas recolhidas.";
        } else {
            return "O barco recolheu as velas.";
        }
    }

    @Override
    public String acelerar(){
        if (acelerado == true){
            return "O barco já está em aceleração máxima.";
        } else {
            return "O barco acelerou.";
        }
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("| Ficha Técnica da Embarcação:");
        System.out.println("| O barco " + super.getNome() + ", com casco fabricado em " + super.getAnoFabricacao() + " pelo Estaleiro " + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza " + numVelas + " velas e possui capacidade para até " + super.capacidade + " tripulantes.");
    }

}
