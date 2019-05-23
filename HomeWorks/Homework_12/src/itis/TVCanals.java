package itis;

public class TVCanals {
    static private String[] tvcanals = {"Pervonah","EFIR","TNV","Hommy","TatarstanSuperGood"};

    static public String[] getListCanals() {
        return tvcanals;
    }
    static public String[] getListPrograms() {
        return TVPrograms.getProgram();
    }
}
