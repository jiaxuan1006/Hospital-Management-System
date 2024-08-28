package com.mycompany.oop_project; //jiaying

import java.util.*;

public class Admin extends User {
    private String adminID;

    public Admin(String usn, String pswd, String n, String _ic, String _id, String _gender, int _age, String _phone, String adrs) 
    {
        super(usn, pswd, n, _ic, _gender, _age, _phone, adrs);
        adminID = _id;
        category = 1;
    }

    public Admin(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }
    
    public void setAdminId(String id) 
    {
        adminID = id;
    }

    public String getAdminId() 
    {
        return adminID;
    }

    public Doctor addDoctor(String usn, String pswd, String n, String _ic, String _id, String _gender, int _age,
            String _phone, String adrs, String specialty, String qualification) 
    {
        Doctor dr = new Doctor(usn, pswd, n, _ic, _id, _gender, _age, _phone, adrs, specialty, qualification);
        return dr;
    }
    
    public void deleteDoctor(Vector<Doctor> drList, int i) 
    {
        drList.remove(i);
    }

    public void viewDoctor(Vector<Doctor> drList, int i) 
    {
        System.out.println(String.format("%-7s", drList.get(i).getDrId()) + String.format("%-35s", drList.get(i).getName()) + 
                            String.format("%-5d", drList.get(i).getAge()) + String.format("%-10s", drList.get(i).getGender()) + 
                            String.format("%-15s", drList.get(i).getIc()) + String.format("%-15s", drList.get(i).getPhone()) + 
                            String.format("%-45s", drList.get(i).getAddress()) + String.format("%-15s", drList.get(i).getSpecialty()) + 
                            String.format("%-25s", drList.get(i).getQualification()));
    }

    public Medicine addMedicine(String medCode, String medName, String medDesc, double medPrice, int medQuantity) 
    {
        Medicine med = new Medicine(medCode, medName, medDesc, medPrice, medQuantity);
        return med;
    }

    public void deleteMedicine(Vector<Medicine> medList, int i) 
    {
        medList.remove(i);
    }

    public void viewMedicine(Vector<Medicine> medList, int i) 
    {
        medList.get(i).dispMedInfo();
    }

    public Admin addAdmin(String usn, String pswd, String n, String _ic, String _id, String _gender, int _age,
            String _phone, String adrs) {
        Admin admin = new Admin(usn, pswd, n, _ic, _id, _gender, _age, _phone, adrs);
        return admin;
    }

    public void deleteAdmin(Vector<Admin> adminList, int i) 
    {
        adminList.remove(i);
    }

    public void viewAdmin(Vector<Admin> adminList, int i) 
    {
        System.out.println(String.format("%-10s", adminList.get(i).getAdminId()) + String.format("%-35s", adminList.get(i).getName()) + 
                            String.format("%-5d", adminList.get(i).getAge()) + String.format("%-10s", adminList.get(i).getGender()) + 
                            String.format("%-15s", adminList.get(i).getIc()) + String.format("%-15s", adminList.get(i).getPhone()) + 
                            String.format("%-45s", adminList.get(i).getAddress()));
    }
    
    // Check appointment function
    public void checkAppointment(Vector <Appointment> appointList) 
    {
        if(appointList != null)
        {
            System.out.println("========================================================================");
            System.out.println("\t\t\t Appointment List");
            System.out.println("========================================================================");
            System.out.println(String.format("%-4s", "No") + String.format("%-12s", "Date") + String.format("%-7s", "Time") + 
                                String.format("%-25s", "Patient") + String.format("%-25s", "Doctor"));
            for (int i = 0; i<appointList.size(); i++)
            {
                System.out.print(String.format("%-4d", (i+1)));
                appointList.get(i).dispAppointment();
            }
        }
        else
            System.out.println("The system did not receive any appointment booked from patients!\n");        
    }
    
    public void displayUser() 
    {
        System.out.println("Admin ID : " + getAdminId());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Gender : " + getGender());
        System.out.println("IC : " + getIc());
        System.out.println("Phone : " + getPhone());
        System.out.println("Address : " + getAddress());
        System.out.println();
    }
}
