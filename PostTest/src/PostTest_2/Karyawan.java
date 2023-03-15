package PostTest_2;

public class Karyawan {
    // Property Data Karyawan
    private int id;
    private String nama;
    private String nohp;
    private String jabatan;
    private String alamat;


    public Karyawan (int ID, String Nama, String Nohp, String Jabatan, String Alamat){
        this.setId(ID);
        this.setNama(Nama);
        this.setNohp(Nohp);
        this.setJabatan(Jabatan);
        this.setAlamat(Alamat);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

