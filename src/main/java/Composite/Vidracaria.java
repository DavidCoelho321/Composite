package Composite;


public class Vidracaria {

    private ConjuntoJanela vidracaria;

    public void setConjunto(ConjuntoJanela vidracaria) {
        this.vidracaria = vidracaria;
    }

    public String getVidracaria() {
        if (this.vidracaria == null) {
            throw new NullPointerException("Conjunto sem Vidro");
        }
        return this.vidracaria.getConjuntoJanela();
    }
}
