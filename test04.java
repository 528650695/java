package com.liushuai.day03;

import java.util.Scanner;

public class test04 {
    public  static void main(String[] args) {
        //需求:键盘录入一个正整数x,判断该整数是否为一个质数。

        //质数:
        //如果一个整数只能被1和本身整除,那么这个数就是质数。否则这个数叫做合数
        //7=1*7 质数
        //8=1*8 2*4合数

        //1、分析：输入一个数,并判断
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();

        //分析，如果是质数，那么flag的值是true，如果是合数，那么值为flase

        boolean flag = true;

        //2、循环
        // 质数需要从2开始，到number-1，都不能被整除
        //如果能够被整除那么就不是质数
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(number + "是质数");
        }else {
            System.out.println(number + "是合数");
        }

    }
}
