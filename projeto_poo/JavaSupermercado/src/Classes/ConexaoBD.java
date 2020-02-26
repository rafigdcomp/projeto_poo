/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Vinicius
 */
public class ConexaoBD {

    private String[][] users;
    
    
    public ConexaoBD() throws FileNotFoundException {
        
    }
        
    public String[][] getUsuarios() {
        //Obter os dados a partir do arquivo
        
        String nomeArquivo = "C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\usuarios.txt";
        FileReader arquivoDados;
        BufferedReader leituraArquivo;
        String dados;
        String usuarios[][] = new String[150][5];

        
        try {
            arquivoDados = new FileReader(nomeArquivo);
            leituraArquivo = new BufferedReader(arquivoDados);
            dados = leituraArquivo.readLine();
          
            
            int contador = 0;
            while (dados != null) {
                String dadosSplit[] = dados.split("-");
                usuarios[contador] = dadosSplit;
               
                dados = leituraArquivo.readLine();
                
                contador++;
            }
           
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
        

        return usuarios;
    
    }
    
    public String[][] getProdutos() {
        String nomeArquivo = "C:\\Users\\Vinicius\\Documents\\projeto_poo-20200111T013731Z-001\\projeto_poo\\JavaSupermercado\\src\\database\\produtos.txt";
        FileReader arquivoDados;
        BufferedReader leituraArquivo;
        String dados;
        String usuarios[][] = new String[150][3];

  
        try {
            arquivoDados = new FileReader(nomeArquivo);
            leituraArquivo = new BufferedReader(arquivoDados);
            dados = leituraArquivo.readLine();
           

            
            int contador = 0;
            while (dados != null) {
                String dadosSplit[] = dados.split("-");
                usuarios[contador] = dadosSplit;
               
                dados = leituraArquivo.readLine();
                
                contador++;
            }
           
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
        

        return usuarios;
    }
    
}


