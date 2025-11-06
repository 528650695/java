package com.liushuai.day03;

//1、导包
import java.util.Random;
import java.util.Random;

public class test06 {
    public static void main(String[] args) {
        //生成一个随机数
        //范围0~10

        //2、创建对象
        Random r = new Random();

        //3、生成随机数
        //判断技巧:
        //在小括号中,书写的是生成随机数的范围
        //这个范围一定是从0开始的。
        //到这个数-1结束
        //口诀:包头不包尾,包左不包右
        int number = r.nextInt(10);
        System.out.println(number);
    }
}
