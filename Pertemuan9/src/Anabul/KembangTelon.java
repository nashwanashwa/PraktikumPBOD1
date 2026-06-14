package Anabul;

public class KembangTelon {
    public class Kembangtelon extends Kucing {
        public Kembangtelon(String panggilan, double bobot) {
            super(panggilan, bobot);
        }

        @Override
        public void Gerak() {
            System.out.println(panggilan + " (Kembangtelon) Gerak: Melata");
        }

        @Override
        public void Bersuara() {
            System.out.println(panggilan + " (Kembangtelon) Bersuara: Meong");
        }
    }  
}
