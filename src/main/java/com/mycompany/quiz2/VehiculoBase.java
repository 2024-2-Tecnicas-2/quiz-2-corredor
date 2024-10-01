/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */

public abstract class VehiculoBase implements Vehiculo {
    
    protected String marca;
    protected String modelo;
    protected int velocidadActual;

    
    public VehiculoBase(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

   
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

   
    @Override
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadActual += incremento;
        }
    }

    
    @Override
    public void frenar(int decremento) {
        if (decremento > 0 && velocidadActual >= decremento) {
            velocidadActual -= decremento;
        } else {
            velocidadActual = 0; 
        }
    }

    
    public abstract String descripcionVehiculo();
}
