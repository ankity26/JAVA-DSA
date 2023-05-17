package OOP_1;

public class Door
{
//    private String code;
//    private int seats;
//
//    public Room(String classCode , int numberOfSeats)
//    {
//        this.code = classCode;
//        this.seats = numberOfSeats;
//    }

//    private String sound;
//
//    public Whistle(){
//    }
//    public Whistle(String sound){
//        this.sound = sound;
//    }
//    public void toprintthis(String sound){
//        System.out.println(sound);
//    }
    public Door(){

    }

    public void knock(){
        System.out.println("Who there mf!");
    }

    public static void main(String[] args) {

        Door newdoor = new Door();
        newdoor.knock();

    }

}


