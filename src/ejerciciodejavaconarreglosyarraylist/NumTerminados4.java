/*
 Leer 10 números enteros, almacenarlos en un arreglo y determinar en qué 
posiciones se encuentran los números terminados en 4.
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.Scanner;


public class NumTerminados4 {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int numeros[] = new int [10]; //declaro un arreglo de 10 numeros enteros
        
        
        
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros[i] = sc.nextInt();
        }
        
        for(int i = 0; i<10; i++){
            if(numeros[i] % 10 == 4 || numeros[i] % 10 == -4){
                System.out.println("En la posición "+(i+1)+" el número termina en 4");
            }
        }
    }
    
}
