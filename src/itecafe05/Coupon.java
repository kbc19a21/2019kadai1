package itecafe05;

public class Coupon {

    public static int d;

    public static int nebiki(int money) {

        for (;;) { //1か2以外でループを抜けさせない
            System.out.println("クーポン券を使いますか？");
            System.out.println("1. 使う　　2.ない");
            d = Insert.insertNumber();
            if (d == 1) {
                money -= 100;
                System.out.println("合計  ￥ " + money);
                break;
            } else if (d == 2) {
                break;
            }
            System.out.println("▲”1”もしくは”2”を入力してください▲");
        }
        return money;
    }

    public static void coupon(int preSumMoney) {
        if (preSumMoney >= 1000) {
            System.out.println("100円引きのクーポンを発券します");
            System.out.println("ご使用は1日1回までとさせていただきます");
            System.out.println("次回以降の来店時にお使いください");
        }
    }
}
