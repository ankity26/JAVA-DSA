package ObjectAndClasses;

public class ClockHand {
//Instance variable below.
    int value;
     int limit;

    //Constructor
    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        value = value + 1;

        if (value >= limit) {
            value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return " " + this.value;
    }

}
