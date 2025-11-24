# IntegratedHealthDataSystem
## Description/Overview

It stores and manages data records that allows adding different types of patients (inpatients and outpatients), recording their medical information, and displaying reports on their health status. It is designed to simplify and modernize the way patient records are stored, accessed, and managed. The System provides features to update, search, and display patient records, making it easier for users to track patient progress and generate summarized health reports for clinical review.

## OOP Concepts Applied

### Encapsulation
- All patient attributes (ID, name, age, diagnosis, etc.) are kept private.
- Access to these attributes is controlled using getters and setters.
- Encapsulation ensures data security and prevents unintended modification of patient details.
### Inheritance
- A parent class `Patient` provides common attributes and methods.
- Subclasses `Inpatient` and `Outpatient` inherit this structure and add their own specific fields (e.g., room number, consultation date).
- This reduces code duplication and promotes reusability.
### Polymorphism
- Methods like `displayInfo()` are overridden by subclasses to show details unique to each patient type.
- The system can handle different patient types using a common interface, demonstrating runtime polymorphism.
### Abstraction
- The abstract parent class defines the essential structure and behavior of a patient.
- Subclasses implement the specific details, hiding unnecessary complexity from the rest of the program.

## Program Structure

 - **Patient:**  Base class for shared patient attributes. 
 - **Inpatient:**  Subclass storing ward, room, and admission details. 
 - **Outpatient:**  Subclass storing appointment and doctor details. 
 - **PatientManager:**  Handles all CRUD operations for patient records. 
 - **Main:**  Menu interface and program entry point. 

### Text-Based Class Diagram
         Patient
    ├── Inpatient
    └── Outpatient

    PatientManager
    └── manages → Patient records

    Main
    └── runs the menu and calls PatientManager

## How to run Program
```bash

**1. Download or clone the project:**

git clone https://github.com/your-username/Patient-Record-Management-System.git

**2. Open the project folder:**

cd Patient-Record-Management-System/src

**3. Compile all Java files:**

javac *.java

**4. Run the program:**

java Main
  
