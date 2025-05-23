package structural.decorator;

/**
 * Kelas MilkDecorator
 * 
 * Ini adalah dekorator konkret yang menambahkan susu ke kopi.
 * Memperluas fungsionalitas kopi dasar dengan menambahkan
 * susu dan biayanya ke deskripsi dan total biaya.
 */
public class MilkDecorator extends CoffeeDecorator {
    /**
     * Konstruktor untuk MilkDecorator
     * 
     * @param coffee Kopi yang akan ditambahkan susu
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " dengan Susu";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5; // Biaya tambahan untuk susu
    }
} 