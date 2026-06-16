package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : Anggora.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

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
