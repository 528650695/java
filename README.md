package com.liushuai.demo1;

public class test5 {
    public static void main(String[] args) {
        /*需求:在实际开发中,如果要获取一个范围中的每一个数据时,会用到循环。
        但是此时,大多情况下,不会获取所有的数据,而是获取其中符合要求的数据。
        此时就需要循环和其他语句结合使用了。
        比如:求1-100之间的偶数和*/
        //分析：第一步测试循环1~100
        int i;
        int sum = 0;
        for (i = 0; i<=100 ; i++) {
            //累加之后再求值
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
