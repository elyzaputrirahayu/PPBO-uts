package main10; 

import tangankiri.PergerakanKiri;
import tangankanan.PergerakanKanan;

public class MainKanan {
    public static void main(String[] args) {
        PergerakanKiri kiri = new PergerakanKiri();
        PergerakanKanan kanan = new PergerakanKanan();

        // Penanda teks diubah menjadi ANGGOTA KANAN 10
        System.out.println("=== SKENARIO PENYELESAIAN RUBIK - ANGGOTA KANAN 10 ===");

        // --- ALUR GERAKAN DISAMAKAN PERSIS DENGAN TEMANMU ---
        kiri.infoTangan();
        kiri.putarAtas(2);     // Kiri putar atas 2x

        kanan.infoTangan();
        kanan.putarBawah(2);   // Kanan putar bawah 2x

        kanan.putarKiri();     // Kanan putar kiri 1x

        kiri.putarKanan();     // Kiri putar kanan 1x

        // --- Menampilkan Statistik Akhir ---
        System.out.println();
        System.out.println("Total gerakan tangan kiri: " + kiri.getTotalGerakan());
        System.out.println("Total gerakan tangan kanan: " + kanan.getTotalGerakan()); 
    }
}
