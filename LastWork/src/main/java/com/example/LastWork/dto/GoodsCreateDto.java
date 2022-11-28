package com.example.LastWork.dto;

public class GoodsCreateDto {
    Long id;
    String name;
    Long category_id;
    boolean not_for_sail;
    Long quantity;

    public GoodsCreateDto() {
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
}
