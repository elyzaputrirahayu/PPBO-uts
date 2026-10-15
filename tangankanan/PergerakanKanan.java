package tangankanan;

import shareUTS.Tangan; 

public class PergerakanKanan extends Tangan { 

    public PergerakanKanan() {
        super("Tangan Kanan"); 
    }

    @Override
    public void infoTangan() {
        System.out.println("[Info] Menggunakan " + getJenisTangan() + " untuk manipulasi sisi kanan rubik.");
    }

    // 2. OVERLOADING Metode putarAtas (Bentuk 1: Tanpa Parameter)
    public void putarAtas() {
        tambahGerakan(1); 
        System.out.println("[Tangan Kanan] -> Memutar sisi ATAS rubik (1x).");
    }

    // DISISIPKAN: OVERLOADING Metode putarAtas (Bentuk 2: Dengan Parameter Jumlah)
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

    public void putarKiri() {
        tambahGerakan(1);
        System.out.println("[Tangan Kanan] -> Memutar sisi KIRI rubik (1x).");
    }

    public void putarKanan() {
        tambahGerakan(1);
        System.out.println("[Tangan Kanan] -> Memutar sisi KANAN rubik (1x).");
    }
}
