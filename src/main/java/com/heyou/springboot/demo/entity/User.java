package com.heyou.springboot.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-20 21:28:57
 */
@Data
@NoArgsConstructor                 //无参构造
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -67966134772217874L;
    
    private Integer sn;
    
    private String id;
    
    private String username;
    
    private String password;

}