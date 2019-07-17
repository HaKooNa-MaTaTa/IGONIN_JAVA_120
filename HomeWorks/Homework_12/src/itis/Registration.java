package itis;

import java.io.IOException;

// Выбор и запуск выбранной стратегии
public class Registration implements Context {
    private Strategy registration;

    public void setStrategy(Strategy registration) {
        this.registration = registration;
    }
    public void registration() throws IOException {
        //System.out.println("REGISTRATION");
        registration.run();
       // System.out.println("REGISTRATION END");
    }
}
