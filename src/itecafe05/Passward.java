package itecafe05;

import java.util.Scanner;

public class Passward {
    
    private static String p;
    private static int missCount = 0;
    static Scanner scan = new Scanner(System.in);
    
    public static void pass() throws PassMiss {
        for (;;) {
            System.out.println("パスワードを入力してください");
            p = scan.next();
            if (p.equals("0120")) {
                System.out.println("ロックを解除します");
                System.out.println("");
                break;
            } else {
                System.out.println("▲もう一度パスワードを入力してください▲");
                missCount += 1;
                if (missCount == 5) {
                    System.out.println("▲システムを終了します▲");
                    System.exit(0);
                }
           
                
            }
        }
    }
}
