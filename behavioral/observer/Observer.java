package behavioral.observer;

/**
 * Interface Observer
 * 
 * Ini adalah interface observer dalam pola Observer.
 * Mendefinisikan metode update yang akan dipanggil
 * ketika subjek berubah.
 */
public interface Observer {
    /**
     * Memperbarui observer dengan data baru
     * 
     * @param data Data baru dari subjek
     */
    void update(String data);

    /**
     * Mendapatkan ID unik dari observer
     * 
     * @return ID observer
     */
    String getObserverId();
} 