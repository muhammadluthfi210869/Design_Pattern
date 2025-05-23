package creational.factory;

/**
 * Kelas Dog
 * 
 * Implementasi konkret dari interface Animal.
 * Kelas ini merepresentasikan tipe hewan spesifik (Anjing) yang dapat dibuat
 * oleh AnimalFactory.
 */
public class Dog implements Animal {
    // Tipe hewan
    private final String type;
    
    // Umur anjing
    private final int age;

    /**
     * Konstruktor untuk Dog
     * @param age Umur anjing
     */
    public Dog(int age) {
        this.type = "Dog";
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println("Woof! Saya berumur " + age + " tahun.");
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