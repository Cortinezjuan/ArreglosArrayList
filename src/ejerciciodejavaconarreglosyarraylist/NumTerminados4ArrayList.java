/*
 Leer 10 números enteros, almacenarlos en un ArrayList y determinar en qué 
posiciones se encuentran los números terminados en 4.
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class NumTerminados4ArrayList {

    
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros.add(sc.nextInt());
        }
        
        for(Integer n: numeros){
            if(n % 10 == 4 || n % 10 == -4){
                System.out.println("En la posición "+(pos+1)+" el número termina en 4");
            }
            pos++;
        }
    }
    
}
