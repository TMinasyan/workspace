package com.bdg.bank;

public enum Country {
    AM("Armenia", "010"),
    UK("United Kingdom", "051");
    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    @Override
    public String toString() {
        return this.countryName + ", " + this.numericCode;
    }
}
