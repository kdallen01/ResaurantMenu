package restaurant;

import java.util.*;

public class MenuItem {
    //String item;
    String description;
    String category;
    double price;
    String addedDate;

    //Create setters for the above variables

    //public void setItem(String aItem) {this.item = aItem;}
    public void setDescription(String aDescription) {this.description = aDescription;}
    public void setCategory(String aCategory) {this.category = aCategory;}
    public void setPrice(double aPrice) {this.price = aPrice;}
    public void setAddedDate(String aAddedDate) {this.addedDate = aAddedDate;}

    //Create getters for the above variables

    //public String getItem() {return item;}
    public String getDescription() {return description;}
    public String getCategory() {return category;}
    public double getPrice() {return price;}
    public String getAddedDate() {return addedDate;}
}
