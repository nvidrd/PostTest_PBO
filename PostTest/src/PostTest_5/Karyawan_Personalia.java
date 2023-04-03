package PostTest_5;



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
        System.out.println(
                "\n-----------------------------------------------" +
                        "\nData ID KP" + this.getId_hrd()+ " dengan Nama " + this.getNama() + "\nBerhasil Ditambahkan." +
                        "\n-----------------------------------------------"
        );
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

