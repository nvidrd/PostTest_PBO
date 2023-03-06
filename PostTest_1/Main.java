/*
Nama  : Novia Indah Ramadhani
NIM   : 2109106041
Kelas : Informatika A2-21
POST TEST 1 || "SISTEM PENDATAAN KARYAWAN PERUSAHAAN"
*/

package PostTest_1;

// IMPORT LIBRARY
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        static ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>();
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{


        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("\n---------- SISTEM PENDATAAN KARYAWAN ----------");
            System.out.println("|           PT. MENCARI CINTA SEJATI          |");
            System.out.println("-----------------------------------------------");
            System.out.println("| [1] Tambah Data                             |");
            System.out.println("| [2] Tampil Data                             |");
            System.out.println("| [3] Update Data                             |");
            System.out.println("| [4] Hapus Data                              |");
            System.out.println("| [5] Exit...                                 |");
            System.out.println("-----------------------------------------------");
            System.out.print("Masukkan Pilihan: ");


            int menu = Integer.parseInt(br.readLine());
            // TAMBAH DATA
            if (menu == 1) {
                CRUD.createData();
            }

            // TAMPIL DATA
            else if (menu == 2) {
                System.out.println("\n-----------------------------------------------");
                System.out.println("|          MENU TAMPIL DATA KARYAWAN          |");
                CRUD.readData();
            }

            // UPDATE DATA
            else if (menu == 3) {
                System.out.println("");
                CRUD.updateData();
            }

            // HAPUS DATA
            else if (menu == 4) {
                System.out.println("");
                CRUD.deleteData();
            }

            // EXIT
            else if (menu == 5) {
                System.out.println("\n+++++   Terima kasih telah menggunakan program, semoga hari Anda selalu hahahihii ><   +++++");
                break;
            }

            else {
                System.out.println("Pilihan menu tidak tersedia.");
            }
        }
    }
}
