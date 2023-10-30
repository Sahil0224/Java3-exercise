package Model;
public class Car {

    private Integer id;
    private String make;
    private String model;
    private Float price;
    private Engine engine;

    public Car(Integer id, String make, String model, Float price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price =  price;
    }

    public Car(Integer id, String make, String model, Float price, Engine engine) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.engine = engine;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }
    
    @Override
    public String toString() {
        return "{" + id + ": " + make + " " + model + " " + price + "}";
    }
}
