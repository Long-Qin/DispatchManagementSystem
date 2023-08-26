package com.teamtwo.dispatchmanagementsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.teamtwo.dispatchmanagementsystem.model.User;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    private String orderID;
    private String DeliveryOption;
    private String orderStatus;
    private String fromAddress;
    private String toAddress;
    private String recipient;
    private String sender;
    public Order() {}
    private Order(Builder builder){
        this.sender = builder.sender;
        this.recipient = builder.recipient;
        this.orderID = builder.orderID;
        this.DeliveryOption = builder.DeliveryOption;
        this.orderStatus = builder.orderStatus;
        this.fromAddress = builder.fromAddress;
        this.toAddress = builder.toAddress;
    }
    static class Builder{
        @JsonProperty("orderID")
        private String orderID;
        @JsonProperty("DeliveryOption")
        private String DeliveryOption;
        @JsonProperty("orderStatus")
        private String orderStatus;
        @JsonProperty("fromAddress")
        private String fromAddress;
        @JsonProperty("toAddress")
        private String toAddress;
        @JsonProperty("recipient")
        private String recipient;
        @JsonProperty("sender")
        private String sender;
        public Builder orderID(String orderID){
            this.orderID = orderID;
            return this;
        }
        public Builder DeliveryOption(String DeliveryOption){
            this.DeliveryOption = DeliveryOption;
            return this;
        }
        public Builder orderStatus(String orderStatus){
            this.orderStatus = orderStatus;
            return this;
        }
        public Builder fromAddress(String fromAddress){
            this.fromAddress = fromAddress;
            return this;
        }
        public Builder toAddress(String toAddress){
            this.toAddress = toAddress;
            return this;
        }

        public Builder recipient(String recipient){
            this.recipient = recipient;
            return this;
        }
        public Builder sender(String sender){
            this.sender = sender;
            return this;
        }
        public Order build(){
            return new Order(this);
        }
    }
}
