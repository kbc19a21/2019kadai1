package itecafe05;

import static itecafe05.Order.order;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ITECafe05 {

    private static final double TAX = 1.08;

    public static void main(String[] args) {

        Food hotcoffee = new Drink(1, "ホットコーヒー　　", 280);
        Food tea = new Drink(2, "紅茶　　　　　　　", 260);
        Food icecoffee = new Drink(3, "アイスコーヒー　　", 200);
        Food icetea = new Drink(4, "アイスティー　　　", 260);
        Food shortcake = new Sweet(5, "ショートケーキ　　", 400);
        Food cheesecake = new Sweet(6, "チーズケーキ　　　", 400);
        Food chocolate = new Sweet(7, "チョコレートケーキ", 450);
        Food chocobananapafe = new Sweet(8, "チョコバナナパフェ", 390);
        Food strawberrypafe = new Sweet(9, "イチゴパフェ　　　", 390);
        Food meatPasta = new Snack(10, "ミートピザ", 650);
        Food mixPizza = new Snack(11, "ミックスピザ", 700);
        Food croissant = new Pan(12, "クロワッサン", 180);
        Food toastSandwich = new Pan(13, "トーストサンド", 200);
        Food frenchToast = new Pan(14, "フレンチトースト", 210);

        ArrayList<Food> items = new ArrayList<>();

        items.add(hotcoffee);
        items.add(tea);
        items.add(icecoffee);
        items.add(icetea);
        items.add(shortcake);
        items.add(cheesecake);
        items.add(chocolate);
        items.add(chocobananapafe);
        items.add(strawberrypafe);
        items.add(meatPasta);
        items.add(mixPizza);
        items.add(croissant);
        items.add(toastSandwich);
        items.add(frenchToast);
        try {
            Passward.pass();
        } catch (PassMiss ex) {
            Logger.getLogger(ITECafe05.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("　　　　　■■■ITECafe■■■");
        System.out.println("");
        for (int a = 0; a < items.size(); a++) {
            System.out.println(items.get(a).getNo() + " : " + items.get(a).getName() + " 税抜き　￥" + items.get(a).getPrice() + "円(税込み　￥" + (int) (items.get(a).getPrice() * TAX) + ")");
        }
        int sumMoney = 0;

        int castMoney = 0; //投入金額の合計

        for (;;) {
            System.out.println("");
            System.out.println("商品番号を入力してください　0：会計へ");
            int b = Insert.insertNumber();

            if (b > items.size()) {
                System.out.println("▲商品番号を入力してください▲");
                continue;
            }

            if (b == 0) { //0を入れるとループを抜ける
                System.out.println("お会計でよろしいでしょうか？");
                int d = Insert.foolProof();
                if (d == 1) {
                    break;
                } else {
                    continue;
                }

            }

            Order.list(items.get(b - 1));

            System.out.println(items.get(b - 1).getName() + "   (税込み)￥" + (int) (items.get(b - 1).getPrice() * TAX));

            int money = Order.orderNumber(items.get(b - 1), b);

            sumMoney += money; //値段の合計
            Order.orderList(sumMoney);

        }

        Order.orderList(sumMoney);

        int preSumMoney = sumMoney; //100円引き前（クーポンを発券するか判断するため）

        Coupon.nebiki(sumMoney);//100円引き

        Siharai.castMoney(sumMoney);

        Receipt.receipt();

        Coupon.coupon(preSumMoney);

        System.out.println("");
        System.out.println("ありがとうございました");
        System.out.println("またのご来店をお待ちしております😊");

        Date now = new Date();
        System.out.println("");
        System.out.println(now);

    }

}
