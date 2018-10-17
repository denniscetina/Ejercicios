/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author denni
 */
public class Cubo extends Cuadrado {
 
    public static void CalculaPerimetroCubo() {
        perimetro = 12 * lado;
         System.out.println("--------------------------------------");
        System.out.println("El perimetro del cubo es: " + perimetro);
    }

    public static void CalculaVolumen() {
        volumen = (Double) Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
        System.out.println("--------------------------------------");
    }

}
