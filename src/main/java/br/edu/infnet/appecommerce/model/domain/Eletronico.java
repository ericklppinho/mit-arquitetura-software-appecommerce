package br.edu.infnet.appecommerce.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "eletronico")
public class Eletronico extends Produto {

    private int voltagem;
    private boolean bivolt;
    private float altura;
    private float comprimento;
    private float profundidade;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public boolean isBivolt() {
        return bivolt;
    }

    public void setBivolt(boolean bivolt) {
        this.bivolt = bivolt;
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

        return super.toString() + ";" + voltagem + ";" + bivolt + ";" + altura + ";" + comprimento + ";" + profundidade;
    }

}
