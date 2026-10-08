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
/**
 * Classe principale contenant la méthode main.
 * 
 * @author abreilletkerforn
 */
import java.util.Scanner;
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
        /*
        //Exercice 4
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
        */
        //Exercice 5
        /*
        int a, b, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre la valeur de a :");
        a = sc.nextInt();
        System.out.println("Entre la valeur de b :");
        b = sc.nextInt();
        r = (a + b)*2;
        System.out.println("Resultat : " + r);
        */
        //Exercice mot de passe
        /*
        String a ,mdp ="admin123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Mot de passe : ");
        a = sc.next();
        while (!a.equals(mdp)) {
            System.out.print("Mot de passe : ");
            a = sc.next();
        */
        //Exercice Menu interactif
        /*
        Scanner sc = new Scanner(System.in);
        int e = 0;
        do {
        System.out.print("--Menu interactif--\n");
        System.out.print("1 : Afficher 'Bonjour'\n");
        System.out.print("2 : Afficher 'Au revoir'\n");
        System.out.print("0 : Quitter\n");
        System.out.print("--Choisie une option--\n");
        e = sc.nextInt();
        if (e==1){
System.out.print("Bonjour\n");
        }
        else if (e==2){
System.out.print("Au revoir\n");
        }
        }
        while (e>0 || e<0);
        */
       //Exercice calcule de note
       /*
        Scanner sc = new Scanner(System.in);
        float e = 0, s = 0, m = 0;
        int c = 0;
            System.out.print("--Calcule de note--\n");
            c++;
            System.out.print("Saisir note " + c + ": ");
            e = sc.nextInt();
         while (e != -1) {
            s+=e;
            m = s/c;
            c++;
            System.out.print("Saisir note " + c + ": ");
            e = sc.nextInt();
         }
        System.out.print("Somme des notes : " + s + "\n");
        System.out.print("Moyenne des notes : " + m + "\n");
        */
       Scanner sc = new Scanner(System.in);
       int V_r = (int)(Math.random() * 100)+1, e = -1, c = 0;
       System.out.print("--- Devine un nombre ENTIER entre 0 et 100 en 10 tentavives ---\n");
       while (c<10 && e!=V_r) {
        System.out.print("\nSaisir un nombre ENTIER entre 0 et 100 : ");
        e = sc.nextInt();
        while (e<0 || e>100){
        System.out.print("Saisir un nombre ENTIER entre 0 et 100 : ");
        e = sc.nextInt();
        }
        if (e>V_r){
            System.out.print("\nTrop grand !\n");
        }
        else if (e<V_r){
            System.out.print("\nTrop petit !\n");
        }
        c++;
        System.out.print("Nombre de tentative faite : "+ c +"\n");
       }
       if (c==1){
        System.out.print("Vous avez deviner le nombre en "+ c +" tentative, vous trichez ou vous avez une voyance paranormale sinon jouer au loto !!");
       }
       else if(c>1 && c<=5){
        System.out.print("Felicitations, vous avez deviner le nombre en "+ c +" tentatives !!");
       }
       else if(c>=6 && c<=9){
       System.out.print("Pas mal, vous avez deviner le nombre en "+ c +" tentatives !!");
       }
       else if (c==10 && e==V_r){
       System.out.print("Juste, vous avez deviner le nombre en "+ c +" tentatives !");
       }
       else {
        System.out.print("\nTu es un gros nul, deviner le nombre en 10 tentatives est pourtant simple XD\n");
        System.out.print("Le nombre a deviner est : "+ V_r +"\n");
       }
    }}

