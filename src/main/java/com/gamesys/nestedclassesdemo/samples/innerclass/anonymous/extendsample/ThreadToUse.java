package com.gamesys.nestedclassesdemo.samples.innerclass.anonymous.extendsample;

class ThreadToUse extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child Thread");
    }
}
