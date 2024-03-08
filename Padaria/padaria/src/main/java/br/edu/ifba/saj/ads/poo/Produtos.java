package br.edu.ifba.saj.ads.poo;

public class Produtos {
    private String nome;
    private String codigo;
    private int quantidade;
    private double valor;
    private int estoque;

    public Produtos(String nome, String codigo, int quantidade, double valor) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    //metodo para incrementar estoque
    public void incrementarEstoque(int estoque){
        this.estoque++;
    }

    //metodo para decrementar estoque
    public void decrementarEstoque(int estoque){
        if (estoque > 0) {
            this.estoque--;
        }
        // estoque = estoque - estoque;
    }

}
