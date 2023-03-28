package PostTest_4;


// IMPORT LIBRARY
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // MENU
    static void main_menu() throws IOException{
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

        switch (menu){
            case 1 -> PostTest_4.CRUD.createData();
            case 2 -> {
                System.out.println("\n-----------------------------------------------");
                System.out.println("|          MENU TAMPIL DATA KARYAWAN          |");
                PostTest_4.CRUD.readData();
            }
            case 3 -> PostTest_4.CRUD.updateData();
            case 4 -> PostTest_4.CRUD.deleteData();
            case 5 -> PostTest_4.CRUD.exit();
            default -> System.out.println("Pilihan menu tidak tersedia.");
        }
    }

    public static void main(String[] args)throws IOException{
        while(true){
            main_menu();
        }
    }
}

