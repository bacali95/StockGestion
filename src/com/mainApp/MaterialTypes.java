package com.mainApp;

enum MaterialTypes {
    Composant, Matériel;

    MaterialTypes() {
    }

    public String value() {
        return name();
    }

    public static MaterialTypes fromValue(String value) {
        return valueOf(value);
    }
}
