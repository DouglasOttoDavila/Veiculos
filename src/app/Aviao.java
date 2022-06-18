package app;

public class Aviao extends Veiculo {
    
    private int numTurbinas;
    private boolean voo;
    private boolean acelerado;

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
        if (acelerado == true) {
            return "O avião já encontra-se com aceleração máxima.";
        } else {
            acelerado = true;
            return "O avião acelerou.";
        }
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("| Ficha Técnica da Aeronave:");
        System.out.println("| O avião " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela " + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza " + numTurbinas + " turbinas e possui capacidade para " + super.capacidade + " pessoas.");
    }

    public String decolar(){
        if (voo == true) {
            return "O avião já encontra-se em vôo.";
        } else {
            voo = true;
            return "O avião decolou.";
        }
    }

    public String pousar(){ 
        if (voo != true) {
            return "O avião já encontra-se no solo.";
        } else {
            voo = false;
            return "O avião pousou.";
        }
    }
    
}
