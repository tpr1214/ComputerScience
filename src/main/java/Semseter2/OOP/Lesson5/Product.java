package Semseter2.OOP.Lesson5;

import java.util.ArrayList;

public class Product {
    private String product;
    private int price;
     private int amount;

    public Product(String product, int products, int amount) {
        this.product = product;
        this.price=products;
        this.amount=amount;
    }

    public String toString (){
        return "Name:"+this.product+", Price: "+this.price+", Amount:"+this.amount;

    }
}
