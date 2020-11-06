package com.gamesys.nestedclassesdemo.samples.innerclass;

public class NonNestedStatic
{
    // displays properties outerClassX, outerClassY and outerPrivateInt
    static void display()
    {
        // can access static member of outer class
        System.out.println("outerClassX = " + OuterClassForStatic.outerClassX);

        // cannot access private static member
        System.out.println("OuterClass' private int outerPrivateInt = " + OuterClassForStatic.outerPrivateInt);

        // The only way to reference outerClassY would be through object reference
        OuterClassForStatic oc = new OuterClassForStatic();
        System.out.println("outerClassY = " + oc.outerClassY);

    }
}