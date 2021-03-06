package com.mt.study.web;

import com.mt.study.service.DemoServiceImpl;
import org.junit.Test;

public class DemoController {
@Test
    public void demo01() {
        DemoServiceImpl demo = new DemoServiceImpl();
        try {
            System.out.println(demo.randomNumber(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        DemoServiceImpl demo = new DemoServiceImpl();
//        try {
//            System.out.println(demo.randomNumber(5));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
