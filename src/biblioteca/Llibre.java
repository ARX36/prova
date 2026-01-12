package biblioteca;

/**
 * Classe que representa un llibre d'una biblioteca.
 */
public class Llibre {

    private String titol;
    private String autor;
    private int exemplars;
    private float preu;

    /**
     * Constructor de la classe Llibre.
     */
    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    public void prestarLlibre(int quantitat) {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
        }
    }

    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
    }

    public void mostrarDades() {
        System.out.println("Títol: " + titol);
        System.out.println("Autor: " + autor);
        System.out.println("Exemplars: " + exemplars);
        System.out.println("Preu: " + preu + " €");
    }
}
