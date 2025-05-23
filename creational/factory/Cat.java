package creational.factory;

/**
 * Kelas Cat
 * 
 * Implementasi konkret dari interface Animal.
 * Kelas ini merepresentasikan tipe hewan spesifik (Kucing) yang dapat dibuat
 * oleh AnimalFactory.
 */
public class Cat implements Animal {
    // Tipe hewan
    private final String type;
    
    // Umur kucing
    private final int age;

    /**
     * Konstruktor untuk Cat
     * @param age Umur kucing
     */
    public Cat(int age) {
        this.type = "Cat";
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println("Meow! Saya berumur " + age + " tahun.");
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getAge() {
        return age;
    }
} 