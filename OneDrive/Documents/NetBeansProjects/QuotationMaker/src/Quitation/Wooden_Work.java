/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quitation;

/**
 *
 * @author jahed
 */
public class Wooden_Work {
    String sl;
    String dis;
    String unit;
    String Quantity;
    String unitproce;
    String totalprice;
    public Wooden_Work (String sl,String dis,String unit,String Quantity,String unitproce,String totalprice){
        this.sl = sl;
        this.dis = dis;
        this.unit = unit;
        this.unitproce = unitproce;
        this.totalprice = totalprice;
        this.Quantity = Quantity; 
    }
    String gets1(){
        return this.sl;
    }
    String getdis(){
        return this.dis;
    }
    String getQuantity(){
        return this.Quantity;
    }
    String getunitproce(){
        return this.unitproce;
    }
    String gettotalprice(){
        return this.totalprice;
    }
    String getunit(){
        return this.unit;
    }
}
