package com.mainApp;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MaterialData {

    private final StringProperty ID;
    private final StringProperty name;
    private final IntegerProperty initQuantity;
    private final IntegerProperty availableQuantity;
    private final StringProperty description;
    private final StringProperty reference;
    private final StringProperty type;

    MaterialData(String ID, String name, Integer initQuantity, Integer availableQuantity, String description, String reference, String type) {
        this.ID = new SimpleStringProperty(ID);
        this.name = new SimpleStringProperty(name);
        this.initQuantity = new SimpleIntegerProperty(initQuantity);
        this.availableQuantity = new SimpleIntegerProperty(availableQuantity);
        this.description = new SimpleStringProperty(description);
        this.reference = new SimpleStringProperty(reference);
        this.type = new SimpleStringProperty(type);
    }

    public int getAvailableQuantity() {
        return availableQuantity.get();
    }

    public IntegerProperty availableQuantityProperty() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity.set(availableQuantity);
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

    public String getID() {
        return ID.get();
    }

    public StringProperty IDProperty() {
        return ID;
    }

    public void setID(String ID) {
        this.ID.set(ID);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getInitQuantity() {
        return initQuantity.get();
    }

    public IntegerProperty initQuantityProperty() {
        return initQuantity;
    }

    public void setInitQuantity(int initQuantity) {
        this.initQuantity.set(initQuantity);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
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
}
