package com.example.LastWork.controller;

import com.example.LastWork.dto.GoodsCreateDto;
import com.example.LastWork.persistence.entity.Goods;
import com.example.LastWork.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/goods/")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @PostMapping
    public Goods createdGoodsDto(@RequestBody GoodsCreateDto dto){
        return  goodsService.createGoods(dto);
    }

    @PostMapping("/addGoods/")
    public void createdGoodsDto1(@RequestBody String dto1){
        System.out.println(dto1);
    }

    @PostMapping("/addGoodsQuantity/{id}/{quantity}")
    public String newFunction(@PathVariable("id") Long id, @PathVariable("quantity") Long quantity){
        String reply = goodsService.addGoods(id, quantity);
        return reply;
    }

}
