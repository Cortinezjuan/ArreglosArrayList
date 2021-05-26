/*
 Leer 10 números enteros, almacenarlos en un arreglo y determinar cuántas 
veces está repetido el mayor.
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.Scanner;


public class RepeticionesNumMayor {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int [10]; //declaro un arreglo de 10 numeros enteros
        int pos = 0;
        
        
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros[i] = sc.nextInt();
        }
        
        int numeroMayor = numeros[0]; // asigno a numeroMayor el primer numero del arreglo, para comparar si tambien se ingresan numeros negativos 
        for(int i=1; i<10;i++){
            if(numeroMayor < numeros[i]){
                numeroMayor = numeros[i];
                pos = i;
            }
        }
        
        int contMayor = 0;
        for(int i = 0; i<10; i++){
            if(numeros[i] == numeros[pos]){
                contMayor++;
            }
        }
        System.out.println("El mayor numero es: "+numeros[pos]+" y esta repetido: "+contMayor+" veces.");
    }
    
}
