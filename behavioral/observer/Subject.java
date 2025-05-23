package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementasi Pola Observer
 * - Subjek yang mempertahankan daftar observer
 * - Memberitahu observer ketika state berubah
 */
public class Subject {
    // Daftar observer yang akan diberitahu
    private List<Observer> observers = new ArrayList<>();
    // State saat ini
    private String state;

    /**
     * Mengubah state dan memberitahu semua observer
     * 
     * @param state State baru
     */
    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    /**
     * Menambahkan observer baru
     * 
     * @param o Observer yang akan ditambahkan
     */
    public void addObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer " + o.getObserverId() + " ditambahkan");
    }

    /**
     * Menghapus observer
     * 
     * @param o Observer yang akan dihapus
     */
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer " + o.getObserverId() + " dihapus");
    }

    /**
     * Memberitahu semua observer tentang perubahan state
     */
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
} 