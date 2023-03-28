package PostTest_4;

public class Karyawan_Personalia extends Karyawan {
    private int id_hrd;

    public Karyawan_Personalia(String Nama, String Nohp, String Jabatan, String Alamat, int ID_Hrd){
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
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KP" + this.getId_hrd()+ " dengan Nama " + this.getNama() + "\nBerhasil Ditambahkan." +
                        "\n-----------------------------------------------"
        );
    }
    @Override
    void sukses_upd(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KP" + this.getId_hrd() + " Berhasil diupdate." +
                        "\n-----------------------------------------------"
        );
    }
}
