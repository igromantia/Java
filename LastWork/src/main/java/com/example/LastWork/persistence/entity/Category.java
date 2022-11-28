package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    private String name;
    private Long parent_id;

    public Category() {
    }

    public Category(Long id, String name, Long parent_id) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
    }

    public Category(String name, Long parent_id) {
        this.name = name;
        this.parent_id = parent_id;
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

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category category)) return false;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name) && Objects.equals(parent_id, category.parent_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parent_id);
    }
}
