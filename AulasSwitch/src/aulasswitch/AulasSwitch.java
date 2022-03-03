/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulasswitch;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class AulasSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas Pernas?");
        int pernas = teclado.nextInt();
        String tipo;

        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupide";
                break;
            case 6:
                tipo = "Arranha";
                break;
            default:
                tipo = "ET"; 
                break;
            }
            System.out.println("Isso é: "+ tipo); // TODO code application logic here
      
        }
    
}


