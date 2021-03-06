package com.mt.study.service;

import java.util.Random;

public class DemoServiceImpl implements IDemoService {

    public int randomNumber(int num) throws Exception {

        return new Random().nextInt(num);
    }
}
