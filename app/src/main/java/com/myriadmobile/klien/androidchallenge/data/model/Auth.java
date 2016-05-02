package com.myriadmobile.klien.androidchallenge.data.model;

/**
 * Created by klien on 4/17/16.
 */
public class Auth {

    public static class Error {
        public String code;
        public String message;

        public Error(String message) { this.message = message; }
    }
}
