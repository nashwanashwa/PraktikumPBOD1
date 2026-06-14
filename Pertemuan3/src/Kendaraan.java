public class Kendaraan {
    /***************ATRIBUT***************/
    private String noPlat;
    private String Jenis;

    public Kendaraan(){
        this.noPlat = "";
        this.Jenis = "";
    }

    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.Jenis = Jenis;
    }

    public String getNoPlat(){
        return noPlat;
    }
    
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public String getJenis(){
        return Jenis;
    }

    public void setJenis(String Jenis){
        this.Jenis = Jenis;
    }

    public void printKendaraan(){
        System.out.println(Jenis + "-" + noPlat);

    }
}
