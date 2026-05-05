public class MBangunDatar {
    
    // 1. Setelah ditambahkan keyword final pada class BangunDatar, 
    // terjadi error pada class Persegi dan Lingkaran karena
    // karena kedua class tersebut menggunakan extends BangunDatar.
    // Class yang diberi keyword final tidak dapat diwariskan, 
    // sehingga class lain tidak dapat melakukan extends terhadap class tersebut.

    // 2. Setelah keyword final ditambahkan pada method printInfo() di class BangunDatar, 
    // method tersebut tidak bisa dioverride di subclass. 
    // Karena di class Persegi ada method printInfo() juga, 
    // maka akan muncul error karena mencoba mengoverride method yang sudah final.
    
    public static void main(String[] args) {
        Persegi p = new Persegi(6, "Putih", "Hitam");
        Lingkaran l = new Lingkaran(20, "Pink", "Biru");

        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());
        System.out.println("Diagonal: " + p.getDiagonal());

        System.out.println("Luas: " + l.getLuas());
        System.out.println("Keliling: " + l.getKeliling());


    }
}
