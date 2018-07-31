package com.priya.recyclerviewcheckbox.model;

public class Car {

    private String Carname;
    private String Model;
    private int Year;
    private  int Price;

    public Car (String Carname,String Model,int Year,int Price){
        this.Carname= Carname;
        this.Model=Model;
        this.Price=Price;
        this.Year=Year;
    }

    public String getModel() {
        return Model;
    }

    public int getPrice() {
        return Price;
    }

    public String getCarname() {
        return Carname;
    }

    public int getYear() {
        return Year;
    }
}
