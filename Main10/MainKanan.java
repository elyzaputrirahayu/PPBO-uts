package Main10;

import tangankiri.PergerakanKiri;
import tangankanan.PergerakanKanan;

public class MainKanan {
    public static void main(String[] args) {
        PergerakanKiri kiri = new PergerakanKiri();
        PergerakanKanan kanan = new PergerakanKanan();

        System.out.println("=== SKENARIO RUBIK ANGGOTA KANAN ===");

        kanan.infoTangan();
        kanan.putarAtas(2);
        kanan.putarBawah(3);
        kanan.putarKiri();
        kanan.putarKanan();

        System.out.println();

        kiri.infoTangan();
        kiri.putarAtas(2);
        kiri.putarBawah();
        kiri.putarKiri();
        kiri.putarKanan();

        System.out.println();
        System.out.println("Total gerakan tangan kanan: "
                + kanan.getTotalGerakan());
        System.out.println("Total gerakan tangan kiri: "
                + kiri.getTotalGerakan());
    }
}
