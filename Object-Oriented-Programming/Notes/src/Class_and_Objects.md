# Class and Objects 

A class defines the attributes of objects, i.e., the information related to them (instance variables), and their commands, i.e., their methods. The values of instance (i.e., object) variables define the internal state of an individual object, whereas methods define the functionality it offers.

As an example, ArrayList is a class offered by Java, and we've made use of objects instantiated from it in our programs. Below, an ArrayList object named integers is created and some integers are added to it.


        ArrayList<Integer> integers = new ArrayList<>();
        //we create an object from the ArrayList class named integers
        // let's add the values 15, 34, 65, 111 to the integers object
        integers.add(15);
        integers.add(34);
        integers.add(65);
        integers.add(111);
        // we print the size of the integers object
        System.out.println(integers.size());

An **object** is always instantiated by calling a method that created an object, i.e., a **constructor** by using the new keyword.


