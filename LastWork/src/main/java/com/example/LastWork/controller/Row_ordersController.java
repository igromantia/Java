package com.example.LastWork.controller;

import com.example.LastWork.dto.Row_ordersCreateDto;
import com.example.LastWork.persistence.entity.Row_orders;
import com.example.LastWork.service.Row_ordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/row_orders/")
public class Row_ordersController {
    @Autowired
    private Row_ordersService row_ordersService;

    @PostMapping
    public Row_orders createdRow_ordersDto(@RequestBody Row_ordersCreateDto dto){
        return  row_ordersService.createRow_orders(dto);
    }
}
