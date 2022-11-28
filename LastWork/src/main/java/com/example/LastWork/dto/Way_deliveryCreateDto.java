package com.example.LastWork.dto;

import java.util.Objects;

public class Way_deliveryCreateDto {
    private String name;

    public Way_deliveryCreateDto(String name) {
        this.name = name;
    }

    public Way_deliveryCreateDto() {

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
        if (!(o instanceof Way_deliveryCreateDto)) return false;
        Way_deliveryCreateDto that = (Way_deliveryCreateDto) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
