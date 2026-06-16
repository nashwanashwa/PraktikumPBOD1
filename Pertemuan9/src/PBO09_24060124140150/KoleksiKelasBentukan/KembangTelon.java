package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : KembangTelon.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class KembangTelon {
    public class Kembangtelon extends Kucing {
        public Kembangtelon(String panggilan, double bobot) {
            super(panggilan, bobot);
        }

        @Override
        public void Gerak() {
            System.out.println(panggilan + " (Kembangtelon) Gerak: Melata");
        }

        @Override
        public void Bersuara() {
            System.out.println(panggilan + " (Kembangtelon) Bersuara: Meong");
        }
    }  
}