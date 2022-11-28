package com.example.LastWork.controller;

import com.example.LastWork.dto.listOrdersByStatusDto;
import com.example.LastWork.persistence.entity.Goods;
import com.example.LastWork.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommonController {
    @Autowired
    CommonService commonService;

    @GetMapping("/get_list_goods/")
    public List<Goods> get_goods() {
        return commonService.listGoods();
    }

    @GetMapping("/get_orders/{id}")
    public void get_orders(@PathVariable("id") Long id){
    }

    @GetMapping("/get_report_orders/")
    public ArrayList<Object> get_report_orders(){
        return commonService.getReportOrders();
    }

    @GetMapping("/goods_for_sail/")
    public List<Goods> goods_for_sail() {
        return commonService.listGoodsForSail();
    }

    @GetMapping("/orders_By_status/")
    public List<listOrdersByStatusDto> orders_By_status() {
        return commonService.listOrdersByStatus();
    }

}
