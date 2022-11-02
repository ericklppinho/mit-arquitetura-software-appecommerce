package br.edu.infnet.appecommerce.model.domain;

public class Movel extends Produto {

    private String material;
    private boolean espelho;
    private float altura;
    private float comprimento;
    private float profundidade;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isEspelho() {
        return espelho;
    }

    public void setEspelho(boolean espelho) {
        this.espelho = espelho;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {

        return super.toString() + ";" + material + ";" + espelho + ";" + altura + ";" + comprimento + ";"
                + profundidade;
    }

}
