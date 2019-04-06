package com.cherry.helloworlddemo;

import com.cherry.MyApplet;


public class StringWritingApplet implements MyApplet {

    private MyDesitination destination;
    private StringProvider provider;

    public StringWritingApplet(MyDesitination destination, StringProvider provider) {
        this.destination = destination;
        this.provider = provider;
    }

    private  void printHelloWorld() {
        destination.write( provider.get() );
    }

    public void run() {
        printHelloWorld();
    }
}
