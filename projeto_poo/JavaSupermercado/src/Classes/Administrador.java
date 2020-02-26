/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileNotFoundException;
import java.util.Arrays;

/**
 *
 * @author Vinicius
 */
public class Administrador extends Usuario {
 
    private int nivelAcesso;
    
    public Administrador() {}
    public Administrador(int id) throws FileNotFoundException {
        //Referenciando o nivel de acesso
       
        
        ConexaoBD conexao = new ConexaoBD();
        String[][] usuarios;
        usuarios = conexao.getUsuarios();
        
        for (int i = 0; i < 150; i++) {
            //System.out.print(Arrays.toString(usuarios[i]));
            System.out.print(Arrays.toString(usuarios[i]));
            if(!"[null, null, null, null, null]".equals(Arrays.toString(usuarios[i]))) {;;
                if(usuarios[i][0].equals(id))
                    this.nivelAcesso = Integer.valueOf(usuarios[i][2]);// usuarios[i][2];
            }
            
        }
    }
    
    public int getNivelAcesso() {
        return this.nivelAcesso;
    }
    
    public String getRelatoriosVendas() {
        return "";
    }
    
}
