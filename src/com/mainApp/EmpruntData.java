package com.mainApp;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class EmpruntData {
    private final IntegerProperty ID;
    private final StringProperty borrowerID;
    private final StringProperty materialID;
    private final StringProperty matName;
    private final StringProperty dateEmprunt;
    private final StringProperty dateReturn;
    private final StringProperty type;
    private final StringProperty reference;
    private final IntegerProperty quantity;

    EmpruntData(Integer ID, String borrowerID, String materialID, String matName, String dateEmprunt, String dateReturn, String type, String reference, Integer quantity) {
        this.ID = new SimpleIntegerProperty(ID);
        this.borrowerID = new SimpleStringProperty(borrowerID);
        this.materialID = new SimpleStringProperty(materialID);
        this.matName = new SimpleStringProperty(matName);
        this.dateEmprunt = new SimpleStringProperty(dateEmprunt);
        this.dateReturn = new SimpleStringProperty(dateReturn);
        this.type = new SimpleStringProperty(type);
        this.reference = new SimpleStringProperty(reference);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    EmpruntData(){
        this.ID = new SimpleIntegerProperty();
        this.borrowerID = new SimpleStringProperty();
        this.materialID = new SimpleStringProperty();
        this.matName = new SimpleStringProperty();
        this.dateEmprunt = new SimpleStringProperty();
        this.dateReturn = new SimpleStringProperty();
        this.type= new SimpleStringProperty();
        this.reference= new SimpleStringProperty();
        this.quantity = new SimpleIntegerProperty();

    }

    public String getMatName() {
        return matName.get();
    }

    public StringProperty matNameProperty() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName.set(matName);
    }

    public int getID() {
        return ID.get();
    }

    public IntegerProperty IDProperty() {
        return ID;
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getBorrowerID() {
        return borrowerID.get();
    }

    public StringProperty borrowerIDProperty() {
        return borrowerID;
    }

    public void setBorrowerID(String borrowerID) {
        this.borrowerID.set(borrowerID);
    }

    public String getMaterialID() {
        return materialID.get();
    }

    public StringProperty materialIDProperty() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID.set(materialID);
    }

    public String getDateEmprunt() {
        return dateEmprunt.get();
    }

    public StringProperty dateEmpruntProperty() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt.set(dateEmprunt);
    }

    public String getDateReturn() {
        return dateReturn.get();
    }

    public StringProperty dateReturnProperty() {
        return dateReturn;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn.set(dateReturn);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
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

    public int getQuantity() {
        return quantity.get();
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }
}
