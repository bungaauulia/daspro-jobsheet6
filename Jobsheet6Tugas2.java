import java.util.Scanner;
public class Jobsheet6Tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.println("Total diskon: " + (diskon * 100) + "%");
    }
}