package Model;

public class Engine {
    private final Float displacement;
    private final Integer numCylinders;

    public Engine(Float displacment, Integer numCylinders) {
        this.displacement = displacment;
        this.numCylinders = numCylinders;
    }

    public Float getDisplacment() {
        return displacement;
    }

    public Integer getNumCylinders() {
        return numCylinders;
    }


    @Override
    public String toString() {
        return "{" + displacement + " " + numCylinders + "}";
    }
}
