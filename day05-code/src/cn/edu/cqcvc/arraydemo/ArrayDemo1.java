package cn.edu.cqcvc.arraydemo;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] name = {"文龙燊", "宁禹鑫", "王瑞杰", "李奕衡", "章峻溪",
                "文建峰", "高豪东", "郑新", "郑遥", "郑星",
                "苏恒一", "冉松", "杨镓华", "刘昌豪", "蒲俊强",
                "夏华进", "李桐", "方苏渝", "阮钰熙", "李芳",
                "谭子渝", "伏丽汀", "董晨欣", "李宗容", "陈秀芬",
                "董小芳", "周璇", "熊信芳", "喻思齐", "兰芳",
                "杨瑞", "王画", "周鑫雅", "贾思怡", "黄真欣",
                "肖艺丹", "许应霜", "刘焱", "谭玲", "刘灿",
                "陈乾微", "冉梓依", "李恩琦", "邓江清", "赵晶莹"};
        Random r = new Random(System.currentTimeMillis());
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要抽的人数：");
        int people = sc.nextInt();
        for (i = 0; i < people; i++) {
            int suiji = r.nextInt(name.length);
            //System.out.println(name[suiji]);
                System.out.println("第" + (i + 1) + "个被抽到的人：" + name[suiji]);
            try {
                // 延迟3秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
