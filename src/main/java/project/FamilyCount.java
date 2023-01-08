package project;

/**
 * DATE: 2023/1/8
 * Author: yjy --- BUPT
 */
import java.util.Scanner;

public class FamilyCount {
    public FamilyCount() {
    }

    public static void main(String[] args) {
        boolean Flag = true;
        String details = "收支\t账户金额\t收支金额\t说  明\n";
        int balance = 0;

        while(Flag) {
            System.out.println("-----------家庭收支记账软件-----------\n");
            System.out.println("            1.收支明细\n");
            System.out.println("            2.登记收入\n");
            System.out.println("            3.登记支出\n");
            System.out.println("            4.退   出\n");
            System.out.println("            请选择(1-4)\n");
            new Scanner(System.in);
            char selection = Utiity.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("1.收支明细");
                    System.out.println("--------------当前收支明细记录-----------");
                    System.out.print(details);
                    System.out.println("-------------------------------------");
                    break;
                case '2':
                    System.out.println("2.登记收入");
                    System.out.print("本次收入金额");
                    int money = Utiity.readNumber();
                    System.out.print("本次收入说明");
                    String info = Utiity.readString();
                    balance += money;
                    details = details + "收入\t" + balance + "\t" + money + "\t" + info + "\n";
                    System.out.println("------------登记完成------------");
                    break;
                case '3':
                    System.out.println("3.登记支出");
                    System.out.print("本次收入金额");
                    int money_out = Utiity.readNumber();
                    System.out.print("本次收入说明");
                    String outfo = Utiity.readString();
                    if (balance >= money_out) {
                        balance -= money_out;
                        details = details + "支出\t" + balance + "\t" + money_out + "\t" + outfo + "\n";
                    } else {
                        System.out.println("支出超出用户余额，支付失败");
                    }

                    System.out.println("------------登记支出完成------------");
                    break;
                case '4':
                    System.out.print("确认是否退出（Y/N）：");
                    char isExit = Utiity.readConfirmSelection();
                    if (isExit == 'Y') {
                        Flag = false;
                    }
            }
        }

    }
}