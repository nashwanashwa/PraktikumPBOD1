package PBO07_24060124140150.Inclusion.Inclusion_Anabul;

/* Nama File    : burung.java
 * NIM          : 24060124140150 
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 24 April 2026
 */

public class burung extends Anabul {
    public burung(String Nama) {
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
