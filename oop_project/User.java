package com.mycompany.oop_project; //wanxin

import java.util.Vector;


public class User {
    // category : 1 - Admin, 2 - Doctor, 3 - Patient
    protected int category, age;
    protected String username, password, name, address, gender, ic, phone;

    // Default Constructor
    public User() 
    {
        category = 0;
        age = 0;
        username = null;
        password = null;
        name = null;
        address = null;
        gender = null;
        ic = null; 
        phone = null;
    }

    // Constructor for details of user
    public User(String usn, String pswd, String n, String _ic, String _gender, int _age, String _phone, String adrs) {
        category = 0;
        username = usn;
        password = pswd;
        name = n;
        ic = _ic;
        gender = _gender;
        age = _age;
        phone = _phone;
        address = adrs;
    }

    public boolean authenticate(String usn, String pswd) {
        if ((username.equals(usn)) && (password.equals(pswd)))
            return true;
        else
            return false;
    }

    // Mutator
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    // Accessor
    public int getCategory() {
        return category;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getIc() {
        return ic;
    }
    
    public void checkAppointment(Vector <Appointment> appointList)  // Polymorphism
    {
        System.out.println("========================================================================");
        System.out.println("\t\t\t Appointment List");
        System.out.println("========================================================================");
    }

    // Display
    public void displayUser()       // Polymorphism
    {
        System.out.println("Username : " + getUsername());
        System.out.println("Password : " + getPassword());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Gender : " + getGender());
        System.out.println("IC : " + getIc());
        System.out.println("Phone : " + getPhone());
        System.out.println("Address : " + getAddress());
        System.out.println("Category : " + getCategory());
        System.out.println();
    }
}
