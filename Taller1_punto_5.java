/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_punto_5;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Taller1_punto_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String g="", g1="";
       int aux=0;
       
        System.out.println("Ingrese una palabra: ");
        g=teclado.next();
      
        aux=g.length()-1;

       for(int i=aux; i>=0; i--){
           g1+=g.charAt(i);
       
       }
       
        System.out.println(g1);
       
       
        
        
        
        
        
    }
}

    
    

