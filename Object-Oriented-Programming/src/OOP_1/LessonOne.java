package OOP_1;

public class LessonOne
{
    public static void main(String[] args) {

        //creating an application to store a student roll no
        int[] rollNo = new int[5];
        //Creating an application to store name of a student
        String[] names = new String[5];

        //Now we want to create a application where we want to store RollNo Names and Marks for this we Need Classes And Objects
        //Now here we are declaring and initializing our class

        //OOP_1.Students student1 = new OOP_1.Students();  //new is used for dynamic allocation during runtime
        //Student() ----> is a constructor or a function

//        student1.rollNO = 10;  //we use (.) operator to access and modify or we can say manipulate our class
//        student1.marks = 45.3f;
//        student1.Name = "Ankit Yadav";

        //Giving rollNo above is kind of repeating and if we don't want to repeat we can use constructor

        Students student2  = new Students(13 , "Rahul" , 85.06f );
        System.out.println(student2.rollNO);


    }



}
//Now Creating Class
//for every single element
//This will be our own dataTypes like int and bools are

class Students{
    int rollNO;
    String Name;
    float marks;

    //some constructors or we can simply say some function
    Students(int Roll , String Naam , float Marks ){
        this.rollNO = Roll;
        this.Name = Naam;
        this.marks = Marks;
    }

}