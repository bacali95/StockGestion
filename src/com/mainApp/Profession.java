package com.mainApp;

enum Profession {
    Étudiant, Enseignant;

    Profession() {
    }

    public String value() {
        return name();
    }

    public static Profession fromValue(String value) {
        return valueOf(value);
    }
}