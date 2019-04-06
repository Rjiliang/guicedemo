package com.cherry;

public class App {


    /**
     * bootstrap
     * parse command line
     * setup environment
     * kick off main logic
     * @param args
     */
    public static void main( String[] args ) {
        MyApplet mainApplet = Configuration.getMainApplet();
        mainApplet.run();
    }




}
