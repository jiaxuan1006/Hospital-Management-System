package com.mycompany.oop_project;

import java.util.*;
import java.io.*;

public class Doctor extends User {
    private String specialty, qualification, drId;
    private Vector <Appointment> appointmentList;
    private Vector <Patient> patientList;

    // Default Constructor
    public Doctor()
    {
        super();
        specialty = null;
        qualification = null;
        appointmentList = new Vector<Appointment>();
        patientList = new Vector<Patient>();
    }

    // Constructor overloading
    public Doctor(String usn, String pswd, String n, String _ic, String _id, String _gender, int _age, String _phone,
            String adrs, String specialty, String qualification) 
    {
        super(usn, pswd, n, _ic, _gender, _age, _phone, adrs);
        category = 2;
        drId = _id;
        this.specialty = specialty;
        this.qualification = qualification;
        appointmentList = new Vector<Appointment>();
        patientList = new Vector<Patient>();
    }

    // Constructor overloading
    public Doctor(String specialty, String qualification) {
        this.specialty = specialty;
        this.qualification = qualification;
    }

    // Mutator
    public void setDrId(String id) {
        drId = id;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Accessor
    public String getDrId() {
        return drId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getQualification() {
        return qualification;
    }

    public void displayUser() 
    {
        System.out.println("Doctor ID : " + getDrId());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Gender : " + getGender());
        System.out.println("IC : " + getIc());
        System.out.println("Phone : " + getPhone());
        System.out.println("Address : " + getAddress());
        System.out.println("Specialty : " + getSpecialty());
        System.out.println("Qualification : " + getQualification());
        System.out.println();
    }

     // Prescribe medicine function
     public void prescribe(Medicine med, Patient p, int quantity)
     {
        p.addMedicine(med, quantity);
     }
     
     public void makeReport(String desc, Patient p)
     {
         p.setReport(desc);
     }
     
     // passively called from patient's bookAppointment function
     // not a service provided to doctor
     public void addAppointment(Appointment appointment)
     {
         patientList.add(appointment.getPatient());
         appointmentList.add(appointment);
     }

    // Check appointment function
    public void checkAppointment(Vector <Appointment> appointList) 
    {
        if(appointmentList != null)
        {
            System.out.println("========================================================================");
            System.out.println("\t\t\t Appointment List");
            System.out.println("========================================================================");
            System.out.println(String.format("%-12s", "Date") + String.format("%-8s", "Time") + String.format("%-25s", "Patient"));
            for (int i = 0; i<appointmentList.size(); i++)
            {
                System.out.println(String.format("%-2d", appointmentList.get(i).getDay()) + "/" + 
                        String.format("%-2d", appointmentList.get(i).getMonth()) + "/" + 
                        String.format("%-6d", appointmentList.get(i).getYear()) + 
                        String.format("%-2d", appointmentList.get(i).getHour()) + ":" +
                        String.format("%-5d", appointmentList.get(i).getMinute()) + 
                        String.format("%-25s", appointmentList.get(i).getPatient().getName()));
            }
        }
        else
            System.out.println("You do not have any appoinment from patients...\n");   
    }
    
    public Vector<Appointment> getDrAppointment()
    {
        return appointmentList;
    }
    
    public int getPatientListSize()
    {
        return patientList.size();
    }
    
    // View patient list function
    public void viewPatientList() 
    {
        if(patientList != null)
        {
            System.out.println(String.format("%-3s", "No") + String.format("%-30s", "Name") + 
                                String.format("%-8s", "Gender") + String.format("%-4s", "Age"));
            for (int i = 0; i<patientList.size(); i++) 
            {
                System.out.println(String.format("%-3s", (i+1)) + String.format("%-30s", patientList.get(i).getName()) +
                    String.format("%-8s", patientList.get(i).getGender()) + String.format("%-4s", patientList.get(i).getAge()));
            }
        }
        
    }
}
