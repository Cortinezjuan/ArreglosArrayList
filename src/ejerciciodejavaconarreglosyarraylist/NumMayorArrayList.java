/*
 Leer 10 enteros, almacenarlos en un ArrayList y determinar en qué posición del
ArrayList está el mayor número leído.
 */
package ejerciciodejavaconarreglosyarraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class NumMayorArrayList {

    
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
            if(numeroMayor < n){
                numeroMayor = n;
                pos = cont;
            }
            cont++;
        }
        
        System.out.println("El numero mayor esta en la posición: "+(pos+1));
    }
    
}
