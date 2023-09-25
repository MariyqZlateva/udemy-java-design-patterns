package com.zlateva;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Trying to make a captain for our team ");
        MakeCaptain captain = MakeCaptain.getInstance();

        System.out.println("New captain selected for our team "+ captain);


        System.out.println( "Trying to make another captain for our team ");
        MakeCaptain captain1 = MakeCaptain.getInstance();
        System.out.println(captain1);
        if (captain1.equals(captain)){
            System.out.println("Captain and Captain1 are the same instance");
        }
    }
}