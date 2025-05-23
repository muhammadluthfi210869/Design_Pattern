package structural.decorator;

/**
 * Interface Coffee
 * 
 * Interface ini mendefinisikan komponen dalam pola Decorator.
 * Ini adalah interface dasar yang akan diimplementasikan oleh komponen konkret
 * dan dekorator.
 */
public interface Coffee {
    /**
     * Mendapatkan deskripsi kopi
     * 
     * @return String yang mendeskripsikan kopi
     */
    String getDescription();

    /**
     * Mendapatkan biaya kopi
     * 
     * @return Biaya sebagai double
     */
    double getCost();
} 