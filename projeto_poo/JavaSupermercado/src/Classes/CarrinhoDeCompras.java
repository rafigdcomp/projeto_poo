package Classes;

import java.util.List;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
public final class CarrinhoDeCompras {
    
    private List<Produto> produtos;
    private double valorTotal;
    private String formaPagamento;
    
    private String[][] dados;
    
    public CarrinhoDeCompras() {
        init();
    }
    public CarrinhoDeCompras(List<Produto> produtos) {
        this.produtos = produtos;
        init();
    }
    
    public void init() {
        String nomeArquivo = "C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\produtos.txt";
        FileReader arquivoDados;
        BufferedReader leituraArquivo;
        String dados2;
        String produtos2[][] = new String[150][3];
        try {
            arquivoDados = new FileReader(nomeArquivo);
            leituraArquivo = new BufferedReader(arquivoDados);
            dados2 = leituraArquivo.readLine();
          
            
            int contador = 0;
            while (dados2 != null) {
                String dadosSplit[] = dados2.split("-");
                produtos2[contador] = dadosSplit;
               
                dados2 = leituraArquivo.readLine();
                
                contador++;
            }
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
        this.dados = produtos2;
    }
    
    public Produto getProduto(String nomeProduto) {
        for(int i = 0; i < this.dados.length; i++) {
            //System.out.println(this.dados[i][0] +"<----->" + nomeProduto);
            if(this.dados[i][0] == null ? nomeProduto == null : this.dados[i][0].equals(nomeProduto))
                return new Produto(dados[i][0], Double.valueOf(dados[i][1]), Integer.valueOf(dados[i][2]));
        }
        return new Produto("Nao localizado", 0, 0);
    }
        
   
    public boolean addProduto(String idProduto, int quantidade) {
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
    
    public double getValorTotal() {
        //System.out.print(this.dados[0].toString());
        this.atualizarValorTotal();
        return this.valorTotal;
    }
    
    public double finalizarCompra() {
        this.atualizarValorTotal();
        double valorFinal = this.valorTotal;
        if(this.formaPagamento.equals("dinheiro")) {
            valorFinal = valorFinal * 0.10f;
        }
        return valorFinal;
    }
    
    public double atualizarValorTotal() {
        double total = 0;
        for(int i = 0; i < this.produtos.size(); i++) {
            total = total + this.produtos.get(i).getValor();
        }
        this.valorTotal = total;
        return total;
    }
    
  
}
