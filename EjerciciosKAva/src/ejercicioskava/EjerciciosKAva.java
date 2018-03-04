/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioskava;

import java.util.Scanner;

/**
 *
 * @author Gettsu
 */
public class EjerciciosKAva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        System.out.println("Introduzca su nombre");
        nombre = lector.nextLine();
        System.out.println("Introduzca su apellido");
        apellido = lector.nextLine();
        System.out.println("Introduzca su edad");
        edad = lector.nextInt();
        System.out.println("Me llamo "+nombre+apellido+" Y tengo "+edad+" años");
    }
    
}
