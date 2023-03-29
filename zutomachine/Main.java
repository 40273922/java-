package zutomachine;

public class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            try {
                new DrinkFactory().getDrinkInstance().taste();
            }catch (NullPointerException ignored){}
        }
    }
}
