/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        float peso = teclado.nextFloat();
        System.out.print("Digite a sua altura: ");
        float altura = teclado.nextFloat();
        
        float imc = peso / (altura * altura); //não é vezes 2!
        System.out.println(imc);
        
        if (imc < 18.5 ){
            System.out.println("Magreza");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Normal");
        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if (imc >= 30.0 && imc <= 39.9){
            System.out.println("Obesidade");
        }else if (imc > 40){
            System.out.println("Obesidade Grave");
        }
       
    }
    
}
