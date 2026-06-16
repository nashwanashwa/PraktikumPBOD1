package PBO08_24060124140150;
/* Nama File    : KembangTelon.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 28 April 2026
 */

/* 1. b) Kelas Kembangtelon yang mewarisi kelas Kucing */
public class KembangTelon extends Kucing {
    public KembangTelon(String Nama, double bobot) {
        super(Nama, bobot);
    }

    @Override
    public void Gerak() {
        System.out.println(Nama + " (Kembangtelon) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(Nama + " (Kembangtelon) Bersuara: Meong");
    }
}