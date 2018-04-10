package tugaspbo1gettersetterinheritage;
public class Kucing {
    private String warnaBulu;
    private Integer jmlKaki;
    private String Habitat;
    
    
    void cetakinfo(){
        System.out.println("Warna Bulu \t: "+warnaBulu+"\n"+
                "Jumlah Kaki \t: "+jmlKaki+"\n"+
                "Habitat \t: "+Habitat);
    }

    public String getWarnaBulu() {
        return warnaBulu;
    }

    public void setWarnaBulu(String warnaBulu) {
        this.warnaBulu = warnaBulu;
    }

    public Integer getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(Integer jmlKaki) {
        this.jmlKaki = jmlKaki;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }
    
    
    
}
