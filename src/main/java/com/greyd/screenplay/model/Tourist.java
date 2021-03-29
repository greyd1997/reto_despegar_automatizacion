package com.greyd.screenplay.model;

public class Tourist {
    private String name;
    private String lastName;
    private String idNumber;
    private String address;
    private String email;
    private String phoneArea;
    private String phoneNumber;

    public Tourist(String name, String lastName, String idNumber, String address, String email,String phoneArea,String phoneNumber)
    {
        this.name=name;
        this.lastName=lastName;
        this.idNumber=idNumber;
        this.address=address;
        this.email=email;
        this.phoneArea=phoneArea;
        this.phoneNumber=phoneNumber;

    }
    public String getName()
    {
        return name;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getIdNumber()
    {
        return idNumber;
    }
    public String getAddress()
    {
        return address;
    }
    public String getEmail()
    {
        return email;
    }
    public String getPhoneArea()
    {
        return phoneArea;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
