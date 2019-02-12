package com.example.mac.crypto;

class DataModel {
    private String id;
    private String name;
    private String symbol;
    private String price_thb;



    public DataModel(String id, String name, String symbol, String price_thb) {
        this.id= id;
        this.name = name;
        this.symbol = symbol;
        this.price_thb= price_thb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price_thb;
    }

    public void setPrice(String price) {
        this.price_thb = price_thb;
    }
}
