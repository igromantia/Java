package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="row_orders")
public class Row_orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    Long id;
    Long order_id;
    Long goods_id;
    Long quantity;

    public Row_orders(Long id,  Long order_id, Long goods_id, Long quantity) {
        this.id = id;
        this.order_id = order_id;
        this.goods_id = goods_id;
        this.quantity = quantity;
    }

    public Row_orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Long goods_id) {
        this.goods_id = goods_id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Row_orders that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(order_id, that.order_id) && Objects.equals(goods_id, that.goods_id) && Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, order_id, goods_id, quantity);
    }
}

