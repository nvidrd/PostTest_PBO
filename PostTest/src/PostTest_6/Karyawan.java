package PostTest_6;

public abstract class Karyawan {
    // Property Data Karyawan
    private String nama;
    private String nohp;
    private String jabatan;
    private String alamat;


    public Karyawan (String Nama, String Nohp, String Jabatan, String Alamat){
        this.setNama(Nama);
        this.setNohp(Nohp);
        this.setJabatan(Jabatan);
        this.setAlamat(Alamat);
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

    public abstract void sukses_upd();
    public abstract void sukses_add();

}

