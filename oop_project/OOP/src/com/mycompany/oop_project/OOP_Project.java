package com.mycompany.oop_project;

import java.io.*;
import java.util.*;

public class OOP_Project {
    public static Scanner choice = new Scanner(System.in);

    public static int menu() // Main menu of the system
    {
        int x;
        System.out.println("========================================================================");
        System.out.println("\t\tWelcome to Hospital Coven System");
        System.out.println("========================================================================");
        System.out.println("Please choose which user you are. [1-4]");
        System.out.println("1 - Admin");
        System.out.println("2 - Doctor");
        System.out.println("3 - Patient");
        System.out.println("4 - Exit");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int adminMenu() { // Admin Main Menu
        int x;
        System.out.println("Please choose what you want to do below: [1-4]");
        System.out.println("1 - Manage Doctor");
        System.out.println("2 - Manage Medicine");
        System.out.println("3 - Manage Admin");
        System.out.println("4 - Check Appointment");
        System.out.println("5 - Display System Summary");
        System.out.println("6 - View Your Profile");
        System.out.println("7 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int adminSubMenu1() {
        int x;
        System.out.println("Please choose what you want to do below: [1-5]");
        System.out.println("1 - Add Doctor");
        System.out.println("2 - Delete Doctor");
        System.out.println("3 - Update Doctor");
        System.out.println("4 - View Doctor List");
        System.out.println("5 - Back");
        System.out.println("6 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int adminSubMenu2() {
        int x;
        System.out.println("Please choose what you want to do below: [1-5]");
        System.out.println("1 - Add Medicine");
        System.out.println("2 - Delete Medicine");
        System.out.println("3 - Update Medicine");
        System.out.println("4 - View Medicine List");
        System.out.println("5 - Back");
        System.out.println("6 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int adminSubMenu3() {
        int x;
        System.out.println("Please choose what you want to do below: [1-5]");
        System.out.println("1 - Add Admin");
        System.out.println("2 - Delete Admin");
        System.out.println("3 - Update Admin");
        System.out.println("4 - View Admin List");
        System.out.println("5 - Back");
        System.out.println("6 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int doctorMenu() {
        int x;
        System.out.println("Please choose what you want to do below: [1-6]");
        System.out.println("1 - Check Appointment");
        System.out.println("2 - View Patient List");
        System.out.println("3 - Make Medical Report");
        System.out.println("4 - Prescribe Medicine");
        System.out.println("5 - View Your Profile");
        System.out.println("6 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    public static int patientMenu() {
        int x;
        System.out.println("Please choose what you want to do below: [1-6]");
        System.out.println("1 - View Your Profile");
        System.out.println("2 - Check Appointment");
        System.out.println("3 - Book Appointment");
        System.out.println("4 - Make Payment");
        System.out.println("5 - View Medical Report");
        System.out.println("6 - Back");
        System.out.println("7 - Return to Main Menu");
        System.out.print("Choice - ");
        x = choice.nextInt();
        choice.nextLine();
        return x;
    }

    // Overloaded Methods - Different users' login status display
    public static void dispLogin(Vector<Admin> adminVector, int index) {
        System.out.println("========================================================================");
        System.out.println("\t\tWelcome to Hospital Coven System");
        System.out.println("========================================================================");
        System.out.println("Login successfully! Welcome, Admin " + adminVector.get(index).getName() + "\n");
    }

    public static void dispLogin(int index, Vector<Doctor> drVector) {
        System.out.println("========================================================================");
        System.out.println("\t\tWelcome to Hospital Coven System");
        System.out.println("========================================================================");
        System.out.println("Login successfully! Welcome, Doctor " + drVector.get(index).getName() + "\n");
    }

    public static void dispLogin(Patient patient) {
        System.out.println("========================================================================");
        System.out.println("\t\tWelcome to Hospital Coven System");
        System.out.println("========================================================================");
        System.out.println("Login successfully! Welcome, Patient " + patient.getName() + "\n");
    }

    public static void main(String[] args) {
        boolean loop1 = true; // The main menu loop
        int x; // The choice (input) selected by the users
        String username, pass; // Users' username and password

        // Vectors that hold the users, appointments and medicine.
        Vector<Admin> adminVector = new Vector<Admin>();
        Vector<Appointment> appointmentVector = new Vector<Appointment>();
        Vector<Doctor> doctorVector = new Vector<Doctor>();
        Vector<Medicine> medicineVector = new Vector<Medicine>();
        Vector<Patient> patientVector = new Vector<Patient>();

        // Object instatiated when the program starts.
        Admin admin1 = new Admin("wanxin", "qwer123", "Ang Wan Xin", "001004070132", "ADMIN0001", "Female", 22,
                "60175844078", "12A, Lrg Seri Impian 4, Tmn Seri Impian, 14000 BM, Penang");
        Admin admin2 = new Admin("leeren", "abc123", "Lee Qing Ren", "000725040350", "ADMIN0002", "Female", 22,
                "601110671640", "3840 Taman Indah 73000 Tampin, Negeri Sembilan");

        Doctor doctor1 = new Doctor("jennifer", "qwer123", "Jennifer Law", "001004070132", "DR0001", "Female", 22,
                "60175844078", "12A, Lrg Seri Impian 4, Tmn Seri Impian, 14000 BM, Penang", "Psychology",
                "Master in Medicine");
        Doctor doctor2 = new Doctor("Ashley", "h7783718", "Ashley Feng", "690421040526", "DR0002", "Female", 22,
                "60123456789", "12A, Lrg Seri Impian 4, Tmn Seri Impian, 14000 BM, Penang", "Surgery",
                "Master in Surgery");
        Patient patient1 = new Patient("Ali", "AliBaba", "Ali Baba", "940506065077", "Male", 33,
                "60125465889", "5656 Taman Kilang 72310 Klang Kuala Lumpur");
        Medicine medicine1 = new Medicine("MED001", "Aspirin", "To relieve pain", 35.50, 35);

        // Add the objects created into their corresponding vectors.
        adminVector.add(admin1);
        adminVector.add(admin2);
        doctorVector.add(doctor1);
        doctorVector.add(doctor2);
        patientVector.add(patient1);
        medicineVector.add(medicine1);

        // User main menu loop starts
        while (loop1) {
            int index = -1; // The index that indicates the specific user in the vector. -1 means user is
                            // not found in the vector.
            boolean login = false; // Login status
            x = menu(); // Invoke menu() to ask which category the user is
            System.out.println("\n\n\n\n\n");

            switch (x) // Switch to corresponding case according to the input entered by the users
            {
                case 1: // User = Admin
                    System.out.println("========================================================================");
                    System.out.println("\t\tWelcome to Hospital Coven System");
                    System.out.println("========================================================================");
                    // Ask the user to input username and password to login
                    System.out.println("Please input your username and password below: ");
                    System.out.print("Username : ");
                    username = choice.nextLine();
                    System.out.print("Password : ");
                    pass = choice.nextLine();
                    System.out.println("\n\n\n\n\n");

                    // Authenticate the user by comparing the entered username and password with the
                    // attributes stored in the vector.
                    // It will return the searching result to "login", whereby indicating the status
                    // of login.
                    // Once it is found in the vector, "login" is set to true and assign "index" to
                    // current indexing counter, "i" and the loop terminates.
                    for (int i = 0; i < adminVector.size(); i++) {
                        login = adminVector.get(i).authenticate(username, pass);
                        if (login) {
                            index = i;
                            break;
                        }
                    }

                    // Check the login status. Only if it is true, then the admin can use the
                    // services provided inside.
                    if (login) {
                        boolean loop2 = true;
                        // Start Admin Menu
                        while (loop2) {
                            boolean loop3 = true;
                            dispLogin(adminVector, index);

                            x = adminMenu();

                            System.out.println("\n\n\n\n\n");
                            // Start Admin Submenu
                            switch (x) {
                                case 1:
                                    while (loop3) {
                                        dispLogin(adminVector, index);
                                        x = adminSubMenu1();
                                        System.out.println("\n\n\n\n\n");

                                        switch (x) {
                                            case 1: // Add Doctor
                                                String n, usn, pswd, adrs, specialty, qualification, _gender, _ic, _id,
                                                        _phone;
                                                int _age;
                                                // Show the login status of admin (overloading methods)
                                                dispLogin(adminVector, index);
                                                Scanner input = new Scanner(System.in);
                                                // Ask the user to input the doctor's information
                                                System.out.println(
                                                        "Enter the new doctor with filling out the following fields : ");
                                                System.out.print("Username: ");
                                                usn = input.nextLine();
                                                System.out.print("Password: ");
                                                pswd = input.nextLine();
                                                System.out.print("Name: ");
                                                n = input.nextLine();
                                                System.out.print("IC: ");
                                                _ic = input.nextLine();
                                                System.out.print("Dr ID: ");
                                                _id = input.nextLine();
                                                System.out.print("Gender: ");
                                                _gender = input.nextLine();
                                                System.out.print("Age: ");
                                                _age = input.nextInt();
                                                input.nextLine();
                                                System.out.print("Phone: ");
                                                _phone = input.nextLine();
                                                System.out.print("Address: ");
                                                adrs = input.nextLine();
                                                System.out.print("Specialty: ");
                                                specialty = input.nextLine();
                                                System.out.print("Qualification: ");
                                                qualification = input.nextLine();

                                                // Add the doctor object instatiated into doctorVector
                                                doctorVector.add(adminVector.get(index).addDoctor(usn, pswd, n, _ic,
                                                        _id, _gender, _age, _phone, adrs, specialty, qualification));
                                                System.out.println("You have successfully add a Doctor!");
                                                break;

                                            case 2: // Delete Doctor
                                                // Show the login status of admin (overloading methods)
                                                dispLogin(adminVector, index);
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Doctor List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-7s", "Dr ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address") +
                                                        String.format("%-15s", "Specialty")
                                                        + String.format("%-25s", "Qualification"));
                                                for (int i = 0; i < doctorVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewDoctor(doctorVector, i);
                                                }
                                                System.out.print("Which Doctor to delete?\n Choice : ");
                                                Scanner in = new Scanner(System.in);
                                                int c;
                                                c = in.nextInt();
                                                in.nextLine();
                                                adminVector.get(index).deleteDoctor(doctorVector, c - 1);
                                                System.out.println("You have successfully delete the Doctor!");
                                                break;

                                            case 3: // Update Doctor
                                                // Show the login status of admin (overloading methods)
                                                dispLogin(adminVector, index);
                                                // Show the doctor list
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Doctor List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-7s", "Dr ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address") +
                                                        String.format("%-15s", "Specialty")
                                                        + String.format("%-25s", "Qualification"));
                                                for (int i = 0; i < doctorVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewDoctor(doctorVector, i);
                                                }
                                                System.out.print("Which Doctor to update?\n Choice : ");
                                                int z;
                                                z = choice.nextInt();
                                                choice.nextLine();

                                                System.out.println("Enter the information in the following fields : ");
                                                System.out.print("Username: ");
                                                doctorVector.get(z - 1).setUsername(choice.nextLine());
                                                System.out.print("Password: ");
                                                doctorVector.get(z - 1).setPassword(choice.nextLine());
                                                System.out.print("Name: ");
                                                doctorVector.get(z - 1).setName(choice.nextLine());
                                                System.out.print("IC: ");
                                                doctorVector.get(z - 1).setIc(choice.nextLine());
                                                System.out.print("DrID: ");
                                                doctorVector.get(z - 1).setDrId(choice.nextLine());
                                                System.out.print("Gender: ");
                                                doctorVector.get(z - 1).setGender(choice.nextLine());
                                                System.out.print("Age: ");
                                                doctorVector.get(z - 1).setAge(choice.nextInt());
                                                System.out.print("Phone: ");
                                                choice.nextLine();
                                                doctorVector.get(z - 1).setPhone(choice.nextLine());
                                                System.out.print("Address: ");
                                                doctorVector.get(z - 1).setAddress(choice.nextLine());
                                                System.out.print("Specialty: ");
                                                doctorVector.get(z - 1).setSpecialty(choice.nextLine());
                                                System.out.print("Qualification: ");
                                                doctorVector.get(z - 1).setQualification(choice.nextLine());

                                                System.out.println("You have successfully update the Doctor!");
                                                break;

                                            case 4: // View Doctor
                                                // Show the login status of admin
                                                dispLogin(adminVector, index);
                                                // Show the doctor list
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Doctor List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-7s", "Dr ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address") +
                                                        String.format("%-15s", "Specialty")
                                                        + String.format("%-25s", "Qualification"));
                                                for (int i = 0; i < doctorVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewDoctor(doctorVector, i);
                                                }
                                                break;

                                            case 5: // Back
                                                loop3 = false;
                                                break;

                                            case 6: // Return to Main Menu
                                                loop3 = false;
                                                loop2 = false;
                                                break;

                                            default: // Invalid input
                                                break;
                                        }
                                    }

                                    break;

                                case 2: // Manage Medicine
                                    while (loop3) {
                                        dispLogin(adminVector, index);
                                        x = adminSubMenu2();
                                        System.out.println("\n\n\n\n\n");

                                        switch (x) {
                                            case 1: // Add medicine
                                                String medCode, medName, medDesc;
                                                int medQuantity;
                                                double medPrice;

                                                Scanner input = new Scanner(System.in);
                                                System.out.println("Enter the new medicine in the following fields : ");
                                                System.out.print("Medicine Code: ");
                                                medCode = input.nextLine();
                                                System.out.print("Medicine Name: ");
                                                medName = input.nextLine();
                                                System.out.print("Description: ");
                                                medDesc = input.nextLine();
                                                System.out.print("Quantity: ");
                                                medQuantity = input.nextInt();
                                                System.out.print("Price: RM");
                                                medPrice = input.nextDouble();
                                                input.nextLine();

                                                medicineVector.add(adminVector.get(index).addMedicine(medCode, medName,
                                                        medDesc, medPrice, medQuantity));
                                                System.out.println("You have successfully add a medicine!");
                                                break;

                                            case 2: // Delete medicine
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Medicine List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-15s", "Medicine Code") +
                                                        String.format("%-15s", "Medicine Name")
                                                        + String.format("%-25s", "Description") +
                                                        String.format("%-10s", "Quantity")
                                                        + String.format("%-10s", "Price(RM)"));
                                                for (int i = 0; i < medicineVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewMedicine(medicineVector, i);
                                                }
                                                System.out.print("Which medicine to delete?\n Choice : ");
                                                Scanner in = new Scanner(System.in);
                                                int c;
                                                c = in.nextInt();
                                                in.nextLine();

                                                adminVector.get(index).deleteMedicine(medicineVector, c - 1);
                                                System.out.println("You have successfully delete the medicine!");
                                                break;

                                            case 3: // Update medicine
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Medicine List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-15s", "Medicine Code") +
                                                        String.format("%-15s", "Medicine Name")
                                                        + String.format("%-25s", "Description") +
                                                        String.format("%-10s", "Quantity")
                                                        + String.format("%-10s", "Price(RM)"));
                                                for (int i = 0; i < medicineVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewMedicine(medicineVector, i);
                                                }

                                                System.out.print("Which medicine to update?\n Choice : ");
                                                int z;
                                                z = choice.nextInt();
                                                choice.nextLine();

                                                System.out.println("Enter the information in the following fields : ");
                                                System.out.print("Medicine Code: ");
                                                medicineVector.get(z - 1).setMedCode(choice.nextLine());
                                                System.out.print("Medicine Name: ");
                                                medicineVector.get(z - 1).setMedName(choice.nextLine());
                                                System.out.print("Description: ");
                                                medicineVector.get(z - 1).setDescription(choice.nextLine());
                                                System.out.print("Price: RM");
                                                medicineVector.get(z - 1).setPrice(choice.nextDouble());
                                                System.out.print("Quantity: ");
                                                medicineVector.get(z - 1).setQuantity(choice.nextInt());
                                                choice.nextLine();

                                                System.out.println("You have successfully update the medicine!");
                                                break;

                                            case 4: // View medicine
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Medicine List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-15s", "Medicine Code") +
                                                        String.format("%-15s", "Medicine Name")
                                                        + String.format("%-25s", "Description") +
                                                        String.format("%-10s", "Quantity")
                                                        + String.format("%-10s", "Price(RM)"));
                                                for (int i = 0; i < medicineVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewMedicine(medicineVector, i);
                                                }
                                                break;

                                            case 5: // Back
                                                loop3 = false;
                                                break;

                                            case 6: // Return to Main Menu
                                                loop3 = false;
                                                loop2 = false;
                                                break;

                                            default: // Invalid input
                                                break;
                                        }
                                    }

                                    break;

                                case 3:
                                    while (loop3) {
                                        dispLogin(adminVector, index);
                                        x = adminSubMenu3();
                                        System.out.println("\n\n\n\n\n");

                                        switch (x) {
                                            case 1: // Add Admin
                                                String n, usn, pswd, adrs, _gender, _ic, _id, _phone;
                                                int _age;
                                                Scanner input = new Scanner(System.in);
                                                System.out.println(
                                                        "Enter the new admin with filling out the following fields : ");
                                                System.out.print("Username: ");
                                                usn = input.nextLine();
                                                System.out.print("Password: ");
                                                pswd = input.nextLine();
                                                System.out.print("Name: ");
                                                n = input.nextLine();
                                                System.out.print("IC: ");
                                                _ic = input.nextLine();
                                                System.out.print("Admin ID: ");
                                                _id = input.nextLine();
                                                System.out.print("Gender: ");
                                                _gender = input.nextLine();
                                                System.out.print("Age: ");
                                                _age = input.nextInt();
                                                input.nextLine();
                                                System.out.print("Phone: ");
                                                _phone = input.nextLine();
                                                System.out.print("Address: ");
                                                adrs = input.nextLine();

                                                adminVector.add(adminVector.get(index).addAdmin(usn, pswd, n, _ic,
                                                        _id, _gender, _age, _phone, adrs));
                                                System.out.println("You have successfully add a new admin!");
                                                break;

                                            case 2: // Delete admin
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Admin List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-10s", "Admin ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address"));
                                                for (int i = 0; i < adminVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewAdmin(adminVector, i);
                                                }
                                                // Ask the admin to choose which record to delete from the list
                                                System.out.print("Which Admin to delete?\n Choice : ");
                                                Scanner in = new Scanner(System.in);
                                                int c;
                                                c = in.nextInt();

                                                adminVector.get(index).deleteAdmin(adminVector, c - 1);
                                                System.out.println("You have successfully delete the admin!");
                                                break;

                                            case 3: // Update Admin
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Admin List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-10s", "Admin ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address"));
                                                for (int i = 0; i < adminVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewAdmin(adminVector, i);
                                                }
                                                // Ask the admin to select which admin to update
                                                System.out.print("Which Admin to update?\n Choice : ");
                                                int z;
                                                z = choice.nextInt();
                                                choice.nextLine();
                                                // Ask the admin to enter the information required.
                                                System.out.println("Enter the information in the following fields : ");
                                                System.out.print("Username: ");
                                                adminVector.get(z - 1).setUsername(choice.nextLine());
                                                System.out.print("Password: ");
                                                adminVector.get(z - 1).setPassword(choice.nextLine());
                                                System.out.print("Name: ");
                                                adminVector.get(z - 1).setName(choice.nextLine());
                                                System.out.print("IC: ");
                                                adminVector.get(z - 1).setIc(choice.nextLine());
                                                System.out.print("Admin ID: ");
                                                adminVector.get(z - 1).setAdminId(choice.nextLine());
                                                System.out.print("Gender: ");
                                                adminVector.get(z - 1).setGender(choice.nextLine());
                                                System.out.print("Age: ");
                                                adminVector.get(z - 1).setAge(choice.nextInt());
                                                System.out.print("Phone: ");
                                                choice.nextLine();
                                                adminVector.get(z - 1).setPhone(choice.nextLine());
                                                System.out.print("Address: ");
                                                adminVector.get(z - 1).setAddress(choice.nextLine());

                                                System.out.println("You have successfully update the admin!");
                                                break;

                                            case 4: // View Admin
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println("\t\t\t Admin List");
                                                System.out.println(
                                                        "========================================================================");
                                                System.out.println(String.format("%-4s", "No")
                                                        + String.format("%-10s", "Admin ID")
                                                        + String.format("%-35s", "Name") +
                                                        String.format("%-5s", "Age") + String.format("%-10s", "Gender")
                                                        + String.format("%-15s", "IC") +
                                                        String.format("%-15s", "Phone")
                                                        + String.format("%-45s", "Address"));
                                                for (int i = 0; i < adminVector.size(); i++) {
                                                    System.out.print(String.format("%-4d", (i + 1)));
                                                    adminVector.get(index).viewAdmin(adminVector, i);
                                                }
                                                break;

                                            case 5: // Back
                                                loop3 = false;
                                                break;

                                            case 6: // Return to Main Menu
                                                loop3 = false;
                                                loop2 = false;
                                                break;

                                            default: // Invalid input
                                                break;
                                        }
                                    }
                                    break;
                                case 4: // Check appointment
                                    adminVector.get(index).checkAppointment(appointmentVector);
                                    break;

                                case 5: // Display system summary
                                    System.out.println(
                                            "Total number of patient registerd the system : " + patientVector.size());
                                    System.out.println("Total number of doctor : " + doctorVector.size());
                                    System.out.println("Total number of admin : " + adminVector.size());
                                    System.out.println("Total types of medicine : " + medicineVector.size());
                                    System.out.println("Total appointment made : " + appointmentVector.size());
                                    break;

                                case 6: // View profile
                                    adminVector.get(index).displayUser();
                                    break;

                                case 7: // Return to main menu
                                    loop2 = false;
                                    break;

                                default: // Invalid input
                                    break;
                            }
                        }
                    } else // Login failed
                    {
                        System.out.println("========================================================================");
                        System.out.println("\t\tWelcome to Hospital Coven System");
                        System.out.println("========================================================================");
                        System.out.println("Login unsuccessfully! Invalid username or password!");
                        System.out.println("Returning to main menu...");
                        System.out.println("\n\n\n\n\n");
                    }
                    break;

                case 2: // Doctor
                {
                    System.out.println("========================================================================");
                    System.out.println("\t\tWelcome to Hospital Coven System");
                    System.out.println("========================================================================");
                    System.out.println("Please input your username and password below: ");
                    System.out.print("Username : ");
                    username = choice.nextLine();
                    System.out.print("Password : ");
                    pass = choice.nextLine();
                    System.out.println("\n\n\n\n\n");
                    for (int i = 0; i < doctorVector.size(); i++) {
                        login = doctorVector.get(i).authenticate(username, pass);
                        if (login) {
                            index = i;
                            break;
                        }
                    }

                    // Check if username and password is true
                    if (login) {
                        boolean loop2 = true;
                        while (loop2) {
                            dispLogin(index, doctorVector);
                            x = doctorMenu();
                            switch (x) {
                                case 1: // check appointment
                                    doctorVector.get(index).checkAppointment(appointmentVector);
                                    break;

                                case 2: // view patient list
                                    if (doctorVector.get(index).getPatientListSize() != 0) {
                                        System.out.println(
                                                "========================================================================");
                                        System.out.println("\t\t\t Patient List");
                                        System.out.println(
                                                "========================================================================");
                                        doctorVector.get(index).viewPatientList();
                                    } else
                                        System.out.println("You do not have any patient yet!\n");
                                    break;

                                case 3: // make patient's medical report
                                    if (doctorVector.get(index).getPatientListSize() != 0) {
                                        System.out.println(
                                                "========================================================================");
                                        System.out.println("\t\t\t Patient List");
                                        System.out.println(
                                                "========================================================================");
                                        doctorVector.get(index).viewPatientList();
                                        System.out.print("Who do you want to write the medical report to?\n Choice : ");
                                        int p_index = choice.nextInt();
                                        choice.nextLine();
                                        System.out.print("Your remarks : ");
                                        String desc = choice.nextLine();
                                        doctorVector.get(index).makeReport(desc, patientVector.get(p_index - 1));
                                    } else
                                        System.out.println("You do not have any patient yet!\n");
                                    break;

                                case 4: // Prescribe to the patient
                                    if (medicineVector.size() == 0) // No medicine in the system
                                    {
                                        System.out.println("There is no medicine registered in the system yet!");
                                        System.out.println(
                                                "Please inform admins to add some medicine in the the system.");
                                        break;
                                    }

                                    if (doctorVector.get(index).getPatientListSize() != 0) // If the doctor has a
                                                                                           // patient
                                    {
                                        System.out.println(
                                                "========================================================================");
                                        System.out.println("\t\t\t Patient List");
                                        System.out.println(
                                                "========================================================================");
                                        doctorVector.get(index).viewPatientList();
                                        System.out.print("Which patient to prescribe?\n Choice : ");
                                        int pIndex = choice.nextInt();
                                        System.out.println("\n\n");
                                        System.out.println(
                                                "========================================================================");
                                        System.out.println("\t\t\t Medicine List");
                                        System.out.println(
                                                "========================================================================");
                                        System.out.println(
                                                String.format("%-4s", "No") + String.format("%-15s", "Medicine Code") +
                                                        String.format("%-15s", "Medicine Name")
                                                        + String.format("%-25s", "Description") +
                                                        String.format("%-10s", "Quantity")
                                                        + String.format("%-10s", "Price(RM)"));
                                        for (int i = 0; i < medicineVector.size(); i++) {
                                            System.out.print(String.format("%-4d", (i + 1)));
                                            adminVector.get(index).viewMedicine(medicineVector, i);
                                        }

                                        System.out.print("Which medicine to prescribe for the patient?\n Choice : ");
                                        int m_index = choice.nextInt();
                                        System.out.print("The medicine quantity : ");
                                        int m_quantity = choice.nextInt();
                                        choice.nextLine();
                                        // prescribe to the patient (add medicine to the patient)
                                        doctorVector.get(index).prescribe(medicineVector.get(m_index - 1),
                                                patientVector.get(pIndex - 1), m_quantity);
                                        // update medicine quantity in the medicine vector
                                        medicineVector.get(m_index - 1).setQuantity(
                                                medicineVector.get(m_index - 1).getQuantity() - m_quantity);
                                    } else
                                        System.out.println("You do not have any patient yet!\n");
                                    break;

                                case 5: // View self profile - doctor
                                    doctorVector.get(index).displayUser();
                                    break;

                                case 6: // Return to Main Menu
                                    loop2 = false;
                                    break;

                                default:
                                    break;
                            }
                        }
                    } else // Login failed
                    {
                        System.out.println("========================================================================");
                        System.out.println("\t\tWelcome to Hospital Coven System");
                        System.out.println("========================================================================");
                        System.out.println("Login unsuccessfully! Invalid username or password!");
                        System.out.println("Returning to main menu...");
                        System.out.println("\n\n\n\n\n");
                    }
                    break;
                }

                case 3: // Patient
                    boolean loop = true;
                    while (loop) {
                        System.out.println("========================================================================");
                        System.out.println("\t\tWelcome to Hospital Coven System");
                        System.out.println("========================================================================");
                        System.out.println("Please choose the option below: [1-3]");
                        System.out.println("1 - New User");
                        System.out.println("2 - Old User");
                        System.out.println("3 - Back");
                        System.out.print("Choice - ");
                        x = choice.nextInt();
                        choice.nextLine();

                        if (x == 1) // New User - Register
                        {
                            Patient p = new Patient();
                            System.out.println(
                                    "========================================================================");
                            System.out.println("\t\tWelcome to Hospital Coven System");
                            System.out.println(
                                    "========================================================================");
                            System.out.println("Please fill in your details to create an account: \n");
                            System.out.println("\nEnter the information below:");
                            System.out.print("Username: ");
                            patient1.setUsername(choice.nextLine());
                            System.out.print("Password: ");
                            patient1.setPassword(choice.nextLine());
                            System.out.print("Name: ");
                            patient1.setName(choice.nextLine());
                            System.out.print("IC: ");
                            patient1.setIc(choice.nextLine());
                            System.out.print("Gender: ");
                            patient1.setGender(choice.nextLine());
                            System.out.print("Age: ");
                            patient1.setAge(choice.nextInt());
                            choice.nextLine();
                            System.out.print("Phone: ");
                            patient1.setPhone(choice.nextLine());
                            System.out.print("Address: ");
                            patient1.setAddress(choice.nextLine());
                            patientVector.add(p);
                        } else if (x == 2) // Old User - Login
                        {
                            System.out.println(
                                    "========================================================================");
                            System.out.println("\t\tWelcome to Hospital Coven System");
                            System.out.println(
                                    "========================================================================");
                            System.out.println("Please input your username and password below: ");
                            System.out.print("Username : ");
                            username = choice.nextLine();
                            System.out.print("Password : ");
                            pass = choice.nextLine();
                            System.out.println("\n\n\n\n\n");
                            for (int i = 0; i < patientVector.size(); i++) {
                                login = patientVector.get(i).authenticate(username, pass);
                                if (login) {
                                    index = i;
                                    break;
                                }
                            }
                            // Check if username and password is true
                            if (login) {
                                boolean loop2 = true;
                                while (loop2) {
                                    // To show the login status of the patient
                                    dispLogin(patientVector.get(index));
                                    // Start the patient menu
                                    x = patientMenu();
                                    switch (x) {
                                        case 1: // Display self profile - Patient
                                            patientVector.get(index).displayUser();
                                            break;

                                        case 2: // Check appointment
                                            // Display appointment info
                                            patientVector.get(index).checkAppointment(appointmentVector);
                                            break;

                                        case 3: // Book appointment
                                            // Display the doctor list for the patient to choose
                                            System.out.println(
                                                    "========================================================================");
                                            System.out.println("\t\t\t Doctor List");
                                            System.out.println(
                                                    "========================================================================");
                                            System.out.println(
                                                    String.format("%-4s", "No") + String.format("%-35s", "Name") +
                                                            String.format("%-10s", "Gender")
                                                            + String.format("%-15s", "Specialty") +
                                                            String.format("%-25s", "Qualification"));
                                            for (int i = 0; i < doctorVector.size(); i++) {
                                                System.out.print(String.format("%-4d", (i + 1)));
                                                System.out.println(String.format("%-35s", doctorVector.get(i).getName())
                                                        +
                                                        String.format("%-10s", doctorVector.get(i).getGender()) +
                                                        String.format("%-15s", doctorVector.get(i).getSpecialty()) +
                                                        String.format("%-25s", doctorVector.get(i).getQualification()));
                                            }
                                            // Ask the patient to choose the doctor from the list displayed
                                            System.out.print("Which doctor to make appointment with?\nChoice : ");
                                            int d_index = choice.nextInt();
                                            System.out.println("Please input the following field : ");
                                            System.out.print("Day : ");
                                            int day = choice.nextInt();
                                            System.out.print("Month : ");
                                            int month = choice.nextInt();
                                            System.out.print("Year : ");
                                            int year = choice.nextInt();
                                            System.out.print("Hour : ");
                                            int hour = choice.nextInt();
                                            System.out.print("Minute : ");
                                            int minute = choice.nextInt();
                                            choice.nextLine();

                                            Appointment appoint = new Appointment(year, day, month, hour, minute,
                                                    doctorVector.get(d_index - 1), patientVector.get(index));
                                            // Check whether the booking date and time clashed or not
                                            boolean status = patientVector.get(index)
                                                    .bookAppointment(doctorVector.get(d_index - 1), appoint);
                                            // If the appointment is not clashed, then add the appointment into the
                                            // vector
                                            if (status == true) {
                                                doctorVector.get(d_index - 1).addAppointment(appoint);
                                                appointmentVector.add(appoint);
                                            }

                                            break;

                                        case 4: // Make payment
                                            // Check the patients' fee allocated
                                            if (patientVector.get(index).getPayment() == 0.0) {
                                                System.out.println("No payment to be made...\n");
                                            } else {
                                                System.out.println("Payment to be made : RM"
                                                        + String.format("%.2f", patientVector.get(index).getPayment()));
                                                System.out.print("Please enter the amount you want to pay : RM");
                                                double amount = choice.nextDouble();
                                                boolean payment_loop = true;
                                                while (payment_loop) {
                                                    if (amount > patientVector.get(index).getPayment()) {
                                                        double change = amount - patientVector.get(index).getPayment();
                                                        System.out.println(
                                                                "Thank you for your payment! Here is your change RM"
                                                                        + String.format("%.2f", change));
                                                        payment_loop = false;
                                                    } else if (amount == patientVector.get(index).getPayment()) {
                                                        System.out.println("Thank you for your payment!");
                                                        payment_loop = false;
                                                    } else {
                                                        System.out.println(
                                                                "The amount entered is not enough. Please enter the add-on amount");
                                                        System.out.print("Add On : RM");
                                                        double addOn = choice.nextDouble();
                                                        amount += addOn;
                                                        if (amount > patientVector.get(index).getPayment()) {
                                                            double change = amount
                                                                    - patientVector.get(index).getPayment();
                                                            System.out.println(
                                                                    "Thank you for your payment! Here is your change RM"
                                                                            + String.format("%.2f", change));
                                                            payment_loop = false;
                                                        } else if (amount == patientVector.get(index).getPayment()) {
                                                            System.out.println("Thank you for your payment!");
                                                            payment_loop = false;
                                                        }
                                                    }
                                                }
                                                patientVector.get(index).setPayment(0.0);
                                                choice.nextLine();
                                            }
                                            break;

                                        case 5: // View medical report
                                            patientVector.get(index).viewReport();
                                            break;

                                        case 6: // Back
                                            loop2 = false;
                                            break;

                                        case 7: // Return to Main Menu
                                            loop = false;
                                            loop2 = false;
                                            break;

                                        default:
                                            break;
                                    } // end switch
                                } // end loop2
                            } // end if(login)
                            else {
                                System.out.println(
                                        "========================================================================");
                                System.out.println("\t\tWelcome to Hospital Coven System");
                                System.out.println(
                                        "========================================================================");
                                System.out.println("Login unsuccessfully! Invalid username or password!");
                                System.out.println("Returning to main menu...");
                                System.out.println("\n\n\n\n\n");
                            }
                        } else // back
                            loop = false;
                    }
                    break;

                case 4: // Exit program
                    loop1 = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please input again!");
                    break;
            } // end switch
        } // end loop1
    } // end main
} // end class
