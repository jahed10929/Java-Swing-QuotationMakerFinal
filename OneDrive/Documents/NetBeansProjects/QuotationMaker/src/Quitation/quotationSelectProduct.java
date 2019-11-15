
package Quitation;

public class quotationSelectProduct {
    private final int id;
    private final String Discription;
    private final String Catagory;
    private final String unit;
    private final float price;
    private final float quantity;
    private float totalprice;
    
    public quotationSelectProduct(int id, String Discription, String Catagory, String unit, float price,float quantity,float totalprice ){
        this.id = id;
        this.Discription = Discription;
        this.Catagory = Catagory;
        this.unit = unit;
        this.price = price;
        this.quantity = quantity;
        this.totalprice = totalprice;
        
    }
    public int getId(){
        return id;
    }
    public String getDiscription(){
        return Discription;
    }
    public String getCatagory(){
        return Catagory;
    }
    public String getUnit(){
        return unit;
    }
    public float getPrice(){
        return price;
    }
    public float getquantity(){
        return quantity;
    }
    public float getTotalprice(){
        return totalprice;
    }
}
