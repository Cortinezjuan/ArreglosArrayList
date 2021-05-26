/*
 Leer 10 enteros, almacenarlos en un arreglo y determinar en qué posición del
arreglo está el mayor número primo leído
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.Scanner;


public class NumMayoPrimo {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int [10]; //declaro un arreglo de 10 numeros enteros
        
        int pos = 0; //para guardar la posición del mayor numero primo
        
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros[i] = sc.nextInt();
        }
        int numeroAux = 0;
        for(int i=0; i<10; i++){
            int contador = 2;
            boolean esPrimo = true;
            while((esPrimo) && (contador!=numeros[i])){//si esPrimo no cambia se van comparando los modulos
                 if(numeros[i]%contador == 0){
                    esPrimo = false;
                    
                }
                contador++;
            }
            if(esPrimo == true){  //una vez que tengo el numero primo lo comparo con los demas numeros primos que vayan surgiendo y guardo la posición del mayor
                if(numeroAux < numeros[i]){
                    numeroAux = numeros[i];
                    pos = i;
                }
            }
        }
        
        System.out.println("El mayor numero primo leido está en la posición: "+(pos+1));
    }
    
}
