/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrea
 */
public class ColeccionUsuarios {
    private List<Usuario> usuarios;
    
    public ColeccionUsuarios(){
        this.usuarios= new ArrayList<Usuario>();
    }

    /**
     * @return the usuarios
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    
    
    
}
