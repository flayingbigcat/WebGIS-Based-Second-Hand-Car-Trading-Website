package com.example.demo.pojo;

public class Product {
    private int product_id;
    private String product_name;

    private String product_price;

    private String product_description;

    public Product() {
    }

    public Product(int product_id, String product_name, String product_price, String product_description) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_price() {
        return product_price;
    }

    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

