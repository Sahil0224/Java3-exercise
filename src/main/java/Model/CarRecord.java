package Model;

public record CarRecord(Integer id, String make, String model, String price) {

    @Override
    public String toString() {
        return "{" + id + ": " + make + " " + model + " " + price + "}";
    }
}
