
package Classes;


public class DadosDeLogin {
    private int mxusuarios = 150;
    private Usuario novousuario[] = new Usuario[mxusuarios];
    
    private int contausr = 0;
    
    public DadosDeLogin(){
        Usuario novousuarios = new Usuario("111111","Rubem","22502","123","123","2");
        novousuario[contausr] = novousuarios;
        contausr++;
        
    }
    public Usuario[] getUsuarios(){
        return novousuario;
    }
    public boolean validaUsuarios(String usuario, String senha){
        boolean a = false;
        for(int x=0; x<contausr; x++){
            if(novousuario[x].getCodusuario().equals(usuario) && novousuario[x].getSenha1usuario().equals(senha)){
                return true;
            }
            
        }
        return false;
        
        }
       public int verUsuario(String usuario){
        
        for(int x=0; x<contausr; x++){
            if(novousuario[x].getCodusuario().equals(usuario)){
                return x;
            }
            
        }
        return -1;
      }
       public String CadastraUsuarios(Usuario maisUsr){
           if(contausr == mxusuarios){
              return "NÃO HÁ MAIS ESPAÇO PARA CADASTRAR USUARIOS";
           }else{
              novousuario[contausr]= maisUsr;
              contausr++;
              return "USUÁRIO CADASTRADO";
           }
       }
}
       
    
    

