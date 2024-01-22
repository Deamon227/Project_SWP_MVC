package com.example.swp_mvc.service;

import java.util.Optional;

public interface IGeneratedService<T> {
    Iterable<T> findAll();

    void save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
