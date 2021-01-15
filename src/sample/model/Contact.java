package sample.model;

import java.time.LocalDate;

public class Contact {

    private String firstName;
    private String lastName;
    private String phoneNum;
    private LocalDate dateAssigned;

    public Contact(String firstName, String lastName, String phoneNum , LocalDate dateAssigned) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.dateAssigned = dateAssigned;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getPhoneNum() {

        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {

        this.phoneNum = phoneNum;
    }

    public LocalDate getDateAssigned() {

        return dateAssigned;
    }

    public void setDateAssigned(LocalDate dateAssigned) {

        this.dateAssigned = dateAssigned;
    }

    public String toString() {

        return firstName + " " + lastName;
    }
}
