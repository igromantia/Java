package com.example.LastWork.controller;

import com.example.LastWork.dto.Orders_goodsCreateDto;
import com.example.LastWork.persistence.entity.Orders_goods;
import com.example.LastWork.service.Orders_goodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders_goods/")
public class Orders_goodsController {
    @Autowired
    private Orders_goodsService orders_goodsService;

    @PostMapping
    public Orders_goods createdOrders_goodsDto(@RequestBody Orders_goodsCreateDto dto){
        return  orders_goodsService.createOrders_goods(dto);
    }

}
