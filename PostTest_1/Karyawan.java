package PostTest_1;

public class Karyawan {
    // Property Data Karyawan
    int id;
    String nama;
    String nohp;
    String jabatan;
    String alamat;


    public Karyawan (int ID, String Nama, String Nohp, String Jabatan, String Alamat){
        this.id = ID;
        this.nama = Nama;
        this.nohp = Nohp;
        this.jabatan = Jabatan;
        this.alamat = Alamat;
    }

    // ALL METHOD HERE
    void sukses_add(){
        System.out.println("\n-----------------------------------------------" +
                "\nData ID " + this.id +
                ", dengan Nama " + this.nama + "\nBerhasil Ditambahkan." +
                "\n-----------------------------------------------");
    }

    void sukses_upd(){
        System.out.println("\nData Karyawan " + this.nama + " Berhasil diupdate.");
    }

    void sukses_del(){
        System.out.println("\nData Karyawan berhasil dihapus.");
    }

}
