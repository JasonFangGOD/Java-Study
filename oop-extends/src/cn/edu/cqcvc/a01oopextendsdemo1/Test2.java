package cn.edu.cqcvc.a01oopextendsdemo1;

public class Test2 {
    public static void main(String[] args) {
        for(int i = 0 ;i <= 10000;i++){
            if(i % 10 == 7 || i == 7 || i%7==0){
                System.out.println("过"+"\t");
                continue;
            }else{
                System.out.print(i+"\t");
            }
        }
    }
}
