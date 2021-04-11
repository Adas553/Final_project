package pl.coderslab.final_project.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MainService<T> {

    Optional<T> get(Long id);
    List<T> getBookList();
    void add(T t);
    void update(T t);
    void delete(T t);
}
