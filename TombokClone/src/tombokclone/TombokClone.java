/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombokclone;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author szlad
 */
public class TombokClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Scanner sc=new Scanner(System.in);
        int [] randomTomb=randomTombFeltöltés(6);
        System.out.println(Arrays.toString(randomTomb));
        int [] bekertTomb=bekertTomFeltoltes(2);
        System.out.println(Arrays.toString(bekertTomb));
        hetNapjai();
        ketDimenziosTomb();
        System.out.println(" ");
        ketDimenziosTombElforgatva();
        System.out.println("");
    }
    public static int [] randomTombFeltöltés(int tombHossza){
        int []tomb=new int[tombHossza];
        Random rnd=new Random();
        for (int i = 0; i < tomb.length; i++) {
            tomb[i]=rnd.nextInt(100)+1;
            
        }
       return tomb;
    }
    
    public static int [] bekertTomFeltoltes(int tombHossza){
        int [] tomb=new int[tombHossza];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < tomb.length; i++) {
            System.out.println("Adja meg a tömb következő elemét");
            tomb[i]=scanner.nextInt();
        }
            return tomb;
        
    }
    public static void hetNapjai(){
        Scanner s=new Scanner(System.in);
        System.out.println("Adja meg a hét hanyadik napja van");
        int nap=s.nextInt()-1;
        String []stringNap=new String[7];
            while (nap < 7) {      
                switch (nap){
                    case 0:
                        System.out.println("Hétfő");
                        nap=s.nextInt()-1;
                        break;
                    case 1:
                        System.out.println("Kedd");
                        nap=s.nextInt()-1;
                        break;
                    case 2:
                        System.out.println("Szerda");
                         nap=s.nextInt()-1;
                        break;
                    case 3:
                        System.out.println("Csütörtök");
                         nap=s.nextInt()-1;
                        break; 
                    case 4:
                        System.out.println("Péntek");
                         nap=s.nextInt()-1;
                       break;
                    case 5:
                        System.out.println("Szombat");
                         nap=s.nextInt()-1;
                        break;
                    case 6:
                        System.out.println("Vasárnap");
                         nap=s.nextInt()-1;
                        break;
            }
               
        } 
                
     }
    
    public static void ketDimenziosTomb(){
        int [][] tomb=new int[10][10];
        int szam=1;
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                tomb[i][j]=szam;
                szam++;
                System.out.print(tomb[i][j]+" ");
            }
            
         System.out.println();     
        }
       
    }
        
    public static void ketDimenziosTombElforgatva(){
        int [][] tomb=new int[10][10];
        int szam=10;
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                tomb[i][j]=szam;
                System.out.print(tomb[i][j]+" ");
                szam+=10;
            }
            
         System.out.println();  
         szam-=101;
        }
       
    }
    }
    

