/* Nama File    : AngkaSial.java
 * Deskipsi     : program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Nashwa Aldebaran/24060124140150  
 * Tanggal      : 24 Maret 2026
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// Saat exception terjadi, baris 12 tidak dijalankan karena alur program
// langsung berpindah setelah exception dilempar. 
// Baris 21 dijalankan karena exception dari cobaAngka(13) ditangani di blok catch.
