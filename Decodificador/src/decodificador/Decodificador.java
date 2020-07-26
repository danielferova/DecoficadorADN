/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decodificador;

import Interfaz.adn;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Decodificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         adn entrada = new adn();
         entrada.show();
         entrada.setSize(1250, 550);
       //DANIEL FERNÁNDEZ - 201731816
     /* Scanner entrada = new Scanner(System.in);
       String cadena1;
       String cadena2;
       
         
        System.out.println(" ----- Bienvenidos a DECODIFICADOR ADN ------   ");
  
        System.out.print("Ingrese el ADN 1: ");
        cadena1 = entrada.nextLine(); //variable que almacena la primera secuencia
        System.out.println("--------------------------------------");
        System.out.print("Ingrese el ADN 2: ");
        cadena2 = entrada.nextLine(); //variable que me almacena mi segunda secuencia
        String bases = "";  //variable que almacena el resultado, es el conjunto ordenado de las bases de mayor tamaño en ambas secuencias
     
        
        //Utilizamos dos iteraciones for para realizar la búsqueda. 
      //condicion 1 para saber si la cadena 1 es mas grande que la 2
        if(cadena1.length() >= cadena2.length()){

            for (int r = cadena1.length(); r >= 0; r--)   //el primer for irá acotando de derecha a izquierda el rango de búsqueda
        //el contador comienza en el valor de la longitud de la variable cadena1 va disminuendo
     
            {
            
                      for (int l = 0; l < r; l++) //el segundo for irá acotando de izquierda a derecha, se va incrementando
        
            //sin llegar a ser igual que el valor actual de la variable r
            //que viene acotando por la derecha
            {
             
                  //aquí verificamos dos condiciones:
                
                //1. que la porción de la cadena extraida de la variable cadena1 
                //se encuentra en la variable cadena2
                if (cadena2.contains(cadena1.substring(l, r)) && 
 
                    bases.length() < cadena1.substring(l, r).length())  //2. que la longitud de la ultima coincidencia encontrada
                //sea menor a la longitud de la nueva coincidencia encontrada
                {
                  bases = cadena1.substring(l, r);//si se cumplen ambas condiciones almacenamos el nuevo valor  
                  
                }
 
            }
            
        }
        
        System.out.println("Resultado: "+ bases); //imprimo el resultado de los dos strings
}
        
                  else if(cadena2.length() >= cadena1.length()) //la misma condicion pero ahora para ver la cadena 2 sea mayor a la cadena 1
                {

                    for (int r = cadena2.length(); r >= 0; r--)
                    {
            
                      for (int l = 0; l < r; l++) {
                         if (cadena1.contains(cadena2.substring(l, r)) && 
                             bases.length() < cadena2.substring(l, r).length()) {
                               bases = cadena2.substring(l, r);
                                  }
                        }
            
        }
        System.out.println("Resultado: "+ bases); //imprimo el resultado de los dos strings
}*/
    }
    
}
