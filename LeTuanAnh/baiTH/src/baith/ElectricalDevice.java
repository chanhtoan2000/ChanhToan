package baith;
class ElectricalDevice{
    protected String manufacture;
    protected int price;
    protected String id;
    protected boolean switcher;
    
    public  ElectricalDevice(String manufacture,int price,String id, boolean switcher){
        this.manufacture = manufacture;
        this.price = price;
        this.id=id;
        this.switcher=switcher;
}
   public String manufacture(){
       return manufacture;
   }
  
    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }
    public String toString() {
        return "nha san xuat: " + manufacture
                + "\n" + "gia ban: " + price
                + "\n" + "ma id: " + id
                + "\n" + "cong tac: " + switcher;

    }
}
    

          
    


 
    

