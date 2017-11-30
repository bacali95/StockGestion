package com.mainApp;

import javafx.beans.property.*;

public class BorrowerData {

    private final StringProperty ID;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty email;
    private final StringProperty phoneNumber;
    private final StringProperty work;
    private final IntegerProperty totalBorrowedMaterial;
    private final StringProperty reference;

    public BorrowerData(String ID, String firstName, String lastName, String email, String phoneNumber, String work, Integer totalBorrowedMaterial, String reference) {
        this.ID = new SimpleStringProperty(ID);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.work = new SimpleStringProperty(work);
        this.totalBorrowedMaterial = new SimpleIntegerProperty(totalBorrowedMaterial);
        this.reference = new SimpleStringProperty(reference);
    }

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public String getPhoneNumber() {
        return phoneNumber.get();
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getWork() {
        return work.get();
    }

    public StringProperty workProperty() {
        return work;
    }

    public void setWork(String work) {
        this.work.set(work);
    }

    public int getTotalBorrowedMaterial() {
        return totalBorrowedMaterial.get();
    }

    public IntegerProperty totalBorrowedMaterialProperty() {
        return totalBorrowedMaterial;
    }

    public void setTotalBorrowedMaterial(int totalBorrowedMaterial) {
        this.totalBorrowedMaterial.set(totalBorrowedMaterial);
    }

    public String getReference() {
        return reference.get();
    }

    public StringProperty referenceProperty() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference.set(reference);
    }
}

enum job {
    Étudiant, Enseignant;

    private job() {
    }

    public String value() {
        return name();
    }

    public static job fromValue(String value) {
        return valueOf(value);
    }
}

enum borrowersFilterBy {
    Tous, Identifiant, Nom, Prénom, Email, Téléphone, Work;

    private borrowersFilterBy() {
    }

    public String value() {
        return name();
    }

    public static borrowersFilterBy fromValue(String value) {
        return valueOf(value);
    }
}