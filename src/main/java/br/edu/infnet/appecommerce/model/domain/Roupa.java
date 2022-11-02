package br.edu.infnet.appecommerce.model.domain;

public class Roupa extends Produto {

    private String tamanho;
    private String cor;
    private String genero;
    private boolean estampada;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isEstampada() {
        return estampada;
    }

    public void setEstampada(boolean estampada) {
        this.estampada = estampada;
    }

    @Override
    public String toString() {

        return super.toString() + ";" + tamanho + ";" + cor + ";" + genero + ";" + estampada;
    }

}
