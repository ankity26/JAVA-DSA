package Inheritance;

public class Box {

    double length;
    double height;
    double widht;

    Box(){
        this.length = -1;
        this.height = -1;
        this.widht = -1;
    }

    Box(double l , double h , double w){
        this.length = l;
        this.height = h;
        this.widht = w;
    }

    //for cube
    Box(double side){
        this.length = side;
        this.height = side;
        this.widht = side;
    }
    
}
