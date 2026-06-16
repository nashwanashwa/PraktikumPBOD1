package PBO08_24060124140150;
/* Nama File    : Kucing.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 28 April 2026
 */

public class Kucing extends Anabul {
    /* 1. a) Atribut bobot dalam kelas Kucing yang menyatakan berat dakam kilogram */
    protected double bobot;

    public Kucing(String Nama, double bobot) {
        super(Nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kucing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kucing) Bersuara: Meong");
    }

    @Override
    public String toString() {
        return "Kucing";
    }
}
