package com.example.mjurewicz.bebop;

/**
 * Created by mjurewicz on 8/11/15.
 */
public class Data {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private static final Data d = new Data();

    public static Data getData() { return d; }
}
