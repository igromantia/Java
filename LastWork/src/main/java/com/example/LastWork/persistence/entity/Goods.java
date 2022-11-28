package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    Long id;
    String name;
    Long category_id;
    boolean not_for_sail;
    Long quantity;

    public Goods(Long id, String name, Long category_id, boolean not_for_sail, Long quantity) {
        this.id = id;
        this.name = name;
        this.category_id = category_id;
        this.not_for_sail = not_for_sail;
        this.quantity = quantity;
    }

    public Goods() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public boolean isNot_for_sail() {
        return not_for_sail;
    }

    public void setNot_for_sail(boolean not_for_sail) {
        this.not_for_sail = not_for_sail;
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
        if (!(o instanceof Goods goods)) return false;
        return not_for_sail == goods.not_for_sail && Objects.equals(id, goods.id) && Objects.equals(name, goods.name) && Objects.equals(category_id, goods.category_id) && Objects.equals(quantity, goods.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category_id, not_for_sail, quantity);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category_id=" + category_id +
                ", not_for_sail=" + not_for_sail +
                ", quantity=" + quantity +
                '}';
    }
}
