# IntegratedHealthDataSystem
## Description/Overview

It stores and manages data records that allows adding different types of patients (inpatients and outpatients), recording their medical information, and displaying reports on their health status. It is designed to simplify and modernize the way patient records are stored, accessed, and managed. The System provides features to update, search, and display patient records, making it easier for users to track patient progress and generate summarized health reports for clinical review.

## OOP Concepts Applied

**Encapsulation**
- All patient attributes (ID, name, age, diagnosis, etc.) are kept private.
- Access to these attributes is controlled using getters and setters.
- Encapsulation ensures data security and prevents unintended modification of patient details.
  
**Inheritance**
- A parent class `Patient` provides common attributes and methods.
- Subclasses `Inpatient` and `Outpatient` inherit this structure and add their own specific fields (e.g., room number, consultation date).
- This reduces code duplication and promotes reusability.

**Polymorphism**
- Methods like `displayInfo()` are overridden by subclasses to show details unique to each patient type.
- The system can handle different patient types using a common interface, demonstrating runtime polymorphism.

**Abstraction**
- The abstract parent class defines the essential structure and behavior of a patient.
- Subclasses implement the specific details, hiding unnecessary complexity from the rest of the program.

## Program Structure

 - **Patient:**  Base class for shared patient attributes. 
 - **Inpatient:**  Subclass storing ward, room, and admission details. 
 - **Outpatient:**  Subclass storing appointment and doctor details. 
 - **Main:**  Menu interface and program entry point. 

 **Text-Based Class Diagram**
```
         Patient
    ├── Inpatient
    └── Outpatient

    PatientManager
    └── manages → Patient records

    Main
    └── runs the menu 
```
## How to run Program


## Sample Output
This is how the program looks like:
```
=== PATIENT MANAGEMENT SYSTEM ===
1. Add Inpatient
2. Add Outpatient
3. View All Patients
4. Search Patient by ID
5. Exit
Enter choice: 1

ID: P001
Name: John Dela Cruz
Age: 32
Diagnosis: Pneumonia
Room Number: 203B
Inpatient added!


=== PATIENT MANAGEMENT SYSTEM ===
1. Add Inpatient
2. Add Outpatient
3. View All Patients
4. Search Patient by ID
5. Exit
Enter choice: 2

ID: P002
Name: Maria Santos
Age: 27
Diagnosis: Migraine
Appointment Date: 2025-12-10
Outpatient added!


=== PATIENT MANAGEMENT SYSTEM ===
1. Add Inpatient
2. Add Outpatient
3. View All Patients
4. Search Patient by ID
5. Exit
Enter choice: 3

----------------
[Inpatient]
ID: P001
Name: John Dela Cruz
Age: 32
Diagnosis: Pneumonia
Room Number: 203B

----------------
[Outpatient]
ID: P002
Name: Maria Santos
Age: 27
Diagnosis: Migraine
Appointment Date: 2025-12-10


=== PATIENT MANAGEMENT SYSTEM ===
1. Add Inpatient
2. Add Outpatient
3. View All Patients
4. Search Patient by ID
5. Exit
Enter choice: 4
Enter ID: P002

Patient Found!
[Outpatient]
ID: P002
Name: Maria Santos
Age: 27
Diagnosis: Migraine
Appointment Date: 2025-12-10


=== PATIENT MANAGEMENT SYSTEM ===
1. Add Inpatient
2. Add Outpatient
3. View All Patients
4. Search Patient by ID
5. Exit
Enter choice: 5

Goodbye!
```
## Author and Acknowledgement
**Author:**

Semira, Christian Jacob A. (24-01988@g.batstate-u.edu.ph)

Aniel, Clynt Xeus Gabriel G. (24-06970@g.batstate-u.edu.ph)

Melanay, Rency James I. (24-05189@g.batstate-u.edu.ph)

Almarez, Jeanno Benedick A. (24-09622@g.batstate-u.edu.ph)

**Acknowledgement:**

- Instructor   
- Appriciation to fellow members
- Java Documentation and online resources
- AI, Online tutorials, and GitHub tutorials

## Future Enhancements

- It should have a delete option for patient because it is limited
- Add a database records for permanent records
- Implement or add GUI
- Fix the menu for it to become presentable
