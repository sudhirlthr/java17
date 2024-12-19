package io.sudhir.log.java17_features.sealed;

public class SealedClassesExample {
    public static void main(String[] args) {
        Shape rectableShape = new Rectangle();
        rectableShape.printShapeType();

        Shape transparentCircle = new TransparentCircle();
        transparentCircle.printShapeType();
    }
}
sealed class Shape permits Rectangle, Circle{
    public void printShapeType(){
        System.out.println("In Shape super class");
    }
}
/*
* Note here Rectangle is final class
* */
final class Rectangle extends Shape {

    @Override
    public void printShapeType() {
        System.out.println("In Rectangle subclass of Shape superclass");
    }
}
// below extend(commented is not possible since Rectangle is final
//class TransparentRectangle extends Rectangle{ }

// but another sealed class or non sealed classes are possible
sealed class Circle extends Shape permits TransparentCircle{

    @Override
    public void printShapeType() {
        super.printShapeType();
        System.out.println("In Circle subtype of Shape superclass");
    }
}


/*
* here is an example of non-sealed class of sealed class Circle which is again sub-class of Seal class Shape
*
* */
non-sealed class TransparentCircle extends Circle{

    @Override
    public void printShapeType() {
        super.printShapeType();
        System.out.println("In TransparentCircle sub-class of Circle Super class");
    }
}