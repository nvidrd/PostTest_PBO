package PostTest_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CRUD {
    static ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // TAMBAH DATA
    public static void createData() throws IOException {
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU TAMBAH DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");

        System.out.print("Masukkan ID Karyawan: ");
        int add_id = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nama Karyawan: ");
        String add_nama = br.readLine();
        System.out.print("Masukkan No. HP Karyawan: ");
        String add_nohp = br.readLine();
        System.out.print("Masukkan Jabatan Karyawan: ");
        String add_jabatan = br.readLine();
        System.out.print("Masukkan Alamat Karyawan: ");
        String add_alamat = br.readLine();

        Karyawan newKaryawan = new Karyawan(add_id, add_nama, add_nohp, add_jabatan, add_alamat);
        karyawan.add(newKaryawan);

        // Panggil method sukses_add
        newKaryawan.sukses_add();
    }

    // TAMPIL DATA
    public static void readData() throws IOException {
        for (int i=0; i<karyawan.size(); i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("|              Data karyawan ke-" + (i+1) + "             |");
            System.out.println("-----------------------------------------------");

            // Ambil data dari array list
            System.out.println("ID Karyawan: " + karyawan.get(i).id);
            System.out.println("Nama Karyawan: " + karyawan.get(i).nama);
            System.out.println("No. HP Karyawan: " + karyawan.get(i).nohp);
            System.out.println("Jabatan Karyawan: " + karyawan.get(i).jabatan);
            System.out.println("Alamat Karyawan: " + karyawan.get(i).alamat + "\n");
        }
    }

    // UPDATE DATA
    public static void updateData() throws IOException{
        // Tampilkan terlebih dahulu datanya
        readData();

        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU UPDATE DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.print("Data karyawan ke berapa yang ingin diupdate? ");
        int ind = Integer.parseInt(br.readLine());
        int index = ind - 1;

        System.out.print("Masukkan data Nama baru: ");
        String setNama = br.readLine();
        System.out.print("Masukkan data No. HP baru: ");
        String setNohp = br.readLine();
        System.out.print("Masukkan data Jabatan baru: ");
        String setJabatan = br.readLine();
        System.out.print("Masukkan data Alamat baru: ");
        String setAlamat = br.readLine();

        // Ganti data baru ke array list
        karyawan.get(index).nama = setNama;
        karyawan.get(index).nohp = setNohp;
        karyawan.get(index).jabatan = setJabatan;
        karyawan.get(index).alamat = setAlamat;

        // Panggil method suskes_upd
        karyawan.get(index).sukses_upd();
    }

    // HAPUS DATA
    public static void deleteData() throws IOException {
        // Tampilkan terlebih dahulu datanya
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
}

