import java.util.Scanner;

public class ProgramManajemenStokToko {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaBarang;
        int stok, permintaan;
        double hargaPerUnit, totalNilaiStok;

        while (true) {
            
            System.out.println("Masukkan nama barang (atau ketik 'selesai' untuk keluar): ");
            namaBarang = scanner.nextLine();
            if (namaBarang.equalsIgnoreCase("selesai")) {
                break;
            }

            
            System.out.println("Masukkan jumlah stok untuk " + namaBarang + ": ");
            stok = scanner.nextInt();
            System.out.println("Masukkan harga per unit untuk " + namaBarang + ": ");
            hargaPerUnit = scanner.nextDouble();
            scanner.nextLine();  

            
            totalNilaiStok = stok * hargaPerUnit;
            System.out.println("Total nilai stok untuk " + namaBarang + ": " + totalNilaiStok);

            
            System.out.println("Masukkan jumlah permintaan untuk " + namaBarang + ": ");
            permintaan = scanner.nextInt();
            scanner.nextLine(); 

            if (permintaan <= stok) {
                stok -= permintaan;
                System.out.println("Permintaan berhasil dipenuhi. Sisa stok: " + stok);
            } else {
                System.out.println("Stok tidak mencukupi. Stok tersedia: " + stok);
            }

            System.out.println();  
        }

        System.out.println("Program selesai.");
        scanner.close();
    }
}
