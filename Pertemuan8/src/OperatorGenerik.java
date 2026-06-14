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

    /* Cara kerja konsep Generik:
        Generik digunakan agar kelas atau metode dapat dipakai untuk berbagai tipe data 
        tanpa harus membuat kode berulang. Tipe data baru ditentukan saat digunakan, 
        sehingga program menjadi lebih fleksibel.
    */
}
