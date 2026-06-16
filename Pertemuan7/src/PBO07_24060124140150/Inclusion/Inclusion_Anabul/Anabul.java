package PBO07_24060124140150.Inclusion.Inclusion_Anabul;

/* Nama File    : Anabul.java
 * NIM          : 24060124140150 
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 21 April 2026
 */

/* III. POLIMORFISME UNIVERSAL INCLUSION
   3. Kelas induk: Anabul
      Kelas anak: Kucing, Anjing, Burung */
public abstract class Anabul {
    protected String Nama;

    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    public abstract void Gerak();
    public abstract void Bersuara();
}