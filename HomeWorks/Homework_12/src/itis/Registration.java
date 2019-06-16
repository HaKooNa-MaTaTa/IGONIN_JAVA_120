package itis;
// Выбор и запуск выбранной стратегии
public class Registration implements Context {
    private Strategy registration;

    public void setStrategy(Strategy registration) {
        this.registration = registration;
    }
    public void registration() {
        //System.out.println("REGISTRATION");
        registration.run();
       // System.out.println("REGISTRATION END");
    }
}
