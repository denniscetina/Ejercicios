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
public class Cuadrado {

    public static double lado, area, perimetro, volumen;

    public static void CalculaArea() {
        area = lado * lado;
        System.out.println("--------------------------------------");
        System.out.println("El area del cuadrado es: " + area);
    }

    public static void CalculaPerimetroCuadrado() {
        perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
        System.out.println("--------------------------------------");
    }
}
