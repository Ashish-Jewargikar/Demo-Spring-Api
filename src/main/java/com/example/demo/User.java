package com.example.demo;
public class User {
    private String name;
    private int phoneno;
    private String address;
    private int id;

    public User() {
    }

    public User(String name, int phoneno, String address, int id) {
        this.name = name;
        this.phoneno = phoneno;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
       
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    

}
