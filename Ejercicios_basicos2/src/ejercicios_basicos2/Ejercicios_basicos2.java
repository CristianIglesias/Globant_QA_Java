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
public class Ejercicios_basicos2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
public static boolean Paridad (int num){
    if (num%2 ==0 ){
        return true;
    }
    else return false;
}
public static boolean Eureka (String frase){
    if (frase.equals("Eureka") ){
        return true;
    }
    else return false;
   }    

public static boolean LargoPalabra (String palabra){
    if (palabra.length()!=8)
    {
        System.out.println("incorrecto.");
                return true;
    }
    else{
        System.out.println("Correcto.");
        return false;
    } 
}    
public static int LimitePositivo(int limite){
    
    int acu =0, num=0;
    Scanner leer = new Scanner(System.in);
    
    limite = leer.nextInt();
    
    while (acu<limite){
    
        limite +=num;
        num = leer.nextInt();  
    }
    
        System.out.println(num);
    return 1;

}    
    
    
    
    
    
    
    
    
    
    
}