package br.edu.infnet.apipedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "movel")
public class Movel extends Produto {

    private String material;
    private boolean espelho;
    private float altura;
    private float comprimento;
    private float profundidade;

    private static final String TYPE = "movel";

    @Override
    public String getType() {
        return TYPE;
    }

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

        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException ex) {
        }

        return null;
    }

}
