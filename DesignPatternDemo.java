import creational.singleton.DatabaseConnection;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import structural.adapter.LegacyPaymentSystem;
import structural.adapter.PaymentAdapter;
import structural.adapter.PaymentProcessor;
import structural.decorator.BasicCoffee;
import structural.decorator.Coffee;
import structural.decorator.MilkDecorator;
import structural.decorator.SugarDecorator;
import behavioral.strategy.CreditCardPayment;
import behavioral.strategy.PayPalPayment;
import behavioral.strategy.PaymentContext;
import behavioral.observer.Subject;
import behavioral.observer.WeatherDisplay;

/**
 * Kelas DesignPatternDemo
 * 
 * Kelas ini mendemonstrasikan penggunaan semua pola desain yang telah diimplementasikan.
 * Membuat instance dari setiap pola dan menunjukkan cara kerjanya.
 */
public class DesignPatternDemo {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Pola Desain yang Ditingkatkan ===\n");

        // Uji Pola Singleton
        System.out.println("Menguji Pola Singleton:");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db1.connect();
        db2.disconnect();
        System.out.println();

        // Uji Pola Factory Method
        System.out.println("Menguji Pola Factory Method:");
        try {
            Animal dog = AnimalFactory.createAnimal("dog", 3);
            Animal cat = AnimalFactory.createAnimal("cat", 2);
            dog.speak();
            cat.speak();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Uji Pola Adapter
        System.out.println("Menguji Pola Adapter:");
        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem("ACC123", 1000.0);
        PaymentProcessor processor = new PaymentAdapter(legacySystem);
        processor.processPayment(100.0, "USD");
        System.out.println(processor.getPaymentStatus());
        System.out.println();

        // Uji Pola Decorator
        System.out.println("Menguji Pola Decorator:");
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Pesanan: " + coffee.getDescription());
        System.out.println("Biaya: $" + coffee.getCost());
        System.out.println();

        // Uji Pola Strategy
        System.out.println("Menguji Pola Strategy:");
        PaymentContext payment = new PaymentContext(
            new CreditCardPayment("1234-5678-9012-3456", "John Doe")
        );
        payment.pay(50.0);
        
        payment.setStrategy(new PayPalPayment("john.doe@example.com"));
        payment.pay(75.0);
        System.out.println();

        // Uji Pola Observer
        System.out.println("Menguji Pola Observer:");
        Subject weatherStation = new Subject();
        WeatherDisplay display1 = new WeatherDisplay("1");
        WeatherDisplay display2 = new WeatherDisplay("2");
        
        weatherStation.addObserver(display1);
        weatherStation.addObserver(display2);
        
        weatherStation.setState("Suhu: 25°C, Cuaca: Cerah");
        weatherStation.removeObserver(display1);
        weatherStation.setState("Suhu: 22°C, Cuaca: Berawan");
    }
}

