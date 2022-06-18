package app;

public class Aviao extends Veiculo {

    private int numTurbinas;
    private boolean voo;
    private boolean acelerado;
    private String statusAcel;
    private String statusVoo;

    Fabricante fabricante = new Fabricante();

    public Aviao(String nome, int anoFabricacao, int capacidade, int numTurbinas, String nomeFabricante,
            String paisDeOrigemFabricante) {
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
    public String acelerar() {
        if (acelerado == true) {
            return "O avião já encontra-se com aceleração máxima.";
        } else {
            acelerado = true;
            return "O avião acelerou.";
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("| Ficha Técnica da Aeronave:");
        System.out.println("| O avião " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela "
                + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza " + numTurbinas
                + " turbina(s) e possui capacidade para " + super.capacidade + " passageiros.");
    }

    public void atualizarStatus(){
        if (acelerado == true){
            statusAcel = "ATIVA";
        } else {
            statusAcel = "INATIVA";
        }
        if (voo == true) {
            statusVoo = "EM VÔO";
        } else {
            statusVoo = "EM SOLO";
        }
    }

    public void mostrarStatus() {
        System.out.println("| Status da Aeronave");
        System.out.println("| Estado Atual: " + statusVoo);
        System.out.println("| Aceleração: " + statusAcel);  
    }

    public String decolar() {
        if (voo == true) {
            return "O avião já encontra-se em vôo.";
        } else if (voo != true && acelerado != true) {
            return "O avião não pode decolar antes de ser acelerado.";
        } else {
            voo = true;
            return "O avião decolou.";
        }
    }

    public String pousar() {
        if (voo != true) {
            return "O avião já encontra-se no solo.";
        } else {
            voo = false;
            return "O avião pousou.";
        }
    }

}
