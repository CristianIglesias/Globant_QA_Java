/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Crisc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ///Ingresar nombre y edad, y que los mismos sean mostrados
//        String nombre = "Carlitos";
//        int edad=0;
//       Scanner leer = new Scanner(System.in);
//    
//        System.out.println("Ingresa tu nombre");
//        nombre= leer.nextLine();
//        
//        System.out.println("Ingresa tu edad");
//        edad = leer.nextInt();
//    
//        System.out.println("Hola " + nombre + ", como va? Vos tenes masomenos "+
//        edad + " años, no?");
//        Scanner leer = new Scanner(System.in);
//        int tipomotor = 0;
//        System.out.println("Ingrese el tipo de motor del vehiculo");
//        tipomotor = leer.nextInt();
//
//        if (tipomotor == 1) {
//            System.out.println("La bomba es una bomba de agua.");
//        } else if (tipomotor == 2) {
//            System.out.println("La bomba es una bomba de alimenticia.");
//        } else if (tipomotor == 3) {
//            System.out.println("La bomba es una bomba de Hormigon.");
//        } else if (tipomotor == 4) {
//            System.out.println("La bomba es una bomba de Gasolina.");
//        } else {
//            System.out.println("Opcion invalida");
//        }


//      Scanner leer = new Scanner(System.in);
//      int nota=0, cont =0;     
//    System.out.println("Holis, dame una nota");
//    nota=leer.nextInt();
//    while( nota<10 && nota>0)
//    {
//    System.out.println("Hola denuevo, dame otra nota");
//     nota=leer.nextInt();
//    }  

    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese una linea para pasar a mayusc.");
    
    String str2, str= leer.nextLine();
    str2 = str.toUpperCase();
    System.out.println(str2);
    str2 = str.toLowerCase();
    System.out.println(str2);    
    str2 = CambioVocales(str);
   System.out.println(str2);
    }
    
    
    
    
    
    
    
    
    public static String CambioVocales(String str){
        String str2;
        str2 = str.replace('a','@');
        str2 = str2.replace('e','#');
        str2 = str2.replace('i','$');
        str2 = str2.replace('o','%');
        str2 = str2.replace('u','*');
     
        
        return str2;
    }

    
    
    
    public static boolean Multiplo (int num1, int num2){       
        if(num1%num2 ==0)
        {return true;}
        else 
            return false;
    }
    
    
    
    public static int sumar(int num1, int num2){
    int num3= num1+num2;
    
    return num3;
        
    }
   
   
}
