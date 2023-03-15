package PostTest_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class CRUD {
    static ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    // TAMBAH DATA
    static void createData() throws IOException{
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU TAMBAH DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukkan ID Karyawan: ");
        int id = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nama Karyawan: ");
        String nama = br.readLine();
        System.out.print("Masukkan No. HP Karyawan: ");
        String nohp = br.readLine();
        System.out.print("Masukkan Jabatan Karyawan: ");
        String jabatan = br.readLine();
        System.out.print("Masukkan Alamat Karyawan: ");
        String alamat = br.readLine();

        Karyawan newKaryawan = new Karyawan(id, nama, nohp, jabatan, alamat);
        karyawan.add(newKaryawan);

        // Panggil method sukses_add
        newKaryawan.sukses_add();
    }

    // TAMPIL DATA
    static void readData() throws IOException{
        if (karyawan.isEmpty()){
            System.out.println("-----------------------------------------------");
            System.out.println("|                DATA KOSONG                  |");
            System.out.println("-----------------------------------------------");
        } else {
            for(int i=0; i< karyawan.size(); i++){
                System.out.println("-----------------------------------------------");
                System.out.println("|              Data karyawan ke-" + (i+1) + "             |");
                System.out.println("-----------------------------------------------");

                // Ambil data
                System.out.println("ID Karyawan: " + karyawan.get(i).getId());
                System.out.println("Nama Karyawan: " + karyawan.get(i).getNama());
                System.out.println("No. HP Karyawan: " + karyawan.get(i).getNohp());
                System.out.println("Jabatan Karyawan: " + karyawan.get(i).getJabatan());
                System.out.println("Alamat Karyawan: " + karyawan.get(i).getAlamat() + "\n");
            }
        }
    }

    // UBAH DATA
    static void updateData() throws IOException{
        // Tampilkan terlebih dahulu datanya
        readData();

        // Baru update data
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU UPDATE DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.print("Data karyawan ke berapa yang ingin diupdate? ");
        int ind = Integer.parseInt(br.readLine());
        int index = ind - 1;
        // Encapsulation
        System.out.print("Masukkan data Nama baru: ");
        karyawan.get(index).setNama(br.readLine());
        System.out.print("Masukkan data No. HP baru: ");
        karyawan.get(index).setNohp(br.readLine());
        System.out.print("Masukkan data Jabatan baru: ");
        karyawan.get(index).setJabatan(br.readLine());
        System.out.print("Masukkan data Alamat baru: ");
        karyawan.get(index).setAlamat(br.readLine());

        // Panggil method suskes_upd
        karyawan.get(index).sukses_upd();
    }
    // HAPUS DATA
    static void deleteData() throws IOException{
        System.out.println("");
        readData();

        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU DELETE DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.print("Data karyawan ke berapa yang ingin dihapus? ");
        int ind = Integer.parseInt(br.readLine());
        int index = ind - 1;
        karyawan.remove(index);

        System.out.println("\nData Karyawan berhasil dihapus.");
    }

    //  EXIT PROGRAM
    static void exit() throws IOException{
        System.out.println("\n\n+++   Terima kasih telah menggunakan program   +++");
        System.out.println("+++    semoga hari Anda selalu hahahihii ><    +++\n");
        System.exit(0);
    }
}
