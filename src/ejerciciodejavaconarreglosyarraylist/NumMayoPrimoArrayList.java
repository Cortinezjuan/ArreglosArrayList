/*
 Leer 10 enteros, almacenarlos en un ArrayList y determinar en qué posición del
ArrayList está el mayor número primo leído
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class NumMayoPrimoArrayList {

    
    public static void main(String[] args) {
        ArrayList <Integer> numeros = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int cont = 0;
        int numeroMayor = 0;
        
        for(int i=0; i<10; i++){ //lectura de los 10 numeros
            System.out.println("Ingrese el numero de la posición: "+(i+1));
            numeros.add(sc.nextInt());
        }
        
        for(Integer n: numeros){
            int contador = 2;
            boolean esPrimo = true;
            while((esPrimo) && (contador!=numeros.size())){//si esPrimo no cambia se van comparando los modulos
                 if(n%contador == 0){
                    esPrimo = false;
                    
                }
                contador++;
            }
            if(esPrimo == true){  //una vez que tengo el numero primo lo comparo con los demas numeros primos que vayan surgiendo y guardo la posición del mayor
                if(numeroMayor < n){
                    numeroMayor = n;
                    pos = cont; //guarda la posición del mayor numero primo
                }
            }
            cont++;
        }
        
        System.out.println("El mayor numero primo esta en la posición : "+(pos+1));
    }
    
}
