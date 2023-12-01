package br.com.contas.demo.dto;

import java.util.List;

public class ItemDTO {


    private String codigo;
    private Float preco;
    private Boolean pizza;
    private String tamanho;
    private String extra;
    private String remove;
    private List<Long> sabor;

    public ItemDTO() {
    }

    public ItemDTO(String codigo, Float preco, Boolean pizza, String tamanho, String extra, String remove, List<Long> sabor) {
        this.codigo = codigo;
        this.preco = preco;
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.extra = extra;
        this.remove = remove;
        this.sabor = sabor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public Boolean getPizza() {
        return pizza;
    }

    public void setPizza(Boolean pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getRemove() {
        return remove;
    }

    public void setRemove(String remove) {
        this.remove = remove;
    }

    public List<Long> getSabor() {
        return sabor;
    }

    public void setSabor(List<Long> sabor) {
        this.sabor = sabor;
    }
}
