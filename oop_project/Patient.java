package com.mycompany.oop_project; //jiaxuan

import java.io.*;
import java.util.*;

public class Patient extends User {
    private double payment;
    private String report;
    private Appointment appointment;
    private Doctor doctor;
    private Vector<Medicine> medicineList;
    
    // Default Constructor
    public Patient() 
    {
        super();
        payment = 0.0;
        report = null;
        appointment = null;
        doctor = null;
        medicineList = new Vector<Medicine> ();
    }

    public Patient(String _username, String pswd, String _name, String _ic, String _gender, int _age,
            String _phone, String adrs) {
        super(_username, pswd, _name, _ic, _gender, _age, _phone, adrs);
        category = 4;
        payment = 0.0;
        report = null;
        appointment = null;
        doctor = null;
        medicineList = new Vector<Medicine>();
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    
    public void setReport(String desc)
    {
        report = desc;
    }

    public double getPayment() {
        return payment;
    }
    
    public String getReport()
    {
        return report;
    }

     public boolean bookAppointment(Doctor dr, Appointment appoint)
     {
        if(appoint.checkAvaibility(appoint.getDay(), appoint.getMonth(), appoint.getYear(), appoint.getHour(), appoint.getMinute(), dr))
        {
            appointment = appoint;
            doctor = dr;
            System.out.println("Your appointment has been successfully booked!");
            return true;
        }
        else
        {
            System.out.println("Your appointment is not successfully booked!");
            return false;
        }
     }
     
     // Check appointment function
    public void checkAppointment(Vector <Appointment> appointList) 
    {
        if(appointment != null)
        {
            System.out.println("Your appointment information is displayed below : ");
            System.out.println(String.format("%-12s", "Date") + String.format("%-6s", "Time") + String.format("%-25s", "Doctor"));
            System.out.println(String.format("%-2d", appointment.getDay()) + "/" + String.format("%-2d", appointment.getMonth())
                    + "/" + String.format("%-6d", appointment.getYear()) + String.format("%-2d", appointment.getHour()) + ":"
                    + String.format("%-2d", appointment.getMinute()) + " " + String.format("%-30s", appointment.getDoctor().getName()));
        }
        else
            System.out.println("You have not made any appointment yet!\n");
    }
    
     // passively invoked from doctor's prescribe function
     // not a service provided to patient
    public void addMedicine(Medicine med, int quantity)
    {
        // Create a new object to copy the medicine info to add into the patient's medicine vector
        // To avoid the information for the medicine changed when updating quantity
        Medicine patientMed = new Medicine (med.getMedCode(),med.getMedName(), med.getDescription(), med.getPrice(), quantity);
        medicineList.add(patientMed);
        payment = payment + (med.getPrice()*quantity);
    }
    
    public void viewReport() 
    {
        if(report != null)
        {
            System.out.println("Below is your medical report recently : ");
            System.out.println("Doctor : " + doctor.getName());
            System.out.println("Date : " + appointment.getDay() + "/" + appointment.getMonth() + "/" + appointment.getYear());
            System.out.println("Remarks : " + report);
        }
        else
            System.out.println("You have not received any repoort yet! \n");
    }

    public void displayUser() // polymorphism
    {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
    }

}
