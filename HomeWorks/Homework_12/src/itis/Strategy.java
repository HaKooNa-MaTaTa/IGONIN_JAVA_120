package itis;

import java.io.IOException;

// Интерфейс, предназначенный для запуска выбранной стратегии
public interface Strategy {
    void run() throws IOException;
}
