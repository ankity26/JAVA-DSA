package ObjectAndClasses;

public class Product {
//     name, location and weight.
    String name;
    String location;
    int weight;

    public Product(String NaMe){
        this.name = NaMe;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String NaMe, String location){
        this.name = NaMe;
        this.location = location;
        this.weight = 1;
    }

    public Product(String NaMe, int weight){
        this(NaMe);  //Constructor Overloading;
        this.name = NaMe;
        this.weight = weight;
    }

    public String toString(){
        return this.name + " (" + this.weight +") " + "can be found from " + this.location;
    }

    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
