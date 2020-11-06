package com.gamesys.nestedclassesdemo.samples.anonymous.extendsample;

class ThreadToUse extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child Thread");
    }
}
