# Hospital Management System




# About The Project
Hospital Management System is a beginner REST API project which uses Spring Boot as a Backend and created some Rest APIs through which Mysql fetched the datas, whereas also used Angular CLI 13 as a frontend. Along with it tested the backend with Postman API testing and also used Bootstrap and Css inorder to beautify the web page. 

## Home
### Look of Homepage
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Home%20Page.png)

### The Server is running on http://localhost:4200/ in which the backend of the project i.e-Spring is integrated with it. 


## Get Started
### These are some of the navigation buttons through which we can get redrected to different pages. And these buttons are routed through angular using their component class paths.

### On selecting the dropdown we can generate a number of cards of a list of doctors. The details of the doctor are imported dynamically, once we review the add doc page.



## Add a Patient....!
### On adding a patient in these fields, the datas will be migrated to the mysql database which's running on localhost:3306 and these datas will be displayed dynamically on Patient's Info page.

## Add a Doctor....!
### On adding a doctor in these fields, the datas will be migrated to the mysql database which's running on localhost:3306 and these datas will be displayed dynamically on Doctor's Info page as well as on all the dropdowns where we can search a doctor by name and also in the add patient's tab where we can display a list of doctors in a dropdown.


## DoctorLists....!
### These are the list of Doctors

## PatientLists....!
### These are the list of Patients

## Doctor's Prescription
### This's the doctor's prescription where the doctor can prescribe a medicine for someone's use and also upload it in drive for the patients.

## Database of Doctor's Info....!
### A list of doctors are visible in this page with their specialization field.

## Database of Patient's Info....!
### A list of patients are visible in this page with their respective prescription. Even though the receptionists checks for the required patient on a particular ID then he/she can search here using this search box.



## API Testing of Request Response via Postman....!
### API testing is done inorder to check a proper request response cycle and that too in a partuclar ID.
Here GET's are done inorder to check the list of JSON entities are available or not.And incase of POST we need to add a raw JSON data to check whether the lifecycle is working properly or not.If it returns 200 or 201 as the Gateway response then its good. Regardless this if we face anuthing othes then it wont do.


### POST


## Maven Jar Build
### In the POM.XML we need to use a maven plugin.This JAR file is created inorder to deploy an entire application, including its classes and their associated resources, in a single request.

