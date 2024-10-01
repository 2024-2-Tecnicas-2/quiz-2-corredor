/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public class Tipocombustible {
     public enum TipoCombustible {
    GASOLINA,
    DIESEL,
    ELECTRICO;


    public String obtenerDescripcion() {
        switch (this) {
            case GASOLINA:
                return "Combustible a base de petróleo, común en automóviles convencionales.";
            case DIESEL:
                return "Combustible más eficiente para vehículos pesados o comerciales.";
            case ELECTRICO:
                return "Fuente de energía limpia a base de electricidad.";
            default:
                return "Tipo de combustible desconocido.";
        }
    }
     }
}

