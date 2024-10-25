import java.util.ArrayList;
import java.util.Scanner;

public class ProgramManajemenSiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> nilaiSiswa = new ArrayList<>();
        String input;
        double total = 0;
        int jumlahDiAtasRataRata = 0;
        int jumlahDiBawahRataRata = 0;

        
        while (true) {
            System.out.println("Masukkan nama siswa (atau ketik 'selesai' untuk berhenti): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.println("Masukkan nilai untuk " + input + ": ");
            double nilai = scanner.nextDouble();
            scanner.nextLine();  

            nilaiSiswa.add(nilai);
            total += nilai;  
        }

        double rataRata = total / nilaiSiswa.size();
        System.out.println("Rata-rata kelas: " + rataRata);

        
        for (double nilai : nilaiSiswa) {
            if (nilai > rataRata) {
                jumlahDiAtasRataRata++;
            } else if (nilai < rataRata) {
                jumlahDiBawahRataRata++;
            }
        }

        System.out.println("Jumlah siswa dengan nilai di atas rata-rata: " + jumlahDiAtasRataRata);
        System.out.println("Jumlah siswa dengan nilai di bawah rata-rata: " + jumlahDiBawahRataRata);

        if (jumlahDiAtasRataRata > nilaiSiswa.size() / 2) {
            System.out.println("Mayoritas siswa memiliki nilai di atas rata-rata.");
        } else {
            System.out.println("Mayoritas siswa tidak memiliki nilai di atas rata-rata.");
        }

        scanner.close();
    }
}
