package com.gamesys.nestedclassesdemo.samples.innerclass.local;

public class OuterClassForLocalInner
{ 
    private int outerClassIntProperty = 50;
    private void getValue() 
    {
        // Note that local variable(sum) must be final till JDK 7
        // hence this code will work only in JDK 8 
        int sum = 20;
          
        // Local inner Class inside method 
        class Inner
        {
            public final static String sampleText = "Hello";

            public int divisor;
             
            public Inner()
            {
                divisor = 4;
            }

            private int getDivisor() 
            {
                return divisor;
            } 
            private int getQuotient() 
            { 
                System.out.println("Inside inner class"); 
                return sum / divisor; 
            } 
            private int getTempValue()
            {
                return outerClassIntProperty;
            }
        } 
          
        Inner inner = new Inner();
        System.out.println("Divisor = "+ inner.getDivisor());
        System.out.println("Quotient = " + inner.getQuotient());
        System.out.println("Temp = " + inner.getTempValue());
    } 
      
    public static void main(String[] args) 
    { 
        OuterClassForLocalInner outer = new OuterClassForLocalInner(); 
        outer.getValue(); 
    } 
}
