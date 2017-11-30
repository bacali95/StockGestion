package com.mainApp;

enum EmpruntTypes {
    PFA, PFE, PS, CLUB, PP, TP;

    EmpruntTypes() {
    }

    public String value() {
        return name();
    }

    public static EmpruntTypes fromValue(String value) {
        return valueOf(value);
    }
}