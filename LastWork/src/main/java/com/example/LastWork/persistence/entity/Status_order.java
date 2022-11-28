package com.example.LastWork.persistence.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="status_order")
public class Status_order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")

    Long id;
    String name;
    boolean finished;

    public Status_order(Long id, String name, boolean finished) {
        this.id = id;
        this.name = name;
        this.finished = finished;
    }

    public Status_order() {
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

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Status_order that)) return false;
        return finished == that.finished && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, finished);
    }
}
