package com.example.service;

import com.example.models.FreePonts;
import com.example.repository.FreePontsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FreePontsServiceImpl implements FreePontsService {

    @Autowired
    private FreePontsRepository freePontsRepository;

    @Override
    public List<FreePonts> getAllFreePonts() {
        return freePontsRepository.findAll();
    }
}
