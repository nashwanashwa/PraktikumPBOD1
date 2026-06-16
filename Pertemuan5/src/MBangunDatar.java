public class MBangunDatar {
    
    public static void main(String[] args) {
        
        BangunDatar P1 = new Persegi(10, "Putih", "Hitam");    
        Persegi P2 = new Persegi(5, "Hijau", "Kuning");        
        BangunDatar L1 = new Lingkaran(7, "Pink", "Putih");  
        Lingkaran L2 = new Lingkaran(14, "Hitam", "Lilac");   

        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());
        

        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("Apakah luas P1 = luas P2? " + P1.isEqualLuas(P2));
        System.out.println("Apakah luas L1 = luas L2? " + L1.isEqualLuas(L2));
        

        System.out.println("Apakah keliling P1 = keliling P2? " + P1.isEqualKeliling(P2));
        System.out.println("Apakah keliling L1 = keliling L2? " + L1.isEqualKeliling(L2));
        
    }
}
