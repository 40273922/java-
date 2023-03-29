package cla;

public class InsufficientException extends Exception{
    public InsufficientException(){
        System.out.println("金额不足！");
    }
}
