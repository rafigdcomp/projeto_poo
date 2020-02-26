/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Vinicius
 */
public class Estoque {

    private String[][] dados;
    
    public Estoque() {
        String nomeArquivo = "C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\produtos.txt";
        FileReader arquivoDados;
        BufferedReader leituraArquivo;
        String dados;
        String produtos[][] = new String[150][3];
        try {
            arquivoDados = new FileReader(nomeArquivo);
            leituraArquivo = new BufferedReader(arquivoDados);
            dados = leituraArquivo.readLine();
          
            
            int contador = 0;
            while (dados != null) {
                String dadosSplit[] = dados.split("-");
                produtos[contador] = dadosSplit;
               
                dados = leituraArquivo.readLine();
                
                contador++;
            }
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
        this.dados = produtos;
    }
    
    public String[][] getDados() {
        return this.dados;
    }
    
    public void setDados(String[][] dados) {
        try {
            FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\produtos.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            
            this.dados = dados;
            String dadosString = "";
            for(int i = 0; i < dados.length; i++) {
                if(dados[i][0] != null)
                    gravarArq.printf(dados[i][0]+"-"+dados[i][1]+"-"+dados[i][2]+"\n");
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
    }
    
    
}
