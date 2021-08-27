/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.clases;


import java.util.Scanner;
/**
 *
 * @author ddera
 */
public class Boxeador extends Atleta{
    
    private Scanner B;
    private String Nombre;
    private String Apellido;
    private int Identificacion;
    private float Peso;
    private String Categoria;
    
    public Boxeador()
    {
        
    }
    
        public String getNombre()
        {
            return Nombre;
        }
        
        public String getApellid()
        {
            return Apellido;
        }
        
        public int getIdentificacion()
        {
            return Identificacion;
        }
        
        public float getPeso()
        {
            return Peso;
        }
        
        public String Categoria()
        {
            return Categoria;
        }
        
        
        public void setNombre(String Nombre)
        {
            this.Nombre = Nombre;
        }
        
        public void setApellido(String Apellido)
        {
            this.Apellido = Apellido;
        }
        
        public void setIdentificacion(int Identificacion)
        {
            this.Identificacion = Identificacion;
        }
        
        public void setPeso(float Peso)
        {
            this.Peso =  Peso;
        }
        
        public void setCategoria(String Categoria)
        {
            this.Categoria = Categoria;
        }
        
        public void IngresarDatos()
        {
        System.out.println("Digite el nombre de boxeador");
        Nombre = B.next();
        System.out.println("Ingrese el apellido de boxeador");
        Apellido = B.next();
        System.out.println("Ingrese el numero de identificacion");
        Identificacion=B.nextInt();
        System.out.println("Ingrese la categoria del boxeador");
        Categoria = B.next();
        }
        
        public void MostrarDatos()
        {
            System.out.println("El boxeador " + Nombre + Apellido + "Con categoria " + Categoria);
        }
        
        
    }
    
    