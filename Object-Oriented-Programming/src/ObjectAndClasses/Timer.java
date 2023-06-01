package ObjectAndClasses;

public class Timer {

    ClockHand hundredth_second;
    ClockHand seconds;
    public Timer(){
        this.hundredth_second = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance(){
        this.hundredth_second.advance();
        if (this.hundredth_second.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString(){
        return seconds + ":" + hundredth_second;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}
