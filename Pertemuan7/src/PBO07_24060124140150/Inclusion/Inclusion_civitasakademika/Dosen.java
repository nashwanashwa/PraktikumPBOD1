package PBO07_24060124140150.Inclusion.Inclusion_civitasakademika;
/* Nama File    : Dosen.java
 * NIM          : 24060124140150  
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 24 April 2026
 */

/* a.Kelas Dosen */
public class Dosen extends Civitasakademika {
    private String NIP;

    public Dosen(String Nama, String NIP) {
        super(Nama);
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}