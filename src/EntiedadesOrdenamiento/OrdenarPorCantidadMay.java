/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntiedadesOrdenamiento;

import Entidades.Usuario;
import java.util.Comparator;

/**
 *
 * @author mario
 */
public class OrdenarPorCantidadMay implements Comparator<Usuario> {
    
        @Override
    public int compare(Usuario p1, Usuario p2) {
        return Double.compare(p2.cantLibros, p1.cantLibros);
        
    }
    
}
