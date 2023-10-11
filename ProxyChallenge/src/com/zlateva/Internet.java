package com.zlateva;

public interface Internet {
    void connect(String hostName)throws Exception;
}

class RealConnect implements Internet {
    @Override
    public void connect(String hostName){
        System.out.println("Connect to "+ hostName);
    }
}
