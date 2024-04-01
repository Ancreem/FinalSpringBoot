package com.example.demo.domain.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceInterface<T> {
    List<T> getAll();
    List<T> getById(Integer id);
    List<T> save(T t);
    void delete(Integer id);
    void update(Integer id, T t);
}
