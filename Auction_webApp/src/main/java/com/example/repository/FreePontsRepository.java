package com.example.repository;


import com.example.models.FreePonts;
import com.example.models.Ponts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreePontsRepository extends JpaRepository<FreePonts, Long> {
    List<FreePonts> findFreePontsByAdressContaining(String adress);

}

