package dev.example.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {

    List<T> list();

    T create(T t);

    Optional<T> get(int empId);

    void update(T t,int empId);

    void delete(T t, int empId);
}
