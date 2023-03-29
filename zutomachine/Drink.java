package zutomachine;

public abstract class Drink {
    private final String desc;

    public String getDesc() {
        return desc;
    }

    public Drink (String s){
        desc = s;
    }
    public void taste(){
        System.out.println(getDesc());
    }
}
