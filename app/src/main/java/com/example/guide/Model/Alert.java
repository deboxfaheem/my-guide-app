package com.example.guide.Model;

public class Alert {
    String itemname;
    String itemtime;
    String delivery;

    public Alert(String itemname, String itemtime, String delivery){
         this.itemname=itemname;
         this.itemtime=itemtime;
         this.delivery=delivery;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }
    public String getItemname() {
        return itemname;
    }

    public String getItemtime() {
        return itemtime;
    }

    public void setItemtime(String itemtime) {
        this.itemtime = itemtime;
    }
}
