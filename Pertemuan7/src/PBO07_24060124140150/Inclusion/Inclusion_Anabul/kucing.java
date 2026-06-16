package PBO07_24060124140150.Inclusion.Inclusion_Anabul;
/* Nama File    : kucing.java
 * NIM          : 24060124140150 
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 24 April 2026
 */

public class kucing extends Anabul {
    public kucing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kucing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kucing) Bersuara: Meong");
    }
}
