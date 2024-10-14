package com.example.kmallapi.repository.search;

import com.example.kmallapi.domain.Todo;
import org.springframework.data.domain.Page;

public interface TodoSearch {

    Page<Todo> search1();
}
