package com.example.repository;

import com.example.models.PersonFreePont;
import org.springframework.data.repository.CrudRepository;

public interface FreePontsListRepository  extends CrudRepository<PersonFreePont, Long> {
}
