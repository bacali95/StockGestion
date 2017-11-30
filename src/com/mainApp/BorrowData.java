package com.mainApp;

import javafx.beans.property.*;

public class BorrowData {
    private final StringProperty IDBorrower;
    private final StringProperty IDMatrial;
    private final LongProperty dateOfBorrow;
    private final IntegerProperty quantityBorrwed;

    public BorrowData(String IDBorrower, String IDMatrial, Long dateOfBorrow, Integer quantityBorrwed) {
        this.IDBorrower = new SimpleStringProperty(IDBorrower);
        this.IDMatrial = new SimpleStringProperty(IDMatrial);
        this.dateOfBorrow = new SimpleLongProperty(dateOfBorrow);
        this.quantityBorrwed = new SimpleIntegerProperty(quantityBorrwed);
    }

    public String getIDBorrower() {
        return IDBorrower.get();
    }

    public StringProperty IDBorrowerProperty() {
        return IDBorrower;
    }

    public void setIDBorrower(String IDBorrower) {
        this.IDBorrower.set(IDBorrower);
    }

    public String getIDMatrial() {
        return IDMatrial.get();
    }

    public StringProperty IDMatrialProperty() {
        return IDMatrial;
    }

    public void setIDMatrial(String IDMatrial) {
        this.IDMatrial.set(IDMatrial);
    }

    public long getDateOfBorrow() {
        return dateOfBorrow.get();
    }

    public LongProperty dateOfBorrowProperty() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(long dateOfBorrow) {
        this.dateOfBorrow.set(dateOfBorrow);
    }

    public int getQuantityBorrwed() {
        return quantityBorrwed.get();
    }

    public IntegerProperty quantityBorrwedProperty() {
        return quantityBorrwed;
    }

    public void setQuantityBorrwed(int quantityBorrwed) {
        this.quantityBorrwed.set(quantityBorrwed);
    }
}
