package com.example.service;


import com.example.models.AuctionList;
import com.example.repository.AuctionListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuctionListServiceImpl implements AuctionListService{

    @Autowired
    private AuctionListRepository auctionListRepository;

    @Override
    public List<AuctionList> getAllAuctionList() {
        return auctionListRepository.findAll();
    }
}
