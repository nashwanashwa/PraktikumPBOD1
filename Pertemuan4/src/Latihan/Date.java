/* Nama File    : Dosen.java
 * Deskipsi     : berisi atribut dan method dalam class Date
 * Pembuat      : Nashwa Aldebaran/24060124140150  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

public class Date {
    private int Hari;
    private int Bulan;
    private int Tahun;

    public Date() {
    }

    public Date(int Hari, int Bulan, int Tahun) {
        this.Hari = Hari;
        this.Bulan = Bulan;
        this.Tahun = Tahun;
    }

    public int getHari() {
        return Hari;
    }

    public void setHari(int Hari) {
        this.Hari = Hari;
    }

    public int getBulan() {
        return Bulan;
    }

    public void setBulan(int Bulan) {
        this.Bulan = Bulan;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

    public String getNamaBulan() {

        String[] nama = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November","Desember"
        };
        return nama[Bulan-1];
    }

    public String formatTanggal() {
        return Hari + " " + getNamaBulan() + " " + Tahun;
    }
}
