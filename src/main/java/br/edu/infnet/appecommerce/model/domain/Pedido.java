package br.edu.infnet.appecommerce.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private int codigo;
    private String status;
    private LocalDateTime data;
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido() {

        data = LocalDateTime.now();
        status = "Aberto";
    }

    public Pedido(Cliente cliente) {

        this();
        this.cliente = cliente;
    }

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {

        return codigo + ";" + status + ";" + data + ";" + cliente + ";" + produtos.size();
    }
}
