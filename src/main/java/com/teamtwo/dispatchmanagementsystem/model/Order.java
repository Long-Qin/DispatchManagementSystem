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
    private Long orderID;
    private String deliveryOption;
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
        this.deliveryOption = builder.deliveryOption;
        this.orderStatus = builder.orderStatus;
        this.fromAddress = builder.fromAddress;
        this.toAddress = builder.toAddress;
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
        @JsonProperty("recipient")
        private String recipient;
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

        public Builder setRecipient(String recipient){
            this.recipient = recipient;
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
