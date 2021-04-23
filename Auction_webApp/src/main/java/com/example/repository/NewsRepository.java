package com.example.repository;

import com.example.models.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository <News, Long> {
}
