package br.edu.infnet.appecommerce.model.domain;

import java.time.LocalDateTime;

public class Pedido {

    private int codigo;
    private String status;
    private LocalDateTime data;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return codigo + ";" + status + ";" + data;
    }

}
