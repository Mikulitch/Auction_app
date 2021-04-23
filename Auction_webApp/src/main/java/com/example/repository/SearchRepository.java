package com.example.repository;

import com.example.models.AuctionList;
import com.example.models.FreePonts;
import com.example.models.Location;
import com.example.models.Ponts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SearchRepository extends CrudRepository <Ponts, Long>  {


   /*@Query("select p.adress,p.area,p.cad_number,p.communications,p.id_auction from Ponts p inner join location l on p.id_location = l.id where p.adress:name")*/

   @Query("select new com.example.models.FreePonts(f.adress, f.area, f.communications) from FreePonts f inner join Location l on f.id_location = l.id where f.adress LIKE CONCAT('%',:adress,'%')" )
    List<FreePonts> findFreePontsByAdressContaining(String adress);
   @Query("select new com.example.models.Ponts(p.adress,p.area,p.communications, p.id_auction) from Ponts p inner join Location l on p.id_location = l.id where p.adress  LIKE CONCAT('%',:adress,'%')" )
   List<Ponts> findPontsByAdressContaining(String adress);

 /*  List<Ponts> findByAdressContaining(String adress);
*/

}
