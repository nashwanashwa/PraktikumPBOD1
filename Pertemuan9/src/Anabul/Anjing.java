/* Nama : George Imanuel Surya
 * NIM : 24060123120028
 * File : Anjing.java
 * Tanggal : 29 Apr 2025
 */
package Anabul;

public class Anjing extends Anabul {
    public Anjing(String panggilan) {
        super(panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println(panggilan + " (Anjing) Gerak: Melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(panggilan + " (Anjing) Bersuara: Guk-guk");
    }

    @Override
    public String toString() {
        return "Anjing";
    }
}