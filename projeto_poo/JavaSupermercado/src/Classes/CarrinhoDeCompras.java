package Classes;

import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinicius
 */
public class CarrinhoDeCompras {
    
    private List<Produto> produtos;
    private double valorTotal;
    private String formaPagamento;
    
    public CarrinhoDeCompras() {}
    public CarrinhoDeCompras(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public Produto getProduto(int i) {
        //Verificar se o produto existe
        return new Produto("maca", 2, 10);
    }
    
    public boolean addProduto(int idProduto, int quantidade) {
        try {
            //this.produtos.add(getProduto(idProduto));
            this.produtos.add(new Produto("maca", 2, 10));
            return true;
        } catch(Exception e) {
            return false;
        }
    }
    
    private void removeProduto(int i) {
        this.produtos.remove(i);
    }
    
    public List<Produto> getProdutos() {
        return this.produtos;
    }
    
    private double getValorTotal() {
        atualizarValorTotal();
        return this.valorTotal;
    }
    
    public double finalizarCompra() {
        atualizarValorTotal();
        double valorFinal = this.valorTotal;
        if(this.formaPagamento.equals("dinheiro")) {
            valorFinal = valorFinal * 0.10f;
        }
        return valorFinal;
    }
    
    public double atualizarValorTotal() {
        double valorTotal = 0;
        for(int i = 0; i < this.produtos.size(); i++) {
            valorTotal = valorTotal + this.produtos.get(i).getValor();
        }
        this.valorTotal = valorTotal;
        return valorTotal;
    }
    
  
}
