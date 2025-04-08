(a) Identify the Functional Dependencies
 1. Dependencies:
    1. PatientNumber → FullName, BedNumber, WardNumber, WardName

    2. WardNumber → WardName

    3. DrugNumber → DrugName, Description, Dosage, MethodOfAdmin

 2. Assumptions:
    1. Each Patient Number uniquely identifies a patient.

    2. Each Drug Number uniquely identifies certain drug fields but not way of injection.

(b) Normalization to 3NF

1. First Normal Form (1NF)

All attributes are atomic. No repeating groups or arrays.

2. Second Normal Form (2NF)

Remove partial dependencies by breaking data into separate tables:

Patient(PatientNumber, FullName, BedNumber, WardNumber)
Ward(WardNumber, WardName)
Drug(DrugNumber, DrugName, Description, Dosage, MethodOfAdmin)
Prescription(PatientNumber, DrugNumber, StartDate, UnitsPerDay, FinishDate)

3. Third Normal Form (3NF)

All transitive dependencies removed:

WardNumber → WardName is in a separate table.
DrugNumber → Description, Dosage is also in a separate table.

(c) Identify the primary, alternate, and foreign keys in your 3NF relations

1. Patient Table
   Patient(
       PatientNumber PRIMARY KEY,
       FullName,
       BedNumber,
       WardNumber FOREIGN KEY REFERENCES Ward(WardNumber)
   )
2. Ward Table
   Ward(
       WardNumber PRIMARY KEY,
       WardName
   )
3. Drug Table
   Drug(
       DrugNumber PRIMARY KEY,
       DrugName,
       Description,
       Dosage,
       MethodOfAdmin
   )
4. Prescription Table
   Prescription(
      PatientNumber FOREIGN KEY REFERENCES Patient(PatientNumber),
      DrugNumber FOREIGN KEY REFERENCES Drug(DrugNumber),
      StartDate,
      UnitsPerDay,
      FinishDate,
      PRIMARY KEY (PatientNumber, DrugNumber, StartDate)
   )