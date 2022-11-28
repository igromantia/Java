package com.example.LastWork.service;

import com.example.LastWork.dto.Orders_goodsCreateDto;
import com.example.LastWork.persistence.entity.Orders_goods;
import com.example.LastWork.persistence.repository.Orders_goodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orders_goodsService {
    @Autowired
    Orders_goodsRepository orders_goodsRepository;

    public Orders_goods createOrders_goods(Orders_goodsCreateDto dto) {
        return orders_goodsRepository.save(new Orders_goods(dto.getId(), dto.getPerson_id(), dto.getStatus_order_id(), dto.getWay_delivery_id(), dto.getAddress_delivery()));
    }
}
