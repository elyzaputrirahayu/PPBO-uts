package tangankiri;

import shareUTS.Tangan;

public class PergerakanKiri extends Tangan {
    public PergerakanKiri() {
        super("Tangan Kiri");
    }

    @Override
    public void infoTangan() {
        System.out.println("Ini adalah tangan kiri untuk memutar rubik.");
    }

    // Overloading: gerakan ke atas satu kali
    public void putarAtas() {
        putarAtas(1);
    }

    // Overloading: gerakan ke atas dengan jumlah tertentu
    public void putarAtas(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah gerakan harus lebih dari 0.");
            return;
        }

        tambahGerakan(jumlah);
        System.out.println("Tangan kiri memutar rubik ke atas sebanyak " + jumlah + " kali.");
    }

    public void putarBawah() {
        tambahGerakan(1);
        System.out.println("Tangan kiri memutar rubik ke bawah.");
    }

    public void putarKanan() {
        tambahGerakan(1);
        System.out.println("Tangan kiri memutar rubik ke kanan.");
    }

    public void putarKiri() {
        tambahGerakan(1);
        System.out.println("Tangan kiri memutar rubik ke kiri.");
    }
}