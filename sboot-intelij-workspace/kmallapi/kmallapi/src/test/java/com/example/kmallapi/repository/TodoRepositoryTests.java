package com.example.kmallapi.repository;

import com.example.kmallapi.domain.Todo;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Log4j2
public class TodoRepositoryTests {
    @Autowired
    private TodoRepository todoRepository;

    @Test
    public void test1(){
        Assertions.assertNotNull(todoRepository);
        log.info(todoRepository.getClass().getName());
    }

    @Test
    public void testInsert(){
        Todo todo=Todo.builder()
                .title("Website construction")
                .content("Web for profit automation")
                .dueDate(LocalDate.of(2024, 10,15))
                .build()
                ;

       Todo result= todoRepository.save(todo);
       log.info(result.toString());
    }
    @Test
    public void testRead(){
        Long tno = 1L;
        Optional<Todo> result =todoRepository.findById(1L);
        Todo todo=result.orElseThrow();
        log.info(todo.toString());
    }
    @Test
    public void testUpdate(){
        Long tno = 1L;
        Optional<Todo> result = todoRepository.findById(tno);
        Todo todo =result.orElseThrow();

        todo.changeTitle("update Website construction");
        todo.changeContent("update Web for profit automation");
        todo.changeComplete(true);
        todoRepository.save(todo);
        log.info(todo.toString());
    }
    @Test
    public void testPaging(){
        //페이지 번호는 0부터
        Pageable pageable =PageRequest.of(0,10, Sort.by("tno").descending());
        Page<Todo> result =todoRepository.findAll(pageable);
        log.info(result.getTotalElements());
        log.info(result.getContent());
    }
    @Test
    public void testInsert2(){
        Todo result = null;
        for (int i=1;i<30; i++){
            Todo todo=Todo.builder()
                    .title("Website construction")
                    .content("Web for profit automation")
                    .dueDate(LocalDate.of(2024, 10,i))
                    .build()
                    ;
             result= todoRepository.save(todo);
        }
        log.info(result.toString());

    }

    @Test
    public void testSearch1(){
//        PageRequest.of(0,10,Sort.by("tno").descending());
        todoRepository.search1();
    }



}
