package Composite;


public abstract class ConjuntoJanela {

    private String conjuntojan;

    public ConjuntoJanela(String conjuntojan) {
        this.conjuntojan = conjuntojan;
    }

    public String getConjuntojan() {
        return conjuntojan;
    }

    public void setConjuntojan(String conjuntojan) {
        this.conjuntojan = conjuntojan;
    }

    public abstract String getConjuntoJanela();
}
