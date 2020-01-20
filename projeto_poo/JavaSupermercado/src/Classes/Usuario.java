
package Classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Usuario {
    private String codusuario;
    private String funcaousuario;
    private String nomeusuario;
    private String matusuario;
    private String senha1usuario;
    private String combousuario;

    public Usuario(String codusuario, String funcaousuario, String nomeusuario, String matusuario, String senha1usuario) {
        this.codusuario = codusuario;
        this.funcaousuario = funcaousuario;
        this.nomeusuario = nomeusuario;
        this.matusuario = matusuario;
        this.senha1usuario = senha1usuario;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void salvarNovoUsuario() throws FileNotFoundException, IOException {
        String dadosAtualizados = "";
        String stringNovoUsuario = this.codusuario+"-"+this.funcaousuario+"-"+this.nomeusuario+"-"+this.matusuario+"-"+this.senha1usuario;
        dadosAtualizados = stringNovoUsuario;
        
        String nomeArquivo = "C:\\Users\\Vinicius\\Documents\\UFS\\projetos\\projeto_poo\\projeto_poo\\JavaSupermercado\\src\\database\\usuarios.txt";
        FileReader arquivoDados = new FileReader(nomeArquivo);
        BufferedReader leituraArquivo = new BufferedReader(arquivoDados);
        String dados = leituraArquivo.readLine();
        
        while (dados != null) {
            dadosAtualizados += dados;
            dados = leituraArquivo.readLine();
        }
        
        System.out.print(dados);
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
