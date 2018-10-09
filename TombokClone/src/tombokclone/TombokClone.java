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
        System.out.println( Byte.MIN_VALUE);
        double p=Math.PI;
        double e=Math.E;
        System.out.println("Pí "+p+" Euler-féle szám"+e);
        System.out.println(Math.random()*100);
        System.out.println("Adja meg a kör sugarát");
        double r=sc.nextDouble();
        korKertuletTerulet(r);
        String s="alkatraz";
        System.out.println(s);
        System.out.println(s.replace("a", "e"));
        StringBuffer sb=new StringBuffer("Ez a string buffer szöveg");
        sb.append(s);
        System.out.println(sb.capacity());
        System.out.println(sb.insert(5, s));
        lexikoGrafikus();
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
    public static void korKertuletTerulet(double r){
        double terulet=Math.PI*Math.pow(r, 2);
        System.out.println("A kör területe:"+terulet);
        double kerulet=2*(Math.PI*r);
        System.out.println("A kör kerülete: "+kerulet); 
   }
    public static void lexikoGrafikus(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Adja meg a karakterláncok számát");
        int szam=sc.nextInt();
        
        String [] sb=new String[szam];
        for (int i = 0; i < szam; i++) {
            System.out.println("Adja meg a "+(i+1)+" karakterláncot");
            sb[i]=sc.next();
        }
        String legkisseb=" ";
        for (int i = 0; i < sb.length-1; i++) {
           
            if (sb[i].length()<sb[i+1].length()) {
                legkisseb=sb[i];
            }else{
                legkisseb=sb[i+1];
            }
            
        }System.out.println("A legrövidebb a karakterláűcok közül "+legkisseb);
    }
    }
    

