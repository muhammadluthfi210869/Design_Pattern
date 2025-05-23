package behavioral.observer;

/**
 * Kelas WeatherDisplay
 * 
 * Ini adalah observer konkret yang menampilkan informasi cuaca.
 * Mengimplementasikan interface Observer dan mempertahankan
 * state terakhir yang diterima.
 */
public class WeatherDisplay implements Observer {
    // ID unik untuk display
    private final String id;
    // Update terakhir yang diterima
    private String lastUpdate;

    /**
     * Konstruktor untuk WeatherDisplay
     * 
     * @param id ID unik untuk display
     */
    public WeatherDisplay(String id) {
        this.id = id;
    }

    /**
     * Memperbarui display dengan data cuaca baru
     * 
     * @param data Data cuaca baru
     */
    @Override
    public void update(String data) {
        this.lastUpdate = data;
        System.out.println("Display " + id + " menerima update: " + data);
    }

    /**
     * Mendapatkan ID display
     * 
     * @return ID display
     */
    @Override
    public String getObserverId() {
        return id;
    }

    /**
     * Mendapatkan update terakhir
     * 
     * @return Update terakhir yang diterima
     */
    public String getLastUpdate() {
        return lastUpdate;
    }
} 