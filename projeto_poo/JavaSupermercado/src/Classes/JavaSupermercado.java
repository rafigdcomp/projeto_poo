
package Classes;

import Formularios.frmLogin;
import java.io.FileNotFoundException;

public class JavaSupermercado {

    public static void main(String[] args) throws FileNotFoundException {
        DadosDeLogin classedados = new DadosDeLogin();
        
        frmLogin Login = new frmLogin();
        Login.setDadosDeLogin(classedados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);

    }
    
}
