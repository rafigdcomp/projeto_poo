
package Classes;

import java.io.FileNotFoundException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class DadosDeLogin {
    private int mxusuarios = 150;
    private Usuario novousuario[] = new Usuario[mxusuarios];
    
    private int contausr = 0;
    
    public DadosDeLogin() throws FileNotFoundException{
        Usuario novousuarios = new Usuario("111111","Rubem","22502","123","3");
        novousuario[contausr] = novousuarios;
        contausr++;
        
    }
    public Usuario[] getUsuarios(){
        return novousuario;
    }
    public boolean validaUsuarios(String usuario, String senha) throws FileNotFoundException{

        ConexaoBD conexao = new ConexaoBD();
        String[][] usuarios;
        usuarios = conexao.getUsuarios();
        
        for (int i = 0; i < 150; i++) {
            //System.out.print(Arrays.toString(usuarios[i]));
            if(!"[null, null]".equals(Arrays.toString(usuarios[i]))) {
                if(usuarios[i][0].equals(usuario) && usuarios[i][1].equals(senha))
                    return true;
            }
            
        }
        
//        boolean a = false;;;
//        for(int x=0; x<contausr; x++){
//            if(novousuario[x].getNomeusuario().equals(usuario) && novousuario[x].getSenha1usuario().equals(senha)){
//                return true;
//            }
//            
//        }
//        return false;
            return false;
        
        }
    
       public int verUsuario(String usuario){
        
        for(int x=0; x<contausr; x++){
            if(novousuario[x].getNomeusuario().equals(usuario)){
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
       
    
    

