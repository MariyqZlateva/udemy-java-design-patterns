package com.zlateva;

public class MakeCaptain {
    private MakeCaptain() {
    }

    public static class MakeCapitanHelper{
        public static final MakeCaptain UNIQUE_CAPITAN = new MakeCaptain();
    }

    public static MakeCaptain getInstance(){
        return MakeCapitanHelper.UNIQUE_CAPITAN;
    }

}
