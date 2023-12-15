package com.example.demo.pojo;

import java.util.Date;

public class order {
    private int order_Id;
    private Date order_Date;
    private String order_Items;
    private double orderPrice;
    private String orderStatus;

    public order() {
    }

    public order(int order_Id, Date order_Date, String order_Items, double orderPrice, String orderStatus) {
        this.order_Id = order_Id;
        this.order_Date = order_Date;
        this.order_Items = order_Items;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public int getOrder_Id() {
        return order_Id;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public String getOrder_Items() {
        return order_Items;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrder_Id(int order_Id) {
        this.order_Id = order_Id;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }

    public void setOrder_Items(String order_Items) {
        this.order_Items = order_Items;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "order{" +
                "order_Id=" + order_Id +
                ", order_Date=" + order_Date +
                ", order_Items='" + order_Items + '\'' +
                ", orderPrice=" + orderPrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
