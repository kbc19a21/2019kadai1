package itecafe05;

public class Receipt {

    private static int g;

    public static void receipt() {
        for (;;) {
            System.out.println("レシートはご入用ですか？");
            System.out.println("1.はい　　2.いいえ");
            g = Insert.insertNumber();
            if (g == 1) {
                System.out.println("レシートの返しになります");
                break;
            } else if (g == 2) {
                break;
            } else {
                System.out.println("▲”1”もしくは”2”を入力してください▲");
            }

        }
    }
}
