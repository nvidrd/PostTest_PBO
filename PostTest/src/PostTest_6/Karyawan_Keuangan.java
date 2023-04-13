package PostTest_6;

import PostTest_5.Karyawan;

public class Karyawan_Keuangan extends Karyawan {
    private int id_keuangan;
    private final String role = "Karyawan Keuangan";

    public Karyawan_Keuangan(String Nama, String Nohp, String Jabatan, String Alamat, int ID_Keuangan, String role){
        super(Nama, Nohp, Jabatan, Alamat);
        this.setId_keuangan(ID_Keuangan);
    }

    public int getId_keuangan() {
        return id_keuangan;
    }

    public void setId_keuangan(int id_hrd) {
        this.id_keuangan = id_hrd;
    }

    @Override
    public void sukses_add(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("|              DATA DITAMBAHKAN               |");
        System.out.println("-----------------------------------------------");
        System.out.println("ID Karyawan            : KK" + this.getId_keuangan());
        System.out.println("Nama Karyawan          : " + this.getNama());
        System.out.println("No. HP Karyawan        : " + this.getNohp());
        System.out.println("Jabatan Karyawan       : " + this.getJabatan());
        System.out.println("Alamat Karyawan        : " + this.getAlamat());
    }
    @Override
    public void sukses_upd(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData " + this.role + " dengan ID KK" + this.getId_keuangan() + " Berhasil diupdate." +
                        "\n-----------------------------------------------"
        );
    }
}
