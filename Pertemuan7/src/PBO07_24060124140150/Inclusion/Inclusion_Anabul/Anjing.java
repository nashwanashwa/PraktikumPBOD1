package PBO07_24060124140150.Inclusion.Inclusion_Anabul;
/* Nama File    : Anjing.java
 * NIM          : 24060124140150 
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 24 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String Nama) {
        super(Nama);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Anjing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Anjing) Bersuara: Guk-guk");
    }
}
