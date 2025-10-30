package com.liushuai.demo1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        System.out.println("本程序用于计算两个数之间，既能被三整除又能被5整除的数");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始的值");
        int a = sc.nextInt();
        System.out.println("请输入结束的值");
        int b = sc.nextInt();

        int count = 0;

        if (a < b){
            for (int i = a; i <= b; i++) {
                if(i%3==0 && i%5==0) {
                    System.out.println(i);

                    //计算符合条件的个数
                    count++;
                }
            }
            System.out.println("符合条件的个数为" + count);
        }else {
            System.out.println("程序出错，请确保输入的a小于b");
        }
    }
}
