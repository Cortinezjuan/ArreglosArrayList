/*
 Almacenar en un arreglo de 10 posiciones los 10 números primos comprendidos 
entre 100 y 300. Luego mostrarlos en pantalla
 */
package ejerciciodejavaconarreglosyarraylist;


public class NumPrimos2 {

    
    public static void main(String[] args) {
        int numeros[] = new int [37]; //declaro un arreglo de 37 numeros enteros, entre 100 y 300 hay 37 nº primos
        
        int k = 0;
        
        for(int i=100; i<300; i++){
            boolean esPrimo = true;
            int contador = 2;
            while(esPrimo &&  contador!=i){//si esPrimo no cambia se van comparando los modulos
                if(i%contador == 0){
                    esPrimo = false;
                    
                }
                contador++;
            }
            if(esPrimo == true){  //una vez que tengo el numero primo lo guardo en en arreglo
                numeros[k] = i;
                k++;
            }
            
        }
        System.out.println("Entre el 100 y el 300 hay "+k+" numeros primos");
        System.out.println("Lon números primos comprendidos entre 100 y 300 son: ");
        for(int i = 0; i < 37; i++){
            System.out.println(numeros[i]+"\n");
        }
    }
    
}
