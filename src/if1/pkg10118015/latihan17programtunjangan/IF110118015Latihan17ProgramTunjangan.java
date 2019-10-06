/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan17programtunjangan;

import java.util.Scanner;

/**
 *
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program tunjangna karyawan
 */
public class IF110118015Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi variabel
        String status;
        float tunjangan = 0;
        double gaji, total;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==========Program Tunjangan==========");
        System.out.print("Berapa Gaji Pokok Anda Perbulan? : Rp.");
        gaji = keyboard.nextInt();
        
        System.out.print("Status Anda? (menikah/belum)     : ");
        Scanner sts = new Scanner(System.in);
        status = sts.nextLine();
        System.out.println();
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok\t\t : Rp. "+gaji);
        if ("menikah".equals(status)) {
            tunjangan = (int) (gaji * 0.35);
        }
        System.out.println("Tunjangan\t\t : Rp. " + tunjangan);
        total = gaji + tunjangan;
        System.out.println("Total Gaji\t\t : Rp. " + total);
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
