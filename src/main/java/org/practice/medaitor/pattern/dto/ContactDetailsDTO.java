package org.practice.medaitor.pattern.dto;

public class ContactDetailsDTO {

    private String type;
    private String number;
    private String address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContactDetailsDTO{");
        sb.append("type='").append(type).append('\'');
        sb.append(", number='").append(number).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
