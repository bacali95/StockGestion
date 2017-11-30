package com.mainApp;

enum MaterialsFilter {
    Tous, Identifiant, Nom, Type;

    MaterialsFilter() {
    }

    public String value() {
        return name();
    }

    public static MaterialsFilter fromValue(String value) {
        return valueOf(value);
    }
}