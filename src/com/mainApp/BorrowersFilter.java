package com.mainApp;

enum BorrowersFilter {
    Tous, Identifiant, Nom, Prénom, Email, Téléphone, Work;

    BorrowersFilter() {
    }

    public String value() {
        return name();
    }

    public static BorrowersFilter fromValue(String value) {
        return valueOf(value);
    }
}