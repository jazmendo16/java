/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.lang.reflect.Array.get;
import static javax.swing.UIManager.get;

/**
 *
 * @author yeymi
 */
public class Cliente extends Persona { 
    private String nit; 

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
        
        
        
    }
    
    /**
     *
     */
    public void agregar (){
    System.out.println("Nit; " + getNit());
    System.out.println("Nombres: " + this.getNombre());
    System.out.println("Direccion: " + get.Direccion ());
    System.out.println("Telefono :" + get.Telefono());
    System.out.println("Fecha Nacimiento :" + get.Fecha_nacimiento());




    

    
        
        
        
        
    }

    
    
}
