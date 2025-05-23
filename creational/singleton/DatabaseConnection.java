package creational.singleton;

import java.util.UUID;

/**
 * Implementasi Pola Singleton
 * 
 * Pola ini memastikan bahwa sebuah kelas hanya memiliki satu instance dan menyediakan
 * titik akses global untuk instance tersebut.
 * Fitur utama:
 * - Konstruktor private untuk mencegah instansiasi langsung
 * - Variabel instance statis
 * - Implementasi thread-safe menggunakan volatile dan synchronized
 * - Pelacakan status koneksi
 */
public class DatabaseConnection {
    // Kata kunci volatile memastikan bahwa multiple thread menangani variabel instance dengan benar
    private static volatile DatabaseConnection instance;
    
    // Pengidentifikasi unik untuk setiap instance koneksi
    private final String connectionId;
    
    // Melacak status koneksi
    private boolean isConnected;

    // Konstruktor private mencegah instansiasi langsung
    private DatabaseConnection() {
        this.connectionId = UUID.randomUUID().toString();
        this.isConnected = false;
        System.out.println("Database connection initialized with ID: " + connectionId);
    }

    /**
     * Implementasi thread-safe dari getInstance menggunakan double-checked locking
     * @return Instance tunggal dari DatabaseConnection
     */
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    /**
     * Membuat koneksi database jika belum terhubung
     */
    public void connect() {
        if (!isConnected) {
            isConnected = true;
            System.out.println("Database connected successfully. Connection ID: " + connectionId);
        }
    }

    /**
     * Menutup koneksi database jika sedang terhubung
     */
    public void disconnect() {
        if (isConnected) {
            isConnected = false;
            System.out.println("Database disconnected. Connection ID: " + connectionId);
        }
    }

    /**
     * @return Status koneksi saat ini
     */
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * @return Pengidentifikasi koneksi unik
     */
    public String getConnectionId() {
        return connectionId;
    }
} 