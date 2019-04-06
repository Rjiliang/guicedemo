package com.cherry.helloworlddemo;

import java.io.PrintStream;

public class PrintStreamWriter implements MyDesitination {
    private PrintStream printStream;

    public PrintStreamWriter(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void write(String s) {
        printStream.println(s);
    }
}
