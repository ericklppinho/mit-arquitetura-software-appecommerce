package br.edu.infnet.apiusuario.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "eletronico")
public class Eletronico extends Produto {

    private static final String TYPE = "eletronico";

    private int voltagem;
    private boolean bivolt;
    private float altura;
    private float comprimento;
    private float profundidade;

    @Override
    public String getType() {
        return TYPE;
    }

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

        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException ex) {
        }

        return null;
    }

}
