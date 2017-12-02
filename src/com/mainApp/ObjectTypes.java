package com.mainApp;

public enum ObjectTypes {
    Matériels, Emprunteurs, Emprunts;

    ObjectTypes() {
    }

    public String value() {
        return name();
    }

    public static ObjectTypes fromValue(String value) {
        return valueOf(value);
    }
}
