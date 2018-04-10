package tugaspbo1gettersetterinheritage;
public class kucingAksi {
    public static void main(String[] args) {
        Kucing ygkampung = new Kucing();
        
        ygkampung.setWarnaBulu("Warna-warni");
        ygkampung.setJmlKaki(4);
        ygkampung.setHabitat("Daerah pemukiman manusia");
        
        ygkampung.cetakinfo();
        
        System.out.println("\t");
        System.out.print("Warna Bulu \t: ");
        System.out.println(ygkampung.getWarnaBulu());
        System.out.print("Jumlah Kaki \t: ");
        System.out.println(ygkampung.getJmlKaki());
        System.out.print("Habitat \t: ");
        System.out.println(ygkampung.getHabitat());
        
        Singa lion = new Singa();
        lion.setWarnaBulu("Kuning");
        lion.setJmlKaki(4);
        lion.setHabitat("Hutan");
        lion.setMakanan("Daging");
        System.out.println("\t");
        lion.cetakinfo();
        System.out.println("Makanan \t: "+lion.getMakanan());
        lion.Bunyi();
    }
    
}
