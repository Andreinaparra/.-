
package contar.caracteres;

import java.util.Scanner;

/**
 * 
 * @author Andreina
 */        
   public class ContarCaracteres {
   
   /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
       // TODO code application logic here
    Scanner lector = new Scanner(System.in);
    String cadena =  "";
    char [] Arraycadena ;
    char caracter ;
    int contador =0;
    System.out.println("Introduce una frase: ");
    cadena = lector.nextLine();
    Arraycadena = cadena.toCharArray();
    for(int i = 0; i < Arraycadena.length; i++){
        caracter = Arraycadena[i];
        for(int j = 0; j < Arraycadena.length; j++){
            if(Arraycadena[j] == caracter){
                contador++;
            }
        }
        System.out.println(Arraycadena [i]+ " "+ contador);
        contador= 0;
    }
}

}