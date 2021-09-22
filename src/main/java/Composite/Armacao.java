package Composite;


public class Armacao {

    private ConjuntoJanela armacao;

    public void setConjunto(ConjuntoJanela armacao) {
        this.armacao = armacao;
    }

    public String getArmacao() {
        if (this.armacao == null) {
            throw new NullPointerException("Conjunto sem Armação");
        }
        return this.armacao.getConjuntoJanela();
    }
}