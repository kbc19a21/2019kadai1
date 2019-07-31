package itecafe05;

import java.util.Scanner;

public class Insert {

    static Scanner scan = new Scanner(System.in);
    private static String bb;
    private static int b;

    public static int insertNumber() {
        for (;;) {

            try {
                bb = scan.next();
                b = Integer.parseInt(bb);
            } catch (NumberFormatException e) {
                System.out.println("▲入力エラー：数値を入力してください▲");
                continue;
            }
            if(b>=100000){
                System.out.println("▲入力エラー：数値が上限を超えています▲");
                continue;
            }

            return b;

        }
    }

    public static int foolProof() {
        for (;;) {
            System.out.println("1.はい　2.いいえ");
            try {
                bb = scan.next();
                b = Integer.parseInt(bb);
            } catch (NumberFormatException e) {
                System.out.println("▲入力エラー：数値を入力してください▲");
                continue;
            }
            switch (b) {
                case 1:
                case 2:
                    break;
                default:
                    continue;
            }
            return b;
        }

    }
}
