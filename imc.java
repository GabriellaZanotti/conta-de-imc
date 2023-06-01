/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        double peso=0;
        double altura=0;
        double imc=0;
                
        System.out.println("Digite seu peso em kg (ex:100,20");
        peso=scanner.nextDouble();
        System.out.println("Digite sua altura em metros (ex:1,50");
        altura=scanner.nextDouble();
        
       imc= peso/(altura*altura);
        
        System.out.println("Seu peso é"+imc);
        
        if(imc<18.5){
            System.out.println("Abaixo do peso normal");
        }else if(imc>=18.5 && imc<=24.9){
            System.out.println(" Peso normal");
        }else if(imc>=25 && imc<=29.9){
            System.out.println(" Excesso de peso");
        }else if(imc>=30 && imc<=34.9){
            System.out.println(" Obesidade");
        }else if(imc>=35 && imc<=39.9){
            System.out.println(" Obesidade1");
        }else if(imc>=25 && imc<=29.9){
            System.out.println(" Obesidade2");
        }else if(imc>=40){
            System.out.println("Obesidade3");
        }
    }
}                  
  
   
    

