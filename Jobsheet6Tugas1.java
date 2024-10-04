import java.util.Scanner;
public class Jobsheet6Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bil1, bil2, bil3;

        System.out.print("Masukkan bilangan 1: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan 3: ");
        bil3 = sc.nextInt();


        if (bil1 > bil2){
            if (bil1 > bil3);
            System.out.print("Bilangan terbesar adalah: " + bil1);
        
        } else if (bil2 > bil3) {
             if (bil2 > bil1);
            System.out.print("Bilangan terbesar adalah: " + bil2);

        } else 
        System.out.print("Bilangan terbesar adalah: " + bil3);

    }

    }
