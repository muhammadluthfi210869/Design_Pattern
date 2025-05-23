package structural.decorator;

/**
 * Implementasi Pola Decorator
 * - Kelas dekorator abstrak yang mempertahankan referensi ke komponen
 * - Mendelegasikan operasi ke komponen yang didekorasi
 */
public abstract class CoffeeDecorator implements Coffee {
    // Kopi yang didekorasi
    protected Coffee coffee;

    /**
     * Konstruktor untuk CoffeeDecorator
     * 
     * @param coffee Kopi yang akan didekorasi
     */
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
} 