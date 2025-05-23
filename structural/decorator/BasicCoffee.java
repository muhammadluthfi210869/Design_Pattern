package structural.decorator;

/**
 * Kelas BasicCoffee
 * 
 * Ini adalah komponen konkret dalam pola Decorator.
 * Merepresentasikan kopi dasar tanpa topping tambahan.
 */
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Kopi Dasar";
    }

    @Override
    public double getCost() {
        return 2.0; // Biaya dasar kopi
    }
} 