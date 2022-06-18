package app;

public class Fabricante {
    
    private String nome;
    private String paisDeOrigem;
  
    public Fabricante() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return nome + "(" + paisDeOrigem + ")";
    }


}
