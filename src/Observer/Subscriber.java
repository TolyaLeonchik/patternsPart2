package Observer;

import java.util.List;

public class Subscriber implements Observer{
    String nameAccount;

    public Subscriber(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    @Override
    public void steamEventSale(List<String> games) {
        System.out.println("Dear " + this.nameAccount + "!\nWe have games on sale!" + games + "\n-------------");
    }
}
