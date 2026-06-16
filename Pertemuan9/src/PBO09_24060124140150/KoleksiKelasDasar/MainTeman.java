package PBO09_24060124140150.KoleksiKelasDasar;
/* Nama File    : MainTeman.java
 * NIM          : 24060124140150
 * Nama         : Nashwa Aldebaran
 * Tanggal      : 30 April 2026
 */

public class MainTeman {
    public static void main(String[] args) {
        Teman listTeman = new Teman();

        listTeman.addNama("Naya");
        listTeman.addNama("Dimas");
        listTeman.addNama("Rafi");
        listTeman.addNama("Salsa");
        listTeman.addNama("Vina");

        System.out.println("\nDaftar teman saat ini");
        listTeman.showTeman();

        System.out.println("\nTotal teman: " + listTeman.getNbelm());

        System.out.println("\nIsi indeks 2: " + listTeman.getNama(2));

        System.out.println("\nSebelum perubahan data:");
        listTeman.showTeman();

        listTeman.setNama(1, "Bima");

        System.out.println("\nSetelah perubahan data:");
        listTeman.showTeman();

        System.out.println("\nSebelum penghapusan:");
        listTeman.showTeman();

        listTeman.delNama("Vina");

        System.out.println("\nSetelah hapus Vina:");
        listTeman.showTeman();

        System.out.println("\nApakah Bima ada di list? " + listTeman.isMember("Bima"));

        System.out.println("\nSebelum ganti nama:");
        listTeman.showTeman();

        listTeman.gantiNama("Bima", "Raka");

        System.out.println("\nSetelah ganti nama:");
        listTeman.showTeman();

        System.out.println("\nJumlah kemunculan Rafi: " + listTeman.countNama("Rafi"));
    }
}
