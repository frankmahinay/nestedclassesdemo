package com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.extendsample;

class MyThread {
    public static void main(String[] args) {
        //Anonymous Inner class that extends Thread class
        Thread t = new Thread() {
            public void run() {
                System.out.println("Child Thread");
            }
        };
        // ThreadToUse t = new ThreadToUse();
        t.start();
        System.out.println("Main Thread");
    }
}
