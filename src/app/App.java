package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        Fabricante fabricante = new Fabricante("Boeing","EUA");
        Aviao aviao = new Aviao("747", 1990, 500, 4, fabricante);

	    System.out.println(aviao.decolar());
        System.out.println(aviao.acelerar());
        System.out.println(aviao.pousar());
        aviao.mostrarDetalhes();

    }
}
