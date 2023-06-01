package ObjectAndClasses;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ObjectsInList {

    String name;

    public ObjectsInList(String names){
        this.name = names;
    }

    public  String toString(){
     return "name: " + name;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ObjectsInList> persons = new ArrayList<>();

// Read the names of persons from the user
        while (true) {
            System.out.print("Enter a name, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            persons.add(new ObjectsInList(name));
        }

        for(ObjectsInList a : persons){
            System.out.println(a);
        }



    }
}
