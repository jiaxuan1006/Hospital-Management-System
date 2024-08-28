package com.mycompany.oop_project;

public class Medicine 
{
    private String medCode, medName, description;
    private int quantity;
    private double price;

    // Default constructor
    public Medicine() 
    {
        medCode = null;
        medName = null;
        description = null;
        quantity = 0;
        price = 0.0;
    }

    // Constructor overloading
    public Medicine(String medCode, String medName, String description, double price, int quantity)
    {
        this.medCode = medCode;
        this.medName = medName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public boolean checkMedCode(String code) 
    {
        return (medCode == code);
    }

    public void setMedCode(String code) 
    {
        medCode = code;
    }

    public void setMedName(String name) 
    {
        medName = name;
    }

    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getMedCode() 
    {
        return medCode;
    }

    public String getMedName() 
    {
        return medName;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public String getDescription() 
    {
        return description;
    }

    public void dispMedInfo() 
    {
        System.out.println(String.format("%-15s", getMedCode()) + String.format("%-15s", getMedName()) +
                String.format("%-25s", getDescription()) + String.format("%-10s", getQuantity()) +
                String.format("%-10.2f", getPrice()));
    }
}
