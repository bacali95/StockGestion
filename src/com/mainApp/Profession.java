package com.mainApp;

enum Profession {
    Etudiant, Enseignant;

    Profession() {
    }

    public String value() {
        return name();
    }

    public static Profession fromValue(String value) {
        return valueOf(value);
    }
}