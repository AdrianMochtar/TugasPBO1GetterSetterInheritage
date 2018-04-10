package tugaspbo1gettersetterinheritage;
public class Singa extends Kucing{
    private String Makanan;
    
    void Bunyi(){
        System.out.println("ROARRRR !!!!!");
    }

    public String getMakanan() {
        return Makanan;
    }

    public void setMakanan(String Makanan) {
        this.Makanan = Makanan;
    }
    
    
}
