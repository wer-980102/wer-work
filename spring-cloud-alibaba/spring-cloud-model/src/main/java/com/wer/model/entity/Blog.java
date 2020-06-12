package com.wer.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String id;

    private String users;

    private String title;

    private String content;

    private Date starttime;

    private Date endtime;

    private Integer status;


}