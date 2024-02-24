package es.codeurjc.hellowordvscode;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EoloParkRepository extends JpaRepository <EoloPark,Long>{
	Page<EoloPark> findByName(String name, Pageable page);

	Page<EoloPark> findByCity(String city, Pageable page);
    
} 
