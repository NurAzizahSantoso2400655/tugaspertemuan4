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

public class No1_NurAzizahSantoso_Ganjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (>=1): ");
        int n = input.nextInt();
        
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Input harus >= 1");
        }
    }
}
