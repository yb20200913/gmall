package com.atguigu.gmall.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class GmallUserApplicationTests {

    @Test
    void contextLoads() {
        final String a="张三";
        final String b="张";
        final String c="三";

        String d=b+c;
        String e="张"+"三";
        System.out.println(a==d);
        System.out.println(a==e);
    }

    @Test
    public void test(){
        long start = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<>(10000000);

        for (int i=0;i<10000000;i++)list.add(i);
        long end = System.nanoTime();
        System.out.println(end-start);
    }


    @Test
    public void test2(){
        long start = System.nanoTime();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i<10000000;i++)list.add(i);
        long end = System.nanoTime();
        System.out.println(end-start);
    }

}
