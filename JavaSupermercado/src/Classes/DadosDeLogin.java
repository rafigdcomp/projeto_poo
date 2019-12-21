
package Classes;


public class DadosDeLogin {
    public boolean validaUsuarios(String usuario, String senha){
        if(usuario.equals("supermercado") && senha.equals("ufspoo2019")){
            return true;
        }else{
            return false;
        }
    }
    
}
