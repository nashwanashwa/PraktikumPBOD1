/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : MainKoleksi.java
 * Tanggal : 10 Mei 205
 */

package Anabul;

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        Kucing k1 = new Kucing("Kitty", 3.5);
        Kucing k2 = new Kucing("Luna", 4.0);
        Kucing k3 = new Kucing("Lano", 3.7);
        Anjing j1 = new Anjing("Boni");
        Anjing j2 = new Anjing("Boli");
        Burung b1 = new Burung("Lova");
        Burung b2 = new Burung("Lani");

        p.enqueueAnabul(k1);
        p.enqueueAnabul(k2);
        p.enqueueAnabul(k3);
        p.enqueueAnabul(j1);
        p.enqueueAnabul(j2);
        p.enqueueAnabul(b1);
        p.enqueueAnabul(b2);
        
        p.showAnabul();

        System.out.println("\nJumlah anabul: " + p.getNbelm());
        System.out.println();

        System.out.println("Apakah Boli ada di antrean? " + p.isMember(j2));
        System.out.println("Apakah Kitty ada di antrean? " + p.isMember(k1));

        System.out.println("\nAnabul pertama: " + p.getAnabul().getNama());

        System.out.println("\nSebelum dequeue:");
        p.showAnabul();
        System.out.println();

        System.out.println("Keluar antrean: " + p.dequeueAnabul().getNama());

        System.out.println("\nSetelah dequeue:");
        p.showAnabul();

        System.out.println("\nJumlah kucing: " + p.countKucing());

        System.out.println("\nTotal bobot kucing: " + p.bobotKucing());
        System.out.println();

        p.showJenisAnabul();
    }

    /* Renungan: cara kerja konsep Koleksi:
        Koleksi pada Java digunakan untuk menyimpan sekumpulan data dalam satu wadah 
        menggunakan ArrayList. Pada Class Teman, koleksi menyimpan nama bertipe String, 
        sedangkan pada Class Piaraan digunakan untuk menyimpan objek Anabul seperti 
        Kucing, Anjing, dan Burung. Dengan koleksi, data lebih mudah ditambah, dihapus, 
        dicari, dan ditampilkan. Selain itu, pada Class Piaraan juga diterapkan konsep 
        OOP dan Polymorphism karena satu ArrayList<Anabul> dapat menampung berbagai 
        objek turunan Anabul. */
}