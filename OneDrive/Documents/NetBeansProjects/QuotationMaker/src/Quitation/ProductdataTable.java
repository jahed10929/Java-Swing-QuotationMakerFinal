
package Quitation;

public class ProductdataTable {
    private final int id;
    private final String Discription;
    private final String Catagory;
    private final String unit;
    private final float price;
    public ProductdataTable(int id, String Discription, String Catagory, String unit, float price){
        this.id = id;
        this.Discription = Discription;
        this.Catagory = Catagory;
        this.unit = unit;
        this.price = price;
        
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
}
