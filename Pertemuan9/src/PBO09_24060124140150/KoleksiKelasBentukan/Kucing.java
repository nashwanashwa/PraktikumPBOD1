package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : Kucing.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String panggilan, double bobot) {
        super(panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Kucing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Kucing) Bersuara: Meong");
    }

    @Override
    public String toString() {
        return "Kucing";
    }
}   