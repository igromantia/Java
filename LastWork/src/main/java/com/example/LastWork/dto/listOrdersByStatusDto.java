package com.example.LastWork.dto;

public class listOrdersByStatusDto {
    Long order_id;
    String address_delivery;
    Long person_id;
    String person_name;
    String person_address;
    String phone;
    Long status_id;
    String status_name;
    boolean finished;
    Long way_id;
    String way_name;

    public listOrdersByStatusDto() {
    }

    public listOrdersByStatusDto(Long order_id, String address_delivery, String person_name) {
        this.order_id = order_id;
        this.address_delivery = address_delivery;
        this.person_name = person_name;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getAddress_delivery() {
        return address_delivery;
    }

    public void setAddress_delivery(String address_delivery) {
        this.address_delivery = address_delivery;
    }

    public Long getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Long person_id) {
        this.person_id = person_id;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_address() {
        return person_address;
    }

    public void setPerson_address(String person_address) {
        this.person_address = person_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Long status_id) {
        this.status_id = status_id;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public Long getWay_id() {
        return way_id;
    }

    public void setWay_id(Long way_id) {
        this.way_id = way_id;
    }

    public String getWay_name() {
        return way_name;
    }

    public void setWay_name(String way_name) {
        this.way_name = way_name;
    }
}
