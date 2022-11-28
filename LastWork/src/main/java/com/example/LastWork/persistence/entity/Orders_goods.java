package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="orders_goods")
public class Orders_goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    Long id;
    Long person_id;
    Long status_order_id;
    Long way_delivery_id;
    String address_delivery;

    public Orders_goods(Long id, Long person_id, Long status_order_id, Long way_delivery_id, String address_delivery) {
        this.id = id;
        this.person_id = person_id;
        this.status_order_id = status_order_id;
        this.way_delivery_id = way_delivery_id;
        this.address_delivery = address_delivery;
    }

    public Orders_goods() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders_goods that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(person_id, that.person_id) && Objects.equals(status_order_id, that.status_order_id) && Objects.equals(way_delivery_id, that.way_delivery_id) && Objects.equals(address_delivery, that.address_delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person_id, status_order_id, way_delivery_id, address_delivery);
    }
}
