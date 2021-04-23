package com.example.repository;

import com.example.models.FreePonts;
import com.example.models.Ponts;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SearchFreePontsRepository extends CrudRepository <FreePonts, Long> {
    List<FreePonts> findFreePontsByAdressContaining(String adress);
}
