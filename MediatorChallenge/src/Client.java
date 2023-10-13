public class Client {
    public static void main(String[] args) {
        System.out.println("");
        Mediator med = new MediatorImpl();

        ColleagueBuyer b1 = new AuctionBuyer(med, "Jim");
        ColleagueBuyer b2 = new AuctionBuyer(med, "Jason");
        ColleagueBuyer b3 = new AuctionBuyer(med, "Fin");

        med.addBuyer(b1);
        med.addBuyer(b2);
        med.addBuyer(b3);

        System.out.println("Welcome to the auction. Today we are selling car");
        System.out.println("---------------------------------------------------");
        System.out.println("Waiting for the buyer's offers....");

        b1.bid(1500);
        b2.bid(2000);
        b3.bid(780);

        System.out.println("------------------------------------------------------");
        med.findHighestBidder();

        b2.cancelingBid();
        System.out.println(b2.name + " Has canceled his bid! In that case ");
        med.findHighestBidder();
    }
}
