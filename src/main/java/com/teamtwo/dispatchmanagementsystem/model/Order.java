package com.teamtwo.dispatchmanagementsystem.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.teamtwo.dispatchmanagementsystem.model.User;
@Entity
@Table(name = "orders")
@JsonDeserialize(builder = Order.Builder.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderID;
    private String deliveryOption;
    private String orderStatus;
    private String fromAddress;
    private String toAddress;

    private String sender;
    public Order() {}
<<<<<<< HEAD
=======
    public Long getOrderID(){
        return orderID;
    }
>>>>>>> parent of 5d7dae9 (Ordering (#9))
    private Order(Builder builder){
        this.sender = builder.sender;
        this.orderID = builder.orderID;
        this.deliveryOption = builder.deliveryOption;
        this.orderStatus = builder.orderStatus;
        this.fromAddress = builder.fromAddress;
        this.toAddress = builder.toAddress;
    }
<<<<<<< HEAD

    public Long getId() {
        return orderID;
    }
    public void setId(Long id) {
        this.orderID = id;
    }
    public String getDeliveryOption() {
        return deliveryOption;
    }
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }
    public String getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public String getFromAddress() { return fromAddress; }
    public void setFromAddress(String fromAddress) { this.fromAddress = fromAddress; }
    public String getToAddress() { return toAddress; }
    public void setToAddress(String toAddress) { this.toAddress = toAddress; }
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

=======
>>>>>>> parent of 5d7dae9 (Ordering (#9))

    public Long getId() {
        return orderID;
    }
    static class Builder{
        @JsonProperty("orderID")
        private Long orderID;
        @JsonProperty("deliveryOption")
        private String deliveryOption;
        @JsonProperty("orderStatus")
        private String orderStatus;
        @JsonProperty("fromAddress")
        private String fromAddress;
        @JsonProperty("toAddress")
        private String toAddress;
        @JsonProperty("sender")
        private String sender;

        public Builder setOrderID(Long orderID){
            this.orderID = orderID;
            return this;
        }
        public Builder setDeliveryOption(String DeliveryOption){
            this.deliveryOption = DeliveryOption;
            return this;
        }
        public Builder setOrderStatus(String orderStatus){
            this.orderStatus = orderStatus;
            return this;
        }
        public Builder setFromAddress(String fromAddress){
            this.fromAddress = fromAddress;
            return this;
        }
        public Builder setToAddress(String toAddress){
            this.toAddress = toAddress;
            return this;
        }

        public Builder setSender(String sender){
            this.sender = sender;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
