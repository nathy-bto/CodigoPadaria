package br.edu.ifba.saj.ads.poo;

import java.util.List;

public class Padaria {
    private String nome;
    private List<Fregues> freguesia;
    private Fregues fregues;
    private List<Produtos> produtosPadaria;
    private Produtos produtos;

    

    public Padaria(String nome) {
        this.nome = nome;
    }

    //metodo para verificar autenticação do fregues
    //passo como parametro String email e String senha
    public boolean IsAutenticado(String email, String senha){
        //uso um for each
        for (Fregues fregues : freguesia) {
            //pego o email do fregues (fregues.getEmail) e senha (fregues.getSenha) faço um equals
            if (fregues.getEmail().equals(email) && fregues.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    //metodo para cadastrar fregues na padaria
    //mas so se ele tiver email e senha
    public void adicionarFregues(String email, String senha, Fregues fregues) {
        //verifica se ele esta autenticado
        if (IsAutenticado(email, senha)) {
            freguesia.add(fregues);
        }
     //autenticacao invalida
    }

    //metodo para cadastrar produtos na padaria
    public void adicionarProduto(Produtos produto){
        produtosPadaria.add(produto);
        produto.incrementarEstoque(0);
    }

    //pedido de encomenda
    //subtrai a quantidade daquele produto no estoque 
    //debitar da conta do usuario
    public void encomedarProduto(Produtos produto, Fregues fregues){
        if ((produto.getEstoque() > 0) && (fregues.getSaldo() >= produtos.getValor())) {
            fregues.debitarValor(produtos.getValor());
            //subtrai a quantidade daquele produto no estoque
            produto.decrementarEstoque(0);
        }
    }

    private Produtos encontrarProdutos(String nome){
        for (Produtos produto : produtosPadaria) {
            if ((produto.getNome().equalsIgnoreCase(nome) || produto.getCodigo().equalsIgnoreCase(nome))) {
                return produto;
            }
        }
        return null;
    }

}
