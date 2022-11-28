package com.example.LastWork.controller;

import com.example.LastWork.dto.Status_orderCreateDto;
import com.example.LastWork.persistence.entity.Status_order;
import com.example.LastWork.service.Status_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status_order/")
public class Status_orderController {
    @Autowired
    private Status_orderService status_orderService;

    @PostMapping
    public Status_order createdStatus_orderDto(@RequestBody Status_orderCreateDto dto){
        return  status_orderService.createStatus_order(dto);
    }
}
