/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Vinicius
 */
public class Produto {
    
    private double id;
    private String nome;
    private double valor;
    private int quantidade;
    private int quantidadeDisponivel;
    
    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        
        this.quantidadeDisponivel = 10;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public int getQuantidade() {
        return this.quantidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getQuantidadeDisponivel() {
        return this.quantidadeDisponivel;
    }
    
}
