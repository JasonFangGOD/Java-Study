package cn.edu.cqcvc.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);
    }
}
