package com.zlateva;

public class ProxyConnect implements Internet {

   private RealConnect realConnect = new RealConnect();
   private String[] restrictedSites = {"bad.bg", "ugly.com", "lazy.eu"};
    @Override
    public void connect(String hostName) throws Exception {
        for (int i = 0; i < restrictedSites.length; i++) {
            String current = restrictedSites[i];
            if (current.equalsIgnoreCase(hostName)){
                throw new Exception("Access Denied!");
            }
        }
        realConnect.connect(hostName);
    }
}
