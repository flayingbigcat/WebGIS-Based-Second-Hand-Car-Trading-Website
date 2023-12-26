package com.example.demo.pojo;

public class shop {
    private int product_id;
    private String product_name;
    private String product_price;
    private String product_imagesrc;
    private String product_description;

    public shop() {
    }

    public shop(int product_id, String product_name, String product_price, String product_imagesrc, String product_description) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_imagesrc = product_imagesrc;
        this.product_description = product_description;
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

    public String getProduct_imagesrc() {
        return product_imagesrc;
    }

    public void setProduct_imagesrc(String product_imagesrc) {
        this.product_imagesrc = product_imagesrc;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    @Override
    public String toString() {
        return "shop{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_price='" + product_price + '\'' +
                ", product_imagesrc='" + product_imagesrc + '\'' +
                ", product_description='" + product_description + '\'' +
                '}';
    }
}
