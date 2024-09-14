/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
         int idade;
         
         
         
         System.out.println("----Programa De Comparação maior idade----");
         System.out.println("Digite idade    ");
         idade=scanner.nextInt();
         
         if(idade >= 18){
             System.out.println("Aluno Maior de idade");
         }else{
             System.out.println("Aluno Menor de idade");
         }
     
     
    }
    
}
