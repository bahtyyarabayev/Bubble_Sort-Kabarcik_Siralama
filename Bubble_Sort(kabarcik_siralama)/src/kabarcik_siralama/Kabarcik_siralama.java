/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kabarcik_siralama;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Kabarcik_siralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print(" Lütfen Dizi Boyutunu Giriniz:");
        int dizi=input.nextInt();
        Random rnd=new Random();      
        int[] sayi = new int[dizi];
        for(int i=0;i<dizi;i++)
        {
        sayi[i]=rnd.nextInt(10000);
        }
         for(int i=0;i<sayi.length-1;i++)
     {
         int indis=i;
         for(int j=i+1;j<sayi.length;j++)
         {
             if (sayi[j]<sayi[indis])
             {
                 indis=j;
             }
         }
         int a=sayi[indis];
         sayi[indis]=sayi[i];
         sayi[i]=a;
     }    
     System.out.println(Arrays.toString(sayi));
      
    }
    
}
