/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.Scanner;

/**
 *
 * @author denni
 */
public class Objetos extends Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcion, decision = null;

        //Hacemos entradas a las opciones
        System.out.println("Menú");
        System.out.print("a)Pedir lado\n" + "b)Salir\n");
        System.out.print("Elija una opción: ");
        opcion = entrada.next();

        if (opcion.equalsIgnoreCase("a")) {
            System.out.println("-----------------------------------");
            System.out.print("Escriba la medida de un lado: ");
            lado = entrada.nextDouble();
            System.out.println("-----------------------------------");
            System.out.println("Cálculos");
            System.out.print("a)Cuadrado\n" + "b)Cubo\n" + "c)Cancelar\n" + "d)Salir\n");
            System.out.println("--------------------------------------");
            System.out.print("Elija una opción: ");
            decision = entrada.next();
        }
        if (decision.equalsIgnoreCase("a")) {
            Cuadrado.CalculaArea();
            Cuadrado.CalculaPerimetroCuadrado();
            Objetos.main(args);
        }
        if (decision.equalsIgnoreCase("b")) {
            Cubo.CalculaPerimetroCubo();
            Cubo.CalculaVolumen();
            Objetos.main(args);
        }
        if (decision.equalsIgnoreCase("c")) {
            Cancelar();

        }
        if (decision.equalsIgnoreCase("d")) {
            System.exit(0);
        }
        // TODO code application logic here

    }

    //Este public static lo único que hace es volver a escribir el lado en caso que se cancele
    //en donde esta las opciones
    public static void Cancelar() {
        Scanner en = new Scanner(System.in);
        String dec;
        System.out.println("-----------------------------------");
        System.out.print("Escriba la medida de un lado: ");
        lado = en.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("Cálculos");
        System.out.println("a)Cuadrado\n" + "b)Cubo\n" + "c)Cancelar\n" + "d)Salir\n");
        System.out.println("--------------------------------------");
        System.out.print("Elija una opción: ");
        dec = en.next();

        if (dec.equals("a")) {
            Cuadrado.CalculaArea();
            Cuadrado.CalculaPerimetroCuadrado();

        }
        if (dec.equalsIgnoreCase("b")) {
            Cubo.CalculaPerimetroCubo();
            Cubo.CalculaVolumen();

        } else {
        }
        if (dec.equalsIgnoreCase("c")) {
            Cancelar();
        }
        if (dec.equalsIgnoreCase("d")) {
            System.exit(0);
        }
    }

}
