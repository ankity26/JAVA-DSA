package Inheritance;

public class BabyBox extends Box{
    double weight;

    BabyBox(){
        this.weight = -1;
    }

    BabyBox(double l , double h , double w , double weight){
        this.length = l;
        this.height = h;
        this.widht = w;
        this.weight = weight;
    }
}
