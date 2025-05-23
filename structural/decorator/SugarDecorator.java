package structural.decorator;

/**
 * Kelas SugarDecorator
 * 
 * Ini adalah dekorator konkret yang menambahkan gula ke kopi.
 * Memperluas fungsionalitas kopi dasar dengan menambahkan
 * gula dan biayanya ke deskripsi dan total biaya.
 */
public class SugarDecorator extends CoffeeDecorator {
    /**
     * Konstruktor untuk SugarDecorator
     * 
     * @param coffee Kopi yang akan ditambahkan gula
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " dengan Gula";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.2; // Biaya tambahan untuk gula
    }
} 