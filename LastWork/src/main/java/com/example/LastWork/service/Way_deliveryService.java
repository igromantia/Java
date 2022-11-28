package com.example.LastWork.service;

import com.example.LastWork.dto.Way_deliveryCreateDto;
import com.example.LastWork.persistence.entity.Way_delivery;
import com.example.LastWork.persistence.repository.Way_deliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Way_deliveryService {

    @Autowired
    private Way_deliveryRepository way_deliveryRepository;

    public Way_delivery createWay_delivery(Way_deliveryCreateDto dto) {
        return way_deliveryRepository.save(new Way_delivery(dto.getName()));
    }
}
