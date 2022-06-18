package app;

public class App {
    public static void main(String[] args) throws Exception {
        

        Aviao aviao = new Aviao("Boeing", "EUA","747", 1990, 100, 4);

	    System.out.println(aviao.decolar());
        System.out.println(aviao.acelerar());
        System.out.println(aviao.pousar());
        aviao.mostrarDetalhes();

    }
}
