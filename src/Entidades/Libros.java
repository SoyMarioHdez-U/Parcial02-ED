/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author mario
 */
public class Libros {
    public String nombrelibro;
    public Date fecha;
    public String idioma;
    
    public Libros(String pNombrelibro,String pIdioma, Date pFecha )
    {
        this.nombrelibro = pNombrelibro;
        this.idioma = pIdioma;
        this.fecha = pFecha;
    }
    
    
}
