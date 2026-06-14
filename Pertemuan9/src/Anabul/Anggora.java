package Anabul;

public class Anggora extends Kucing {
    public Anggora(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Anggora) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Anggora) Bersuara: Meong");
    }  
}