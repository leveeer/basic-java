package com.jxau.xw.demo02;

public class Zi extends Fu {

    public Zi() {
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
