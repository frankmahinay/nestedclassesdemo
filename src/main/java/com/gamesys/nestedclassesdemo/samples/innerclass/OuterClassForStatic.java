package com.gamesys.nestedclassesdemo.samples.innerclass;

public class OuterClassForStatic
{  
    // static member 
    static int outerClassX = 10; 
      
    // instance(non-static) member 
    int outerClassY = 20; 
      
    // private static member 
    private static int outerPrivateInt = 30; 
      
    // static nested class 
    public static class StaticNestedClass
    { 
        // displays properties outerClassX, outerClassY and outerPrivateInt
        public static void display()
        { 
            // can access static member of outer class 
            System.out.println("outerClassX = " + outerClassX); 
              
            // can access private static member of outer class 
            System.out.println("OuterClass' private int outerPrivateInt = " + outerPrivateInt); 
              
            // The statement below gives a compilation error 
            // since static nested class cannot directly access non-static members 
            //System.out.println("outerClassY = " + outerClassY);

            // The only way to reference outerClassY would be through object reference
            OuterClassForStatic oc = new OuterClassForStatic();
            System.out.println("outerClassY = " + oc.outerClassY);
          
        } 
    }
    public static void main(String[] args) 
    { 
        // accessing a static nested class 
        StaticNestedClass nestedObject = new OuterClassForStatic.StaticNestedClass(); 
          
        nestedObject.display(); 
          
    }     
} 