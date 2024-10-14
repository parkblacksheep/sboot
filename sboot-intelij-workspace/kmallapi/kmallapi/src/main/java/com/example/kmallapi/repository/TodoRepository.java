package com.example.kmallapi.repository;

import com.example.kmallapi.domain.Todo;
import com.example.kmallapi.repository.search.TodoSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long>, TodoSearch {

}
