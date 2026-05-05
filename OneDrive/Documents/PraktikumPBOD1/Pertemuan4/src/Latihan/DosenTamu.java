/* Nama File    : Dosen.java
 * Deskipsi     : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Nashwa Aldebaran/24060124140150  
 * Tanggal      : 12 Maret 2026
 */

package Latihan;

public class DosenTamu extends Dosen {
    private String NIDK;
    private Date akhirKontrak;

    public DosenTamu() {
    }

    public DosenTamu(String NIP, String NIDK, String Nama, Date tanggalLahir, Date tmt, 
    double gajiPokok, String fakultas, Date akhirKontrak) {
        super(NIP, Nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK() {
        return NIDK;
    }

    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    public Date getAkhirKontrak() {
        return akhirKontrak;
    }

    public void setAkhirKontrak(Date akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Akhir Kontrak: " + akhirKontrak.formatTanggal());
        System.out.println("Gaji Pokok: Rp " + getGajiPokok());
        System.out.println("Tunjangan: Rp " + hitungTunjangan());
    }
}
