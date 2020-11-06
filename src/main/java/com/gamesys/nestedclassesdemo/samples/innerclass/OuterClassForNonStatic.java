package com.gamesys.nestedclassesdemo.samples.innerclass;

class OuterClassForNonStatic
{  
    // static member 
    static int outerClassX = 10; 
      
    // instance(non-static) member 
    int outerClassY = 20; 
      
    // private non-static member
    private int outerPrivateInt = 30;
      
    // inner class 
    class InnerClass 
    { 
        void display() 
        { 
            // can access static member of outer class 
            System.out.println("outerClassX = " + outerClassX); 
              
            // can also access non-static member of outer class 
            System.out.println("outerClassY = " + outerClassY); 
              
            // can also access a private member of the outer class 
            System.out.println("outerPrivateInt = " + outerPrivateInt); 
          
        } 
    }

    public static void main(String[] args)
    {
        OuterClassForNonStatic outer = new OuterClassForNonStatic();
        OuterClassForNonStatic.InnerClass ic = outer.new InnerClass();
        ic.display();

    }
}




