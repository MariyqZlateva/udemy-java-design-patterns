package com.zlateva;

public class Client {
    public static void main(String[] args) throws Exception {
        Internet connect = new ProxyConnect();
        try {
            connect.connect("mimi.com");
            connect.connect("ugly.com");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
