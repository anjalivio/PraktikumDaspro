import java.util.Scanner;
public class Pemilihan2Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku, hari;
        int jumlahBuku;
        double diskon = 0;

        System.out.print("Hari apa sekarang? ");
        hari = sc.nextLine();
        System.out.print("Masukkan jenis buku yang dibeli : ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = sc.nextInt();

        System.out.println(hari);
        System.out.println(jenisBuku);
        System.out.println(jumlahBuku);

        if (hari.equalsIgnoreCase("Rabu")) {
            if (jenisBuku.equalsIgnoreCase("Kamus")) {
                diskon = 0.1;

                if (jumlahBuku > 2 ) {
                    diskon += 0.02;
                }
            }else if (jenisBuku.equalsIgnoreCase("Novel")) {
                diskon = 0.07;
                if (jumlahBuku > 3) {
                    diskon += 0.02;
                }else{
                    diskon += 0.01;
                }
            }else{
                if (jumlahBuku > 3) {
                    diskon = 0.05;
                }
            }
            System.out.println("Jumlah diskon anda : " + diskon );
        }
    }
}
