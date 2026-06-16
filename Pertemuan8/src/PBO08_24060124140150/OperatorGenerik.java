package PBO08_24060124140150;
/* Nama File    : OperatorGenerik.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 28 April 2026
 */

/* 3. a) Prosedur generik Tukar */
public class OperatorGenerik<G> {
    public void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    /* 3. c) Fungsi generik Bobot2 yang menerima masukan dua objek keturunan
    kucing lalu mengembalikan jumlah bobot keduanya! */
    public double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }

    /* Cara Kerja Konsep Generik:
   Generik memungkinkan program menggunakan satu kelas atau metode 
   untuk banyak tipe data yang berbeda. Tipe data tidak ditetapkan 
   langsung saat kode dibuat, tetapi ditentukan ketika program dijalankan. 
   Hal ini membuat kode lebih fleksibel, mudah digunakan kembali, 
   dan tidak perlu membuat banyak versi kode untuk fungsi yang sama. */
}