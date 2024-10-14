package com.kosta.ourapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int Seq;
    private String Title;
    private String Writer;
    private String Content;
    private Date CreateDate;
    private int Cnt;
}
