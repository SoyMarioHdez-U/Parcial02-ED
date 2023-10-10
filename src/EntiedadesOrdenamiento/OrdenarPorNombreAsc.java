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
public class OrdenarPorNombreAsc implements Comparator<Usuario>{
    
    @Override
    public int compare(Usuario p1, Usuario p2) {
        return p1.nombre.compareTo(p2.nombre);
    }
    
    
}
