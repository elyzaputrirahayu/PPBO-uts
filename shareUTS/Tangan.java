// File: shared/Tangan.java
package shared;

public class Tangan {
    // 1. ENKAPSULASI: Atribut di-set private
    private String jenisTangan;
    private int totalGerakan;

    // Konstruktor
    public Tangan(String jenisTangan) {
        this.jenisTangan = jenisTangan;
        this.totalGerakan = 0;
    }

    // Getter dan Setter untuk Enkapsulasi
    public String getJenisTangan() {
        return jenisTangan;
    }

    public int getTotalGerakan() {
        return totalGerakan;
    }

    public void tambahGerakan(int jumlah) {
        this.totalGerakan += jumlah;
    }

    // Metode yang akan di-Override oleh kelas anak
    public void infoTangan() {
        System.out.println("Ini adalah komponen pergerakan rubik.");
    }
}