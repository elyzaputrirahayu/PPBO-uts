package tangankanan;

import shareUTS.Tangan; // RELASI KELAS: Mengambil kelas Tangan dari package shareuts

public class PergerakanKanan extends Tangan { // PEWARISAN: Mewarisi sifat kelas tangan

    // KONSTRUKTOR: Memperbaiki eror implisit super constructor yang tadi
    public PergerakanKanan() {
        super("Tangan Kanan"); // Mengirimkan argumen ke kelas induk
    }

    // 1. OVERRIDING: Mengubah perilaku metode infoTangan milik kelas induk
    @Override
    public void infoTangan() {
        System.out.println("[Info] Menggunakan " + getJenisTangan() + " untuk manipulasi sisi kanan rubik.");
    }

    // 2. OVERLOADING Metode putarAtas (Bentuk 1: Tanpa Parameter / Default 1x)
    public void putarAtas() {
        tambahGerakan(1); // Enkapsulasi: Mengakses metode penambah gerakan
        System.out.println("[Tangan Kanan] -> Memutar sisi ATAS rubik (1x).");
    }

    // OVERLOADING Metode putarAtas (Bentuk 2: Dengan Parameter Jumlah)
    public void putarAtas(int jumlah) {
        tambahGerakan(jumlah);
        System.out.println("[Tangan Kanan] -> Memutar sisi ATAS rubik sebanyak (" + jumlah + "x).");
    }

    // 3. OVERLOADING Metode putarBawah (Bentuk 1: Tanpa Parameter)
    public void putarBawah() {
        tambahGerakan(1);
        System.out.println("[Tangan Kanan] -> Memutar sisi BAWAH rubik (1x).");
    }

    // OVERLOADING Metode putarBawah (Bentuk 2: Dengan Parameter Jumlah)
    public void putarBawah(int jumlah) {
        tambahGerakan(jumlah);
        System.out.println("[Tangan Kanan] -> Memutar sisi BAWAH rubik sebanyak (" + jumlah + "x).");
    }

    // Metode Pergerakan Tambahan
    public void putarKiri() {
        tambahGerakan(1);
        System.out.println("[Tangan Kanan] -> Memutar sisi KIRI rubik (1x).");
    }

    public void putarKanan() {
        tambahGerakan(1);
        System.out.println("[Tangan Kanan] -> Memutar sisi KANAN rubik (1x).");
    }
}