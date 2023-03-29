package cla;

public class CashCard {

    String no;
    double money;

    public CashCard(String no, double money) {
        this.money = money;
        this.no = no;
    }

    public void input(double in) {
        try {
            if (in >= 0) {
                System.out.println("明细(" + no + "," + money + ")");
                System.out.println("为(" + no + "," + money + ")" + "存钱：" + in);
                System.out.println("明细(" + no + "," + (money + in) + ")");
            } else {
                throw new NegativeFundsException();
            }
        } catch (NegativeFundsException e) {
            e.printStackTrace();
        }


    }

    public void output(double out) {
        try {
            if (0 <= out && out <= money) {
                System.out.println("明细(" + no + "," + money + ")");
                System.out.println("为(" + no + "," + money + ")" + "取钱：" + out);
                System.out.println("明细(" + no + "," + (money - out) + ")");
            } else {
                throw new InsufficientException();
            }
        } catch (InsufficientException e) {
            e.printStackTrace();
        }

    }
}