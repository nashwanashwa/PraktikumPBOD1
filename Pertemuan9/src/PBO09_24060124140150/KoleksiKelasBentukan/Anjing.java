package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : Anjing.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Anjing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Anjing) Bersuara: Guk-guk");
    }

    @Override
    public String toString() {
        return "Anjing";
    }
}