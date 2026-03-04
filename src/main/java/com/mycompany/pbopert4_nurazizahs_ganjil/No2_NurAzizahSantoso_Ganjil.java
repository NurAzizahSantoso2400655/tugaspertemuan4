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

public class No2_NurAzizahSantoso_Ganjil {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        int jumlahGanjil = 0;
        
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
        
        System.out.println("Jumlah bilangan ganjil = " + jumlahGanjil);
    }
}
