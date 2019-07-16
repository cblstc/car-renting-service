package com.cbl.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class User {

    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String email;

    private Integer role;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    private Date registtime;

    private Integer status;

}