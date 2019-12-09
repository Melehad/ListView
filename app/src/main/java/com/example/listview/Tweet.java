package com.example.listview;

public class Tweet {
    private int color;
    private String pseudo;

    public Tweet(int color, String pseudo) {
        this.color = color;
        this.pseudo = pseudo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
