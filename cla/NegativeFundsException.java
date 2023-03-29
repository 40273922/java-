package cla;

public class NegativeFundsException extends Exception{
    public NegativeFundsException(){
        System.out.println("存取款金额不能为负数！");
    }
}
