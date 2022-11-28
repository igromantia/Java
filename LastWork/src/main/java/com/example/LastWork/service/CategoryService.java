package com.example.LastWork.service;

import com.example.LastWork.dto.CategoryCreateDto;
import com.example.LastWork.persistence.entity.Category;
import com.example.LastWork.persistence.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category createCategory(CategoryCreateDto dto) {
        return categoryRepository.save(new Category(dto.getId(), dto.getName(), dto.getParent_id()));
    }
}
