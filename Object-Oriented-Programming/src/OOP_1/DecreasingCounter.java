package OOP_1;

public class DecreasingCounter //this is class
{
    int value; //this is instance variable
    public DecreasingCounter(int initialValue) { //this is constructor
        this.value = initialValue;
    }

    public void printValue(){
        System.out.println("value: " + this.value); //this is method of the classes
    }

    public void decrement() {

        value = value-1;
    }

    public void reset(){
        value = 0;
    }

    public static void main(String[] args) {

        DecreasingCounter num = new DecreasingCounter(10);

        //num is object of class DecreasingCounter.

        num.printValue();

        num.decrement();
        num.decrement();

        num.printValue();
        num.reset();
        num.printValue();
    }


}
