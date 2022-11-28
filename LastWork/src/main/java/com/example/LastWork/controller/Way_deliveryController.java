package com.example.LastWork.controller;

import com.example.LastWork.dto.CreatedWay_deliveryDto;
import com.example.LastWork.dto.Way_deliveryCreateDto;
import com.example.LastWork.service.Way_deliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/way_delivery/")
public class Way_deliveryController {
    @Autowired
    private Way_deliveryService way_deliveryService;

    @PostMapping
    public CreatedWay_deliveryDto createdWay_deliveryDto(@RequestBody Way_deliveryCreateDto dto) {
        return new CreatedWay_deliveryDto(way_deliveryService.createWay_delivery(dto));
    }
}
