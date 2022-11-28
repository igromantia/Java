package com.example.LastWork.dto;

public class Orders_goodsCreateDto {
    Long id;
    Long person_id;
    Long status_order_id;
    Long way_delivery_id;
    String address_delivery;

    public Orders_goodsCreateDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    public Long getStatus_order_id() {
        return status_order_id;
    }

    public void setStatus_order_id(Long status_order_id) {
        this.status_order_id = status_order_id;
    }

    public Long getWay_delivery_id() {
        return way_delivery_id;
    }

    public void setWay_delivery_id(Long way_delivery_id) {
        this.way_delivery_id = way_delivery_id;
    }

    public String getAddress_delivery() {
        return address_delivery;
    }

    public void setAddress_delivery(String address_delivery) {
        this.address_delivery = address_delivery;
    }
}
