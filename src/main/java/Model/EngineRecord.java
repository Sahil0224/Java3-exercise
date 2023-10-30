package Model;

import java.text.NumberFormat;

public record EngineRecord(Integer numCylinders, Float displacement, Float taxes) {
    static NumberFormat formatter = NumberFormat.getCurrencyInstance();

    @Override
    public String toString() {
        return "{Cyl: " + numCylinders + ", Size: " + displacement + ", Taxes: " + formatter.format(taxes) + "}";
    }
}
