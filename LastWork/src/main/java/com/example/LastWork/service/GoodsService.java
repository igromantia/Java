package com.example.LastWork.service;

import com.example.LastWork.dto.GoodsCreateDto;
import com.example.LastWork.persistence.entity.Goods;
import com.example.LastWork.persistence.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class GoodsService {
    @Autowired
    GoodsRepository goodsRepository;

    public Goods createGoods(GoodsCreateDto dto) {
        return goodsRepository.save(new Goods(dto.getId(), dto.getName(), dto.getCategory_id(), dto.isNot_for_sail(), dto.getQuantity()));
    }

    public String addGoods(Long id, Long count) {
        String reply;
        Optional<Goods> search = goodsRepository.findById(id);
        try {
            Goods goods = search.get();
            Long newQuantity = goods.getQuantity() + count;
            goods.setQuantity(newQuantity);
            reply = "Успешно добавлено " + count + " единиц товара: \n\t" + goodsRepository.save(goods);
        } catch (NoSuchElementException ex) {
            reply = "Товар с id[" + id + "] отсутствует.";
        }

        return reply;
    }
}
