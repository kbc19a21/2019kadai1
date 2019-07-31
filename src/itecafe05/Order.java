package itecafe05;

import java.util.ArrayList;

public class Order {

    private static final double TAX = 1.08;
    private static int c;
    static ArrayList<Food> order = new ArrayList<>();

    public static int orderNumber(Food f, int b) {

        System.out.println("");
        System.out.println("数量を入力してください");

        c = Insert.insertNumber();

        int money = Calc.calculation(f, c);

        System.out.println(f.getName() + " " + c + "点 (税込み)" + money + "円");
        f.setSumItem(f.getSumItem() + c); //1つの商品の数量の合計

        return money;
    }

    public static void list(Food f) {
        order.add(f);
    }

    public static void orderList(int sumMoney) {
        System.out.println("■■■購入リスト■■■");
        for (int a = 0; a < order.size(); a++) {
            System.out.println(order.get(a).getName() + "  " + order.get(a).getSumItem() + "点" + "  （税込み）" + (int) (order.get(a).getPrice() * order.get(a).getSumItem() * TAX) + "円");
        }
        System.out.println("合計：(税込み)"+sumMoney+"円");
    }
}
