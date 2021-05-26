/*
 Leer 10 números enteros, almacenarlos en un ArrayList y determinar cuántas 
veces está repetido el mayor.
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class RepeticionesNumMayorArrayList {

   
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int numeroMayor=0;
        
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros.add(sc.nextInt());
        }
        
        for(Integer n: numeros){
            if(numeroMayor < n){
                numeroMayor = n;
                
            }
        }
        
        int contMayor = 0;
        for(Integer n: numeros){
            if(n == numeroMayor){
                contMayor++;
            }
        }
        System.out.println("El mayor numero es: "+numeroMayor+" y esta repetido: "+contMayor+" veces.");
    }
    
    
}
