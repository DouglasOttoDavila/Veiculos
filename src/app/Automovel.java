package app;

public class Automovel extends Veiculo {
    
    public Automovel(String nome, int anoFabricacao, int capacidade, int diametroRoda, Fabricante fabricante) {
        super(nome, anoFabricacao, capacidade, fabricante);
        this.diametroRoda = diametroRoda;
    }

    private int diametroRoda;

    public int getDiametroRoda() {
        return diametroRoda;
    }

    public void setDiametroRoda(int diametroRoda) {
        this.diametroRoda = diametroRoda;
    }

    /* public void String acelerar(){
        System.out.
    } */

    public void mostrarDetalhes(){
        
    }

    @Override
    public String acelerar() {
        // TODO Auto-generated method stub
        return null;
    }

}
