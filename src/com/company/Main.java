package com.company;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            URL url=new URL("http://www.google.com");
            URLConnection con=url.openConnection();
            InputStream input=con.getInputStream();
            int i;
            while((i=input.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}
    }
}
