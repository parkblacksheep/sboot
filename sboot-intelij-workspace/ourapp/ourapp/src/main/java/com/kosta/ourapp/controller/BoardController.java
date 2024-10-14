package com.kosta.ourapp.controller;

import com.kosta.ourapp.domain.BoardDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
    public class BoardController {
        public BoardController(){
            System.out.println("======BoardController 생성 ");
        }

        @GetMapping("/hello")
        public String hello(String name){
            return "Hello : "+name;
        }
        @GetMapping("/getBoard")
        public BoardDto getBoard(){
            BoardDto board = new BoardDto();
            board.setSeq(1);
            board.setTitle("제목");
            board.setWriter("홍길동");
            board.setContent("콘텐트 내용 추가중입니다.");
            board.setCreateDate(new Date());
            board.setCnt(0);
            return board;
        }
        @GetMapping("/getBoardList")
        public List<BoardDto> getBoardList(){
            List<BoardDto> boardlist = new ArrayList<>();
            for (int i=1; i<=10;i++){
                BoardDto board = new BoardDto();
                board.setSeq(i);
                board.setTitle("화이팅"+i);
                board.setWriter("코스타");
                board.setContent(i+"번 내용입니다. 화이팅입니다.");
                board.setCreateDate(new Date());
                board.setCnt(0);
                boardlist.add(board);
            }
            return boardlist;
        }
    }
