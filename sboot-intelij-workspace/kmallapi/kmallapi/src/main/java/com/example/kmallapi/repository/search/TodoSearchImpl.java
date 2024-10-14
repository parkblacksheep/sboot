package com.example.kmallapi.repository.search;

import com.example.kmallapi.domain.QTodo;
import com.example.kmallapi.domain.Todo;
import com.querydsl.jpa.JPQLQuery;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

@Log4j2
public class TodoSearchImpl extends QuerydslRepositorySupport implements TodoSearch {


    public TodoSearchImpl(){
        super(Todo.class);
    }

    @Override
    public Page<Todo> search1(){
        log.info("search----");
        //
        // QTodo qtodo 불러오는 방법 generated folder -> source
        // "https://jong-bae.tistory.com/43"
        QTodo todo =QTodo.todo;
        JPQLQuery<Todo> query =from(todo);
        query.where(todo.title.contains("1"));
        query.fetch();

        return null;
    }


}
