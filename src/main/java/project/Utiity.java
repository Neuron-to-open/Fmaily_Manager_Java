package project;

import java.util.Scanner;

/**
 * DATE: 2023/1/8
 * Author: yjy --- BUPT
 */
public class Utiity {
    private static Scanner in;

    public Utiity() {
    }

    public static char readMenuSelection() {
        while(true) {
            String str = readKeyBoard(1);
            char c = str.charAt(0);
            if (c == '1' || c == '2' || c == '3' || c == '4') {
                return c;
            }

            System.out.println("选择错误，请重新输入：");
        }
    }

    public static int readNumber() {
        while(true) {
            String str = readKeyBoard(4);

            try {
                int n = Integer.parseInt(str);
                return n;
            } catch (NumberFormatException var3) {
                System.out.println("数字输入错误，请重新输入：");
            }
        }
    }

    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }

    public static char readConfirmSelection() {
        while(true) {
            String str = readKeyBoard(1).toUpperCase();
            char c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                return c;
            }

            System.out.println("选择错误，请重新输入: ");
        }
    }

    public static String readKeyBoard(int limit) {
        String line = "";
        if (in.hasNext()) {
            line = in.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.println("输入长度(不大于" + limit + ") 错误，请重新输入");
            }
        }

        return line;
    }

    static {
        in = new Scanner(System.in);
    }
}
