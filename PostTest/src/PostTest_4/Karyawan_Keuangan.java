package PostTest_4;

public class Karyawan_Keuangan extends Karyawan {
    private int id_keuangan;

    public Karyawan_Keuangan(String Nama, String Nohp, String Jabatan, String Alamat, int ID_Keuangan){
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
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KK" + this.getId_keuangan()+ " dengan Nama " + this.getNama() + "\nBerhasil Ditambahkan." +
                        "\n-----------------------------------------------"
        );
    }
    @Override
    void sukses_upd(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KP" + this.getId_keuangan() + " Berhasil diupdate." +
                        "\n-----------------------------------------------"
        );
    }
}
