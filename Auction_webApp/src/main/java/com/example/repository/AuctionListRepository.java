package com.example.repository;

import com.example.models.AuctionList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuctionListRepository extends JpaRepository<AuctionList, Long> {

}
