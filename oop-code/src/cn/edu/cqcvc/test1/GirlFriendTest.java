package cn.edu.cqcvc.test1;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        GirlFriend gf1 = new GirlFriend();
        gf1.name = "文文";
        gf1.age = 18;
        gf1.height = 160;
        gf1.weight = 45;

        System.out.println(gf1.name);
        System.out.println(gf1.age);
        System.out.println(gf1.height);
        System.out.println(gf1.weight);

        gf1.sleep();
        gf1.eat();

        System.out.println("===========================");

        GirlFriend gf2 = new GirlFriend();
        gf2.name = "文儿";
        gf2.age = 19;
        gf2.height = 165;
        gf2.weight = 45;

        System.out.println(gf2.name);
        System.out.println(gf2.age);
        System.out.println(gf2.height);
        System.out.println(gf2.weight);

        gf2.sleep();
        gf2.eat();

    }
}
