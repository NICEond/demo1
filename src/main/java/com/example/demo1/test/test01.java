package com.example.demo1.test;

import com.example.demo1.pojo.Book;
import com.example.demo1.pojo.Writer;

import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;

public class test01 {
    public static void main(String[] args) {
//        testList();
//        testArr();
//        testMap();
        testGetWriter();
    }

    private static void testGetWriter() {
        List<Writer> writers1=new ArrayList<>();
        Book book1 = new Book(1, "死亡搁浅", 12, new String[]{"惊悚", "怪谈"});
        Book book2 = new Book(2, "午夜危机", 12, new String[]{"悬疑", "怪谈"});
        Book book3 = new Book(3, "霸道总裁爱上我", 22, new String[]{"爱情", "幻想"});
        ArrayList<Book> books1 = new ArrayList<>();
        ArrayList<Book> books2 = new ArrayList<>();
        ArrayList<Book> books3 = new ArrayList<>();
        books1.add(book1);
        books1.add(book2);
        books2.add(book1);
        books2.add(book3);
        books3.add(book3);
        Writer writer1 = new Writer("Tim",19,"123456",books1);
        Writer writer2 = new Writer("Mandey",18,"123456",books2);
        Writer writer3 = new Writer("Jerry",16,"123456",books3);
        writers1.add(writer1);
        writers1.add(writer2);
        writers1.add(writer3);
        writers1.stream()

                });
    }

    public static void testList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.stream()
                .filter(integer -> integer>12)
                .forEach(integer -> System.out.println(integer));
    }
    public static void testArr(){
        int[] arr=new int[]{1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
        stream
                .filter(value -> value>2)
                .map(operand -> operand+10)
                .forEach(value -> System.out.println(value));
    }
    public static void testMap(){
        Map<Object, Integer> map = new HashMap<>();
        map.put("ok",12);
        map.put("okk",13);
        map.put("okkk",14);
        Set<Map.Entry<Object, Integer>> set = map.entrySet();
        set.stream()
                .filter(Entry -> Entry.getValue()>12)
                //将entry对象转换成字符串
                .map(new Function<Map.Entry<Object, Integer>, String>() {
                    @Override
                    public String apply(Map.Entry<Object, Integer> Entry) {
                        return Entry.getKey()+"+++"+Entry.getValue();
                    }
                })
                .forEach(Entry -> System.out.println(Entry));
    }
}
