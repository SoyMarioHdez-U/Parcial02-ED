/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author mario
 */
public class Usuario {
    public String nombre;
    public String carnet;
    public String rol;
    public int cantLibros;
    
    public ArrayList<Libros> listaLibros;
    
    public Usuario(String pNombre, String pCarnet, String pRol, int pCantLibros)
    {
        this.nombre = pNombre;
        this.carnet = pCarnet;
        this.rol = pRol;
        this.cantLibros = pCantLibros;
        this.listaLibros = new ArrayList<>();
        
    }
  
    
    
}
