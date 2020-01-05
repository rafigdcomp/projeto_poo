
package Classes;


public class Usuario {
    private String codusuario;
    private String nomeusuario;
    private String matusuario;
    private String senha1usuario;
    private String combousuario;

    public Usuario(String codusuario, String nomeusuario, String matusuario, String senha1usuario,String senha2usuario,String combousuario) {
        this.codusuario = codusuario;
        this.nomeusuario = nomeusuario;
        this.matusuario = matusuario;
        this.senha1usuario = senha1usuario;
        this.combousuario = combousuario;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getMatusuario() {
        return matusuario;
    }

    public void setMatusuario(String matusuario) {
        this.matusuario = matusuario;
    }

    public String getSenha1usuario() {
        return senha1usuario;
    }

    public void setSenha1usuario(String senha1usuario) {
        this.senha1usuario = senha1usuario;
    }

    public String getCombousuario() {
        return combousuario;
    }

    public void setCombousuario(String combousuario) {
        this.combousuario = combousuario;
    }
    
    
    
}
