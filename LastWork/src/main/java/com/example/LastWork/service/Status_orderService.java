package com.example.LastWork.service;

import com.example.LastWork.dto.Status_orderCreateDto;
import com.example.LastWork.persistence.entity.Status_order;
import com.example.LastWork.persistence.repository.Status_orderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Status_orderService {
    @Autowired
    Status_orderRepository status_orderRepository;

    public Status_order createStatus_order(Status_orderCreateDto dto) {
        return status_orderRepository.save(new Status_order(dto.getId(), dto.getName(), dto.isFinished()));
    }
}
