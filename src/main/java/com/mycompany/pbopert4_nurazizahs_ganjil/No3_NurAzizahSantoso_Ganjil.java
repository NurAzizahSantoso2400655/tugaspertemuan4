/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert4_nurazizahs_ganjil;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class No3_NurAzizahSantoso_Ganjil {
    public static void main (String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         System.out.print("Masukkan nilai n: ");
         int n = input.nextInt();
         
         int hasil = 1;
         
         System.out.print(n + "! = ");
         
         if (n == 0) {
             System.out.println("1 = 1");
         } else {
             for (int i = n; i >= 1; i--) {
                 hasil = hasil * i;
                 
                 System.out.print(i);
                 
                 if (i > 1) {
                     System.out.print("*");
                 }
             }
             
             System.out.println(" = " + hasil);
         }
    }
}
