package itecafe05;

public class Siharai {

    private static int f;
    private static int castMoney;

    public static void castMoney(int sumMoney) {
        System.out.println("お金を投入してください"); //金の投入
        for (;;) {
            f = Insert.insertNumber();
            castMoney += f;
            System.out.println("お預かり　￥" + castMoney + "円");
            if (castMoney >= sumMoney) { //ループを抜ける
                break;
            }
            System.out.println("足りない金額を追加してください");
            System.out.println("残り　￥" + (sumMoney - castMoney) + "円");
        }

        System.out.println("");
        if (sumMoney == castMoney) {
            System.out.println(castMoney + "円、ちょうどお預かりします");
        } else {
            int oturi = castMoney - sumMoney;
            System.out.println(castMoney + "円、お預かりします");
            System.out.println(oturi + "円のお返しになります");
        }

    }

}
