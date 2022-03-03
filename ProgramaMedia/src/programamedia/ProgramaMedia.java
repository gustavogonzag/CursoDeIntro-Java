/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate current_date = LocalDate.now();
        int ano = current_date.getYear();
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1+n2)/2;
        System.out.println("Sua média é: " + m);
        if (m>9) {
            System.out.println("Parabéns!");*/
        System.out.println("Digite o ano em que você nasceu: ");
        int nasc = teclado.nextInt();
        int res = ano - nasc;
        System.out.println("Sua idade é: " + res + " anos");
        if (res>=18){
            System.out.println("Maior de idade"); 
        } else {
            System.out.println("Menor de idade");
    }
  }  
}
