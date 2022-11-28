package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "way_delivery")
public class Way_delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;

    public Way_delivery(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Way_delivery(String name) {
        this.name = name;
    }

    public Way_delivery() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Way_delivery that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
