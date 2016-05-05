package com.myriadmobile.klien.androidchallenge.data.model;

public class Kingdom {

    public int id;
    public String name;
    public String image;

    public Kingdom() {
    }

    public static class Error {
        public String message;

        public Error(String message) {
            this.message = message;
        }
    }
}
