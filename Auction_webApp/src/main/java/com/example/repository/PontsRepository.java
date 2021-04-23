package com.example.repository;

import com.example.models.Ponts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface PontsRepository extends JpaRepository<Ponts, Long> {

/*
 @Query("from Ponts a join a.id_auction c where c=:categoryName")
    public Iterable<Ponts> findByCategory(@Param("1") String categoryName);
*/

/*    @Query("SELECT u FROM Ponts u WHERE u.id_auction = 1")
    Collection<Ponts> findAllPonts();*/
}
