package zutomachine;

public class DrinkNotFoundException extends Exception {
        public DrinkNotFoundException(){
            System.out.println("对不起，没有您输入的饮料类型！");
        }
}
