/* Nama File    : Main.java
 * NIM          : 24060124120004  
 * Nama         : Kayla Febrina Laura Ayu 
 * Tanggal      : 28 April 2026
 */

public class Main {
    public static void main(String[] args) {

            Anabul hewanPeliharaan;
        Datum<Anabul> dataHewan;

        hewanPeliharaan = new Anjing("Chika");
        dataHewan = new Datum<Anabul>(hewanPeliharaan);
        dataHewan.getIsi().Gerak();
        dataHewan.getIsi().Bersuara();
        System.out.println();

        hewanPeliharaan = new Kucing("Kitty", 8.3);
        dataHewan = new Datum<Anabul>(hewanPeliharaan);
        dataHewan.getIsi().Gerak();
        dataHewan.getIsi().Bersuara();
        System.out.println();

        hewanPeliharaan = new Anggora("Hanny", 9.5);
        dataHewan = new Datum<Anabul>(hewanPeliharaan);
        dataHewan.getIsi().Gerak();
        dataHewan.getIsi().Bersuara();
        System.out.println();

        hewanPeliharaan = new Kembangtelon("Flo", 6.9);
        dataHewan = new Datum<Anabul>(hewanPeliharaan);
        dataHewan.getIsi().Gerak();
        dataHewan.getIsi().Bersuara();
        System.out.println();

        hewanPeliharaan = new Burung("Lobi");
        dataHewan = new Datum<Anabul>(hewanPeliharaan);
        dataHewan.getIsi().Gerak();
        dataHewan.getIsi().Bersuara();
        System.out.println();
    }
}