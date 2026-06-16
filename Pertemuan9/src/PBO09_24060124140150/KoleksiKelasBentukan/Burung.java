package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : Burung.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Burung) Gerak: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Burung) Bersuara: Cuit");
    }
}    