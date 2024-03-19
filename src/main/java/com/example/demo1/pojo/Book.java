package com.example.demo1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    //图书ID
   private int id;
    //图书名称
   private String name;
   //图书数量
   private int num;
   //图书类型
   private String[] type;
}
