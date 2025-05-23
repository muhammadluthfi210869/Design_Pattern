package creational.factory;

/**
 * Implementasi Pola Factory Method
 * - Mengkapsulasi logika pembuatan objek dalam kelas terpisah
 * - Menyediakan interface umum untuk pembuatan objek
 */
public class AnimalFactory {
    /**
     * Membuat hewan berdasarkan tipe dan umur yang ditentukan
     * 
     * @param type Tipe hewan yang akan dibuat ("dog" atau "cat")
     * @param age Umur hewan
     * @return Instance Animal baru
     * @throws IllegalArgumentException jika umur negatif atau tipe tidak dikenal
     */
    public static Animal createAnimal(String type, int age) {
        // Validasi umur
        if (age < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif");
        }
        
        // Buat tipe hewan yang sesuai menggunakan switch expression
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog(age);
            case "cat" -> new Cat(age);
            default -> throw new IllegalArgumentException("Tipe hewan tidak dikenal: " + type);
        };
    }
} 