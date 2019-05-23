package itis;


public class Television {
    private Main choice;
    private TVCanals tvCanals;
    static private boolean statusTV;
    static private String statusPowerTV = "OFF";


    static public void setStatusTV(String choice) {
        if (choice.equals("ON")) {
            statusTV = true;
            statusPowerTV = "ON";
        } else {
            statusTV = false;
            statusPowerTV = "OFF";
        }
    }

    static public String getStatusTV() {
        return statusPowerTV;
    }

    static public void getListCanalsForWatch() {
       for (int i = 0; i < TVCanals.getListCanals().length; i++) {
           System.out.println(i + ". " + TVCanals.getListCanals()[i]);
       }
    }
}
