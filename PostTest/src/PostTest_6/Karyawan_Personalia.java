package PostTest_6;

import PostTest_5.Karyawan;

public class Karyawan_Personalia extends Karyawan {
    private int id_hrd;
    private final String role = "Karyawan Personalia";

    public Karyawan_Personalia(String Nama, String Nohp, String Jabatan, String Alamat, int ID_Hrd, String role){
        super(Nama, Nohp, Jabatan, Alamat);
        this.setId_hrd(ID_Hrd);
    }

    public int getId_hrd() {
        return id_hrd;
    }

    public void setId_hrd(int id_hrd) {
        this.id_hrd = id_hrd;
    }

    @Override
    public void sukses_add(){
        System.out.println("\n-----------------------------------------------");
        System.out.println("|              DATA DITAMBAHKAN               |");
        System.out.println("-----------------------------------------------");
        System.out.println("ID Karyawan            : KP" + this.getId_hrd());
        System.out.println("Nama Karyawan          : " + this.getNama());
        System.out.println("No. HP Karyawan        : " + this.getNohp());
        System.out.println("Jabatan Karyawan       : " + this.getJabatan());
        System.out.println("Alamat Karyawan        : " + this.getAlamat());
    }
    @Override
    public void sukses_upd(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData " + this.role + " dengan ID KP" + this.getId_hrd() + " Berhasil diupdate." +
                        "\n-----------------------------------------------"
        );
    }
}
