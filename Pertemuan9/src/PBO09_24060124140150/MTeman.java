package PBO09_24060124140150;

public class MTeman {
    public static void main(String[] args) {

        Teman tmn = new Teman();

        tmn.addNama("Alya");
        tmn.addNama("Nabila");
        tmn.addNama("Sinta");
        tmn.addNama("Caca");
        tmn.addNama("Dewi");

        System.out.println("Daftar Teman");
        tmn.showTeman();

        System.out.println("\nTotal teman: " + tmn.getNbelm());

        System.out.println("\nNama pada indeks ke-2:");
        System.out.println(tmn.getNama(2));

        System.out.println("\nDaftar sebelum diubah:");
        tmn.showTeman();

        tmn.setNama(1, "Rina");

        System.out.println("\nDaftar setelah setNama:");
        tmn.showTeman();

        tmn.delNama("Dewi");

        System.out.println("\nSetelah menghapus Dewi:");
        tmn.showTeman();

        if (tmn.isMember("Rina")) {
            System.out.println("\nRina ada di daftar teman");
        } else {
            System.out.println("\nRina tidak ditemukan");
        }

        tmn.gantiNama("Rina", "Nadya");

        System.out.println("\nDaftar setelah gantiNama:");
        tmn.showTeman();

        System.out.println("\nJumlah nama Sinta: " + tmn.countNama("Sinta"));
    }
}
