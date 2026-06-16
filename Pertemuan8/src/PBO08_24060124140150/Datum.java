package PBO08_24060124140150;
/* Nama File    : Datum.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 28 April 2026
 */

/* 2. Kelas Generik bernama Datum */
public class Datum<Generik> {
    private Generik isi;

    public Datum(Generik isi) {   
        this.isi = isi;
    }

    public Generik getIsi() {
        return isi;
    }

    public void setIsi(Generik isibaru) {
        isi = isibaru;
    }
}
