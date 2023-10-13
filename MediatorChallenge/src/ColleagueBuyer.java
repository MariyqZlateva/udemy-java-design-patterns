public abstract class ColleagueBuyer {
    protected Mediator mediator;

    protected String name;
    protected int price;

    public ColleagueBuyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelingBid();

    public abstract void notificationForEnd();
}

class AuctionBuyer extends ColleagueBuyer{

    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelingBid() {
        this.price = -1;
    }

    @Override
    public void notificationForEnd() {
        System.out.println("Received message that the auction is over: "+ name );
    }
}
