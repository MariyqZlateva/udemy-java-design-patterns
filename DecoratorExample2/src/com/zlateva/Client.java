package com.zlateva;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Client {
    public static void main(String[] args) {
        int c ;
        StringBuffer stringBuffer = new StringBuffer("Maria Zlateva aaBBBBBcccDDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();
        try {
            InputStream inputStream = new LowerCaseInputStream(new ByteArrayInputStream(bytes));
            while ((c = inputStream.read())>= 0){
                System.out.print((char) c);
            }
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
