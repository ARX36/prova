package biblioteca;

public class Main {

    public static void main(String[] args) {
        Llibre llibrePrincipal = new Llibre(
                "El Quixot",
                "Miguel de Cervantes",
                10,
                19.95f
        );

        gestionarLlibre(llibrePrincipal, 3);
    }

    public static void gestionarLlibre(Llibre llibre, int quantitat) {
        llibre.mostrarDades();
        llibre.prestarLlibre(quantitat);
        llibre.retornarLlibre(quantitat);
        llibre.mostrarDades();
    }
}
