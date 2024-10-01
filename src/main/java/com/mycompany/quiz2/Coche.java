/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
    public abstract class Coche implements Vehiculo {
       // Atributo adicional para el tipo de combustible
    private String tipoCombustible;

    // Constructor
    public Coche(String marca, String modelo, int velocidadActual, String tipoCombustible) {
        super(marca, modelo, velocidadActual);
        this.tipoCombustible = tipoCombustible;
    }

    // Implementación del método abstracto
    @Override
    public String descripcionVehiculo() {
        return "Coche de marca " + marca + " y modelo " + modelo;
    }

    // Método adicional para obtener el tipo de combustible
    public String tipoCombustible() {
        return tipoCombustible;
    }

    public static void main(String[] args) {
        // Creación de un objeto Coche
      
    }
    }
   
    
