
package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Usuario {
    private String codusuario;
    private String funcaousuario;
    private String nomeusuario;
    private String matusuario;
    private String senha1usuario;
    private String combousuario;
    
    private String[][] dados;

    public Usuario(String codusuario, String funcaousuario, String nomeusuario, String matusuario, String senha1usuario) {
        this.codusuario = codusuario;
        this.funcaousuario = funcaousuario;
        this.nomeusuario = nomeusuario;
        this.matusuario = matusuario;
        this.senha1usuario = senha1usuario;
        
        init();
    }

    public Usuario() {
//           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        init();
    }
    
    private void init() {
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
        this.dados = usuarios;
    }
    
    public void salvarNovoUsuario() throws FileNotFoundException, IOException {
         try {
            FileWriter arq = new FileWriter("C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\usuarios.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            
            //this.dados = dados;
            String[][] dados = this.dados;
            String dadosString = "";
            for(int i = 0; i < dados.length; i++) {
                if(dados[i][0] != null)
                    gravarArq.printf(dados[i][0]+"-"+dados[i][1]+"-"+dados[i][2]+"-"+dados[i][3]+"-"+dados[i][4]+"\n");
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro ao abrir o arquivo: %s.\n", e.getMessage());
        }
    }

    public String getCodusuario() {
        return this.codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }
    
    public String getFuncaoUsuario() {
        return this.funcaousuario;
    }

    public void setFuncaoUsuario(String funcaousuario) {
        this.funcaousuario = funcaousuario;
    }

    public String getNomeusuario() {
        return this.nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getMatusuario() {
        return this.matusuario;
    }

    public void setMatusuario(String matusuario) {
        this.matusuario = matusuario;
    }

    public String getSenha1usuario() {
        return this.senha1usuario;
    }

    public void setSenha1usuario(String senha1usuario) {
        this.senha1usuario = senha1usuario;
    }
    
    public String getCombousuario() {
        return this.combousuario;
    }

    public void setCombousuario(String combousuario) {
        this.combousuario = combousuario;
    }
}
