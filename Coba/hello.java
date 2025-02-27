import java.util.Random;
import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        System.out.print("hallo");
        System.out.println(" bajingan ");
        

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int angkaRahasia = random.nextInt(100) + 1; // Angka acak antara 1 dan 100
        int tebakan = 0;
        int jumlahTebakan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 dan 100. Coba tebak!");

        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Tebakan Anda terlalu rendah. Coba lagi!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Tebakan Anda terlalu tinggi. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda telah menebak angka yang benar: " + angkaRahasia);
                System.out.println("Jumlah tebakan Anda: " + jumlahTebakan);
            }
            
        }

    }
}