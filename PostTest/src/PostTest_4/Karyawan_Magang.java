package PostTest_4;

public class Karyawan_Magang extends Karyawan {
    private int id_magang;
    private String masa_magang;

    public Karyawan_Magang(String Nama, String Nohp, String Jabatan, String Alamat, int ID_magang, String Masa_Magang){
        super(Nama, Nohp, Jabatan, Alamat);
        this.setId_magang(ID_magang);
        this.setMasa_magang(Masa_Magang);
    }

    public int getId_magang() {
        return id_magang;
    }

    public void setId_magang(int id_magang) {
        this.id_magang = id_magang;
    }

    public String getMasa_magang() {
        return masa_magang;
    }

    public void setMasa_magang(String masa_magang) {
        this.masa_magang = masa_magang;
    }

    @Override
    public void sukses_add(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KM" + this.getId_magang()+ " dengan Nama " + this.getNama() + "\nBerhasil Ditambahkan." +
                        "\n-----------------------------------------------"
        );
    }

    @Override
    void sukses_upd(){
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KP" + this.getId_magang() + " Berhasil diupdate." +
                        "\n-----------------------------------------------"
        );
    }
}
