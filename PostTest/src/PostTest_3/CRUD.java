package PostTest_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CRUD {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Karyawan_Keuangan> kyw_keuangan = new ArrayList<>();
    static ArrayList<Karyawan_Personalia> kyw_hrd = new ArrayList<>();

    // TAMBAH DATA
    static void createData() throws IOException {
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU TAMBAH DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.println("| [1] Karyawan Keuangan                       |");
        System.out.println("| [2] Karyawan Personalia                     |");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Pilihan: ");
        int menu = Integer.parseInt(br.readLine());

        switch (menu){
            case 1 -> {
                System.out.print("Masukkan ID Karyawan: ");
                int id_k = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Karyawan: ");
                String nama = br.readLine();
                System.out.print("Masukkan No. HP Karyawan: ");
                String nohp = br.readLine();
                System.out.print("Masukkan Jabatan Karyawan: ");
                String jabatan = br.readLine();
                System.out.print("Masukkan Alamat Karyawan: ");
                String alamat = br.readLine();

                // Plis ini harus sesuai urutan sm yg di class karyawn_keuangan brok!
                Karyawan_Keuangan newKaryawan = new Karyawan_Keuangan(nama, nohp, jabatan, alamat, id_k);
                kyw_keuangan.add(newKaryawan);

                // Panggil method sukses_add
                newKaryawan.sukses_add();

            }
            case 2 -> {
                System.out.print("Masukkan ID Karyawan: ");
                int id_h = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nama Karyawan: ");
                String nama = br.readLine();
                System.out.print("Masukkan No. HP Karyawan: ");
                String nohp = br.readLine();
                System.out.print("Masukkan Jabatan Karyawan: ");
                String jabatan = br.readLine();
                System.out.print("Masukkan Alamat Karyawan: ");
                String alamat = br.readLine();

                // Plisss ini harus sesuai urutan sm yg di class karyawn_keuangan brok!
                Karyawan_Personalia newKaryawan = new Karyawan_Personalia(nama, nohp, jabatan, alamat, id_h);
                kyw_hrd.add(newKaryawan);

                // Panggil method sukses_add
                newKaryawan.sukses_add();
            }
            default -> System.out.println("Pilihan menu tidak tersedia.");
        }
    }

    // TAMPIL DATA
    static void readData() throws IOException{
        System.out.println("-----------------------------------------------");
        System.out.println("| [1] Karyawan Keuangan                       |");
        System.out.println("| [2] Karyawan Personalia                     |");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Pilihan: ");
        int menu = Integer.parseInt(br.readLine());

        switch (menu){
            case 1 -> {
                if (kyw_keuangan.isEmpty()){
                    System.out.println("-----------------------------------------------");
                    System.out.println("|                DATA KOSONG                  |");
                    System.out.println("-----------------------------------------------");
                } else {
                    for(int i=0; i< kyw_keuangan.size(); i++){
                        System.out.println("-----------------------------------------------");
                        System.out.println("|              Data karyawan ke-" + (i+1) + "             |");
                        System.out.println("-----------------------------------------------");

                        // Ambil data
                        System.out.println("ID Karyawan: " + kyw_keuangan.get(i).getId_keuangan());
                        System.out.println("Nama Karyawan: " + kyw_keuangan.get(i).getNama());
                        System.out.println("No. HP Karyawan: " + kyw_keuangan.get(i).getNohp());
                        System.out.println("Jabatan Karyawan: " + kyw_keuangan.get(i).getJabatan());
                        System.out.println("Alamat Karyawan: " + kyw_keuangan.get(i).getAlamat() + "\n");
                    }
                }
            }
            case 2 -> {
                if (kyw_hrd.isEmpty()){
                    System.out.println("-----------------------------------------------");
                    System.out.println("|                DATA KOSONG                  |");
                    System.out.println("-----------------------------------------------");
                } else {
                    for(int i=0; i< kyw_hrd.size(); i++){
                        System.out.println("-----------------------------------------------");
                        System.out.println("|              Data karyawan ke-" + (i+1) + "             |");
                        System.out.println("-----------------------------------------------");

                        // Ambil data
                        System.out.println("ID Karyawan: " + kyw_hrd.get(i).getId_hrd());
                        System.out.println("Nama Karyawan: " + kyw_hrd.get(i).getNama());
                        System.out.println("No. HP Karyawan: " + kyw_hrd.get(i).getNohp());
                        System.out.println("Jabatan Karyawan: " + kyw_hrd.get(i).getJabatan());
                        System.out.println("Alamat Karyawan: " + kyw_hrd.get(i).getAlamat() + "\n");
                    }
                }
            }
            default -> System.out.println("Pilihan menu tidak tersedia.");
        }
    }

    // UBAH DATA
    static void updateData() throws IOException{
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU UPDATE DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.println("| [1] Karyawan Keuangan                       |");
        System.out.println("| [2] Karyawan Personalia                     |");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Pilihan: ");
        int menu = Integer.parseInt(br.readLine());

        switch (menu){
            case 1 -> {
                System.out.println("-----------------------------------------------");
                System.out.print("Data karyawan ke berapa yang ingin diupdate? ");
                int ind = Integer.parseInt(br.readLine());
                int index = ind - 1;

                System.out.print("Masukkan data Nama baru: ");
                kyw_keuangan.get(index).setNama(br.readLine());
                System.out.print("Masukkan data No. HP baru: ");
                kyw_keuangan.get(index).setNohp(br.readLine());
                System.out.print("Masukkan data Jabatan baru: ");
                kyw_keuangan.get(index).setJabatan(br.readLine());
                System.out.print("Masukkan data Alamat baru: ");
                kyw_keuangan.get(index).setAlamat(br.readLine());

                // Panggil method suskes_upd
                kyw_keuangan.get(index).sukses_upd();
            }
            case 2 -> {
                System.out.println("-----------------------------------------------");
                System.out.print("Data karyawan ke berapa yang ingin diupdate? ");
                int ind = Integer.parseInt(br.readLine());
                int index = ind - 1;

                System.out.print("Masukkan data Nama baru: ");
                kyw_hrd.get(index).setNama(br.readLine());
                System.out.print("Masukkan data No. HP baru: ");
                kyw_hrd.get(index).setNohp(br.readLine());
                System.out.print("Masukkan data Jabatan baru: ");
                kyw_hrd.get(index).setJabatan(br.readLine());
                System.out.print("Masukkan data Alamat baru: ");
                kyw_hrd.get(index).setAlamat(br.readLine());

                // Panggil method suskes_upd
                kyw_hrd.get(index).sukses_upd();
            }
        }
    }

    // HAPUS DATA
    static void deleteData() throws IOException{
        System.out.println("\n-----------------------------------------------");
        System.out.println("|          MENU DELETE DATA KARYAWAN          |");
        System.out.println("-----------------------------------------------");
        System.out.println("| [1] Karyawan Keuangan                       |");
        System.out.println("| [2] Karyawan Personalia                     |");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan Pilihan: ");
        int menu = Integer.parseInt(br.readLine());

        switch (menu){
            case 1 -> {
                System.out.println("-----------------------------------------------");
                System.out.print("Data karyawan ke berapa yang ingin dihapus? ");
                int ind = Integer.parseInt(br.readLine());
                int index = ind - 1;
                kyw_keuangan.remove(index);

                System.out.println("\nData Karyawan berhasil dihapus.");
            }
            case 2 -> {
                System.out.println("-----------------------------------------------");
                System.out.print("Data karyawan ke berapa yang ingin dihapus? ");
                int ind = Integer.parseInt(br.readLine());
                int index = ind - 1;
                kyw_hrd.remove(index);

                System.out.println("\nData Karyawan berhasil dihapus.");
            }
        }
    }

    //  EXIT PROGRAM
    static void exit(){
        System.out.println("\n\n+++   Terima kasih telah menggunakan program   +++");
        System.out.println("+++    Program ini dikelola oleh Admin divisi Personalia   +++\n");
        System.exit(0);
    }
}
