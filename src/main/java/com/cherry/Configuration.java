package com.cherry;

import com.cherry.helloworlddemo.StringProvider;
import com.cherry.helloworlddemo.StringWritingApplet;
import com.cherry.helloworlddemo.PrintStreamWriter;

public class Configuration {

    public static MyApplet getMainApplet() {
        return new StringWritingApplet(new PrintStreamWriter(System.out), new StringProvider() {
            @Override
            public String get() {
                return "Hello World!";
            }
        });
    }

}
