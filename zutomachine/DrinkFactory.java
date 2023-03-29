package zutomachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrinkFactory{

    public Drink getDrinkInstance(){
        try {
            Scanner scanner = new Scanner(System.in);
            Thread.sleep(100);
            System.out.println("请输入饮料类型(1~6):");
            if (!scanner.hasNextInt()) {
                throw new InputMismatchException("请输入数字！");
            } else {
                return switch (scanner.nextInt()){
                    case 1 -> new Coffee("咖啡: 苦");
                    case 2 -> new Watermalon("西瓜汁: 甜");
                    case 3 -> new Apple("苹果汁: 甜");
                    case 4 -> new Cola("可乐: 甜");
                    case 5 -> new Orange("橙汁: 酸");
                    case 6 -> new Fenda("芬达: 酸");
                    default -> throw new DrinkNotFoundException();
                };
            }
        }catch (DrinkNotFoundException | InputMismatchException e) {
            e.printStackTrace();
            return null;
        } catch (InterruptedException ignored) {
            return null;
        }
    }
}
