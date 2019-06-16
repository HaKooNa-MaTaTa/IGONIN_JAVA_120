package itis;

import java.util.Arrays;

public class User {
    private Channel[] channels = new Channel[10];
    private int count = 0;
    private String name;
    private String nickname;
    private String password;
    private int id;

    public String getName() {
        return name;
    }
    public String getNickname() {
        return nickname;
    }
    public String getPassword() {
        return password;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setChannels(String channel) {
        showChannels();
        if (count < 10) {
            channels[count] = new Channel();
            channels[count].setName(channel);
            count++;
        } else {
            System.out.println("You have a maximum channels");
        }
    }
    public String getChannels() {
        return Arrays.toString(channels);
    }
    public void showChannels() {
        for (int i = 0; i < ProgramCanalsList.canalsList.length; i++) {
            System.out.println((i + 1) + ProgramCanalsList.canalsList[i]);
        }
    }
}
