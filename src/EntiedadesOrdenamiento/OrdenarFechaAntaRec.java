/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntiedadesOrdenamiento;
import java.util.Comparator;
import Entidades.Libros;


/**
 *
 * @author 50360
 */
public class OrdenarFechaAntaRec implements Comparator<Libros>{
    @Override
     public int compare(Libros p1, Libros p2) {
            return p1.fecha.compareTo(p2.fecha);
         }
    
}
