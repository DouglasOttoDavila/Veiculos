package app;

public class Automovel extends Veiculo {

    private int diametroRoda;
    private boolean portaMalas;
    private boolean acelerado;

    public Automovel(String nome, int anoFabricacao, int capacidade, int diametroRoda, String nomeFabricante,
            String paisDeOrigemFabricante) {
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
    public String acelerar() {
        if (acelerado == true) {
            return "O automóvel já encontra-se com aceleração máxima.";
        } else {
            acelerado = true;
            return "O automóvel acelerou.";
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("| Ficha Técnica do Automóvel: ");
        System.out
                .println("| O automóvel " + super.getNome() + ", ano " + super.getAnoFabricacao() + ", produzido pela "
                        + fabricante.getNome() + " (" + fabricante.getPaisDeOrigem() + ") utiliza rodas aro "
                        + diametroRoda + " e possui capacidade para " + super.capacidade + " ocupantes.");
    }

    public String abrirPortaMalas() {
        if (portaMalas == true) {
            return "O porta-malas já está aberto.";
        } else {
            portaMalas = true;
            return "O porta-malas foi aberto.";
        }

    }

}
