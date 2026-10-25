package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int loopCount = 0; loopCount<10; loopCount++){
            System.out.println(loopCount+1);
            Thread.sleep(1000);
        }
        System.out.println("Launch!");
    }
}
