/* Nama File    : Asersi1.java
 * Deskipsi     : program untuk menunjukkan asersi
 * Pembuat      : Nashwa Aldebaran /2406012410150  
 * Tanggal      : 24 Maret 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if(x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    } 
}