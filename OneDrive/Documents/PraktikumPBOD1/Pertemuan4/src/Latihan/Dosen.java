/* Nama File    : Dosen.java
 * Deskipsi     : berisi atribut dan method dalam class Dosen
 * Pembuat      : Nashwa Aldebaran/24060124140150  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen() {
    }

    public Dosen(String NIP, String Nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas){
        super(NIP, Nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

}
