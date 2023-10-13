import java.util.ArrayList;

public interface Mediator {
    void addBuyer(ColleagueBuyer buyer);

    void findHighestBidder();
}

class MediatorImpl implements Mediator {
    private ArrayList<ColleagueBuyer> buyersList;

    public MediatorImpl() {
        buyersList = new ArrayList<>();
    }


    @Override
    public void addBuyer(ColleagueBuyer buyer) {
        buyersList.add(buyer);
        System.out.println(buyer.name + " was added to the buyer list");
    }

    @Override
    public void findHighestBidder() {
        int maxBind = 0;
        ColleagueBuyer winner = null;
        for (ColleagueBuyer c : buyersList) {
            if (c.price > maxBind) {
                maxBind = c.price;
                winner = c;
            }
        }
        System.out.println("The auction winner is "+ winner.name
        +". He paid "+ winner.price + "$ for the item.");

        for (ColleagueBuyer c : buyersList) {
            ColleagueBuyer b = c;
            c.notificationForEnd();
        }
    }
}
