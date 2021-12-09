public class CPerson {
    private String nama;
    private String kota;
    private int umur;
    private String jenjang;

    public CPerson() {
        System.out.println("this is default const");
        nama="";
        kota="";
        umur=0;
        jenjang="";
    }

    public CPerson(String nama, String kota, int umur, String jenjang){
        this.nama = nama;
        this.kota= kota;
        this.umur= umur;
        this.jenjang= jenjang;
    }

    public void setNama(String iNama) {
        this.nama = nama;
    }

    public void setKota(String kota){
        this.kota=kota;
    }

    public void setUmur(int umur){
        this.umur=umur;
    }

    public void setJenjang(String jenjang) {
        this.jenjang = jenjang;
    }

    public String getNama() {
        return nama;
    }

    public String getKota(){
        return kota;
    }

    public int getUmur() {
        return umur;
    }

    public String getJenjang(){
        return jenjang;
    }

    public void printInfo(){
        System.out.println("nama: "+ nama);
        System.out.println("kota: "+ kota);
        System.out.println("umur: "+ umur);
        System.out.println("jenjang: "+ jenjang);
        System.out.println("~~~~~~~~~~~ end of print ~~~~~~~~~~");

    }
}
