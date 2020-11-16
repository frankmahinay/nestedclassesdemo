package com.gamesys.nestedclassesdemo.exercises.anonymousclasses.color;

/**
 * Create a main method (whether in this class or a new one) which would contain an anonymous class
 *      - the anonymous class should be extending ColorRender, passing a specific color value to render
 *      - it should have a different implementation of printColor() method
 *          -- the method should instead print "Different render of a <the_specified_color> object"
 *      - call the anonymous class' printColor() method to verify the overridden implementation
 */
class ColorRender
{
    String color;

    public ColorRender(String color)
    {
        this.color = color;
    }

    public void printColor()
    {
        System.out.println("Rendering a " + color + "object");
    }


    public static void main(String[] args){

        ColorRender colorRender = new ColorRender("blue"){
            @Override
            public void printColor() {
                System.out.println("Different render of a  " + color + "object");
            }
        };
        colorRender.printColor();
    }
}