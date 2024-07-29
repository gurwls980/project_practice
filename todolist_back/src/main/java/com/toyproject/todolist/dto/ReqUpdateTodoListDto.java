package com.toyproject.todolist.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
@Data
public class ReqUpdateTodoListDto {
    private int listId;
    private int check;
    private String input;
    private Date registerDate;
}