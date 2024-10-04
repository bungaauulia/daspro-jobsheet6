import java.util.Scanner;
public class Pemilihan2Percobaan204 {

    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);

        String member;
        double diskon, totalHarga, harga;
        int menu, jumlah;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Es Teh");
        System.out.println("3. Paket Bundling (Ricebowl + Es )");
        System.out.println("-------------------------");
        System.out.print("Apakah punya member (yes/no)?: ");
        member = input04.nextLine();
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        menu = input04.nextInt();
        System.out.println("-------------------------");

        if (member.equalsIgnoreCase("yes")){
            diskon = 0.1;
            System.out.println("Besar diskon 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: Rp." + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Es Teh: Rp." + harga);


            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling: Rp." + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }
            totalHarga = (harga - (harga*diskon));
            System.out.println("Total bayar setelah diskon: Rp." + totalHarga);

        } else if (member.equalsIgnoreCase("no")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: Rp." + harga);
            
            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga Es Teh: Rp." + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundling: Rp." + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar!");
                return;
            }
            System.out.println("Total bayar: Rp." + harga);

        }
    }
}