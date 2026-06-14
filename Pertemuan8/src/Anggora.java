/* 1. b) Kelas Anggora yang mewarisi kelas Kucing */
public class Anggora extends Kucing {
    public Anggora(String Nama, double bobot) {
        super(Nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Anggora) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Anggora) Bersuara: Meong");
    }  
}