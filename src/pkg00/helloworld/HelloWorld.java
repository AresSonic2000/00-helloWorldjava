/**
 * Classe contenant le point d'entrée du programme pour des exemples simples.
 * 
 * Cette Classe illustre un Hello minimal ainsi qu'une méthode
 * de conversion simple.
 * 
 * @file HelloWorld.java
 * @author ABK
 * @version 0.0
 * @since 22/09/2026
 * @see pkg00.HelloWorld#test(float)
 */

package pkg00.helloworld;
import java.util.Scanner;
/**
 * Classe principale contenant la méthode main.
 * 
 * @author abreilletkerforn
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hello World
        //System.out.println("Hello World Arès, cv ? ");*/
        //Exercice 2
        /*
        System.out.println("Message : Ligne 1");
        System.out.println("Message : Ligne 2");
        */
        int x, y, tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre la valeur de x :");
        x = sc.nextInt();
        System.out.println("Entre la valeur de y :");
        y = sc.nextInt();
        System.out.println("Valeur de x avant l'echange :" + x);
        System.out.println("Valeur de y avant l'echange :" + y);
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("Valeur de x apres l'echange :" + x);
        System.out.println("Valeur de y apres l'echange :" + y);
    }
    
}
