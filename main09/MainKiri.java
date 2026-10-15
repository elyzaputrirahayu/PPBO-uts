package main09;

import tangankanan.PergerakanKanan;
import tangankiri.PergerakanKiri;

public class MainKiri {
    public static void main(String[] args) {
        PergerakanKiri kiri = new PergerakanKiri();
        PergerakanKanan kanan = new PergerakanKanan();

        System.out.println("=== SKENARIO PENYELESAIAN RUBIK - ANGGOTA KIRI 09 ===");

        kiri.infoTangan();
        kiri.putarAtas(2);

        kanan.infoTangan();
        kanan.putarBawah(2);

        kanan.putarKiri();

        kiri.putarKanan();

        System.out.println();
        System.out.println("Total gerakan tangan kiri: " + kiri.getTotalGerakan());
        System.out.println("Total gerakan tangan kanan: " + kanan.getTotalGerakan()); 
    }
}