/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.politecnicomalaga.ejercicio_if_4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner miScan = new Scanner(System.in);
        
        System.out.println("Introduzca la primera nota: ");
        int pnota = miScan.nextInt();
        
        System.out.println("Introduzca la segunda nota: ");
        int snota = miScan.nextInt();
        
        System.out.println("Introduzca la tercera nota: ");
        int tnota = miScan.nextInt();
        
        int suma = pnota + snota + tnota;
        int media = suma / 3;
        
        System.out.println("Su nota media es: " + media);
        
        if(media < 0){
            
            System.out.println("Eso no es posible.");

        }
        else if(media < 5){
            
            System.out.println("Insuficiente");
        }
        else if(media < 6) {
            
            System.out.println("Suficiente");
        }
        else if(media < 7) {
            
            System.out.println("Bien");
        }
        else if(media < 8.5) {
            
            System.out.println("Notable");
        }
        else if(media <= 10) {
            
            System.out.println("Sobresaliente");
        }
        else {
            
            System.out.println("Eso no es posible.");

        }
    }
}
