package PBO09_24060124140150.KoleksiKelasBentukan;
/* Nama File    : MainPiaraan.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan kandang = new Piaraan();

        Kucing k1 = new Kucing("Milo", 3.2);
        Kucing k2 = new Kucing("Neko", 4.1);
        Kucing k3 = new Kucing("Zuzu", 3.8);

        Anjing a1 = new Anjing("Rex");
        Anjing a2 = new Anjing("Bruno");

        Burung b1 = new Burung("Kiko");
        Burung b2 = new Burung("Rio");

        kandang.enqueueAnabul(k1);
        kandang.enqueueAnabul(k2);
        kandang.enqueueAnabul(k3);
        kandang.enqueueAnabul(a1);
        kandang.enqueueAnabul(a2);
        kandang.enqueueAnabul(b1);
        kandang.enqueueAnabul(b2);

        kandang.showAnabul();

        System.out.println("\nTotal isi kandang: " + kandang.getNbelm());
        System.out.println();

        System.out.println("Apakah Bruno ada di antrian? " + kandang.isMember(a2));
        System.out.println("Apakah Milo ada di antrian? " + kandang.isMember(k1));

        System.out.println("\nAnabul paling depan: " + kandang.getAnabul().getNama());

        System.out.println("\nSebelum hewan keluar:");
        kandang.showAnabul();
        System.out.println();

        System.out.println("Hewan yang keluar: " + kandang.dequeueAnabul().getNama());

        System.out.println("\nSetelah ada yang keluar:");
        kandang.showAnabul();

        System.out.println("\nJumlah kucing: " + kandang.countKucing());

        System.out.println("\nTotal berat kucing: " + kandang.bobotKucing());

        System.out.println();
        kandang.showJenisAnabul();
    }

    /* Cara Kerja Konsep Koleksi:
     Koleksi di Java digunakan untuk menyimpan dan mengelola sekumpulan data
     dalam satu struktur. Dalam program ini, ArrayList digunakan untuk menyimpan
     objek bertipe Anabul yang terdiri dari Kucing, Anjing, dan Burung.
     Konsep inheritance dan polymorphism memungkinkan berbagai jenis objek tersebut
     disimpan dalam satu wadah yang sama, karena semuanya merupakan turunan dari kelas Anabul.
     Dengan koleksi, proses penambahan, penghapusan, pencarian, dan pengolahan data
     menjadi lebih efisien dan terstruktur tanpa perlu menggunakan banyak variabel terpisah.*/
}