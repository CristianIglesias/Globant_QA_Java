/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_basicos2;
import java.util.Scanner;
/**
 *
 * @author Crisc
 */
public class Ejercicio_Calculadora {
    
        public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
            int opcion=-1;
            double num1=0, num2=0;
        
            System.out.println("Ingrese dos numeros.");
            num1=leer.nextDouble();
            num2=leer.nextDouble();
                       
        while(opcion!=5){
            Menu();
            opcion = leer.nextInt();
            
            
            switch(opcion){
            
               case 1:{Sumar(num1,num2);}break;
               
               case 2:{Restar(num1,num2);}break;
               
               case 3:{Multiplicar(num1,num2);}break;
               
               case 4:{Dividir(num1,num2);}break;
               
               case 5:{}break;
               default:{ System.out.println("Opcion Invalida.");};
            }
            
        }
}


public static void Menu()
{

   System.out.println("MENU");
   System.out.println("1-Sumar.");
   System.out.println("2-Restar.");
   System.out.println("3-Multiplicar.");
   System.out.println("4-Dividir.");
   System.out.println("5-Salir.");
   System.out.println("ELIJA OPCION:");
      System.out.println("\n\n\n");
   
}

public static void Sumar(double num1, double num2){

System.out.println("La suma de los numeros es: " + (num1+num2));
   System.out.println("\n");
};

public static void Restar(double num1, double num2){
System.out.println("La resta de los numeros es: " + (num1-num2));
   System.out.println("\n");
};

public static void Multiplicar(double num1, double num2){
System.out.println("El producto de los numeros es: " + num1*num2);
   System.out.println("\n");
};

public static void Dividir(double num1, double num2){
System.out.println("La division de los numeros es: " + num1/num2);
   System.out.println("\n");
};















}