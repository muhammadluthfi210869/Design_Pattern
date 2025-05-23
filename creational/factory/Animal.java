package creational.factory;

/**
 * Interface Animal
 * 
 * Interface ini mendefinisikan kontrak untuk semua tipe hewan dalam factory kita.
 * Ini adalah bagian dari pola Factory Method di mana kita mendefinisikan interface umum
 * untuk semua produk (hewan) yang akan dibuat oleh factory.
 */
public interface Animal {
    /**
     * Membuat hewan bersuara
     */
    void speak();

    /**
     * @return Tipe hewan
     */
    String getType();

    /**
     * @return Umur hewan
     */
    int getAge();
} 