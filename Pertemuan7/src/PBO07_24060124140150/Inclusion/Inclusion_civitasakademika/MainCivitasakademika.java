package PBO07_24060124140150.Inclusion.Inclusion_civitasakademika;

public class MainCivitasakademika {
    public static void main(String[] args) {
        System.out.println("III. POLIMORFISME UNIVERSAL INCLUSION");
        /* b.Aplikator kelas Seminar */
        Seminar s = new Seminar();

        /* e.2 objek Dosen dan 5 objek Mahasiswa */
        // Objek Dosen 
        Dosen d1 = new Dosen("Ara", "D0046");
        Dosen d2 = new Dosen("Dono", "D0083");

        // Objek Mahasiswa 
        Mahasiswa m1 = new Mahasiswa("Tika", "M0034", d1);
        Mahasiswa m2 = new Mahasiswa("Sherena", "M0017", d2);
        Mahasiswa m3 = new Mahasiswa("Abi", "M0056", d1);
        Mahasiswa m4 = new Mahasiswa("Haris", "M0158", d2);
        Mahasiswa m5 = new Mahasiswa("Sasa", "M0105", d1);

        /* f.Uji prosedur registrasi dengan tujuh objek peserta */
        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        /* g.tampilPeserta */
        s.tampilPeserta();
        System.out.println();

        /* c.countPeserta */
        System.out.println("Jumlah peserta: " + s.countPeserta());
        System.out.println(); 

        /* h.countMahasiswa */
        System.out.println("Jumlah peserta Mahasiswa: " + s.countMahasiswa());
        System.out.println();

        /* i.setWali */
        m1.setWali(d2);

        /* j.tampilDataMahasiswa */
        System.out.println(" ===== Data Mahasiswa ===== ");
        m1.tampilDataMahasiswa();
        System.out.println();
        m2.tampilDataMahasiswa();
        System.out.println();
        m3.tampilDataMahasiswa();
        System.out.println();
        m4.tampilDataMahasiswa();
        System.out.println();
        m5.tampilDataMahasiswa();
        System.out.println();
    }
}

/* RENUNGAN: Cara Kerja Polimorfisme
   Polimorfisme adalah konsep di mana satu metode dapat digunakan 
   dalam kondisi yang berbeda dengan hasil yang menyesuaikan objeknya. 
   Coercion terjadi saat tipe data diubah secara otomatis agar proses tetap berjalan. 
   Overloading memungkinkan penggunaan nama metode yang sama tetapi dengan isi parameter berbeda. 
   Sedangkan inclusion membuat objek dari kelas turunan tetap bisa dianggap sebagai kelas induk, 
   walaupun perilaku yang dijalankan tetap berasal dari objek aslinya. 
   Konsep ini membantu program menjadi lebih sederhana, rapi, dan mudah dikembangkan. */