/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.claseprimaria;


import edu.ujmd.clases.Boxeador;
/**
 *
 * @author ddera
 */
public class EduUjmdClasePrimaria {
    
    public static void main(String[] args) {
        
       Boxeador bo;
       
       bo= new Boxeador();
      
        System.out.println("Ingrese informacion ");
        bo.IngresarDatos();
        
        System.out.println("Los datos del boxeador son los siguientes");
        bo.MostrarDatos();
        
    }
    
}
