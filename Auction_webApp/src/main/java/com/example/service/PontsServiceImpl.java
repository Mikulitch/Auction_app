package com.example.service;

import com.example.models.Ponts;
import com.example.repository.PontsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PontsServiceImpl implements PontsService{
    @Autowired
    private PontsRepository pontsRepository;
    @Override
    public List<Ponts> getAllPonts() {
        return pontsRepository.findAll();
    }
}
