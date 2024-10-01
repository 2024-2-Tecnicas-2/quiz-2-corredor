package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        
        Coche cocheGasolina = new Coche(TipoCombustible.GASOLINA);

 
        cocheGasolina.acelerar(50);  
        cocheGasolina.acelerar(30);  
        cocheGasolina.frenar(20);    
        cocheGasolina.frenar(70);    

       
        System.out.println("Velocidad final del coche: " + cocheGasolina.obtenerVelocidad() + " km/h");
        System.out.println("Tipo de combustible del coche: " + cocheGasolina.tipoCombustible());

       
        Coche cocheElectrico = new Coche(TipoCombustible.ELECTRICO);
        cocheElectrico.acelerar(60);
        cocheElectrico.frenar(30);
        System.out.println("Velocidad final del coche eléctrico: " + cocheElectrico.obtenerVelocidad() + " km/h");
        System.out.println("Tipo de combustible del coche eléctrico: " + cocheElectrico.tipoCombustible());
    }
    }
    
