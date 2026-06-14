/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Burung extends Anabul {
    public Burung(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Burung) Gerak: Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Burung) Bersuara: Cuit");
    }
}    