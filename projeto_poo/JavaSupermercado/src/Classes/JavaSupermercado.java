
package Classes;

import Formularios.frmLogin;

public class JavaSupermercado {

    public static void main(String[] args) {
        DadosDeLogin classedados = new DadosDeLogin();
        
        frmLogin Login = new frmLogin();
        Login.setDadosDeLogin(classedados);
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);

    }
    
}
