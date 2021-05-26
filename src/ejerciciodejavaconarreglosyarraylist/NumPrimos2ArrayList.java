/*
 Almacenar en un ArrayList de 10 posiciones los 10 números primos comprendidos 
entre 100 y 300. Luego mostrarlos en pantalla
 */
package ejerciciodejavaconarreglosyarraylist;

import java.util.ArrayList;


public class NumPrimos2ArrayList {

    
    public static void main(String[] args) {
       ArrayList <Integer> numeros = new ArrayList();
       
       for(int i=100; i<300; i++){
            boolean esPrimo = true;
            int contador = 2;
            while(esPrimo &&  contador!=i){//si esPrimo no cambia se van comparando los modulos
                if(i%contador == 0){
                    esPrimo = false;
                    
                }
                contador++;
            }
            if(esPrimo == true){  //una vez que tengo el numero primo lo guardo en el ArrayList
                numeros.add(i);
                
            }
            
        }
       for(Integer n: numeros){
           System.out.println(n);
       }
    }
    
}
