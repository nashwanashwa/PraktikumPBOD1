package PBO08_24060124140150;
/* Nama File    : Burung.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 28 April 2026
 */

public class Burung extends Anabul {
    public Burung(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Burung) Gerak: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Burung) Bersuara: Cuit");
    }
}