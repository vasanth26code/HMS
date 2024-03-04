# Hospital Management System




# About The Project
Hospital Management System is a beginner REST API project which uses Spring Boot as a Backend and created some Rest APIs through which Mysql fetched the datas, whereas also used Angular CLI 13 as a frontend. Along with it tested the backend with Postman API testing and also used Bootstrap and Css inorder to beautify the web page. 

## Home
### Look of Homepage
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Home%20Page.png)

### The Server is running on http://localhost:4200/ in which the backend of the project i.e-Spring is integrated with it. 
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/angular%20file%20overview.png)

### File structure of the Springboot Application folder
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/springboot%20file%20overview.png)

## Get Started

## Create / Add a Doctor
### On adding a doctor in these fields, the datas will be migrated to the mysql database which's running on localhost:3306 and these datas will be displayed dynamically on Doctor's Info page as well as on all the dropdowns.
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Create%20DOcotoe.png)

##  Create / Add a Doctor
### On adding a patient in these fields, the datas will be migrated to the mysql database which's running on localhost:3306 and these datas will be displayed dynamically on Patient's Info page.
<p> This Feature is similar to the add doctor feature </p>


### On selecting the dropdown we can generate a card of a doctor. The details of the doctor are imported dynamically, after adding details in the add doc page.
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Doctors%20ID%20list.png)

### Here we can see the ID generated for the Doctor
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Doctors%20ID.png)

## DoctorList and Patients List
### This is how the list of Doctors and patients are displayed
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Doctors%20list.png)

## Postman Testing
### API Testing of Request Response via Postman....!
### API testing is done inorder to check a proper request response cycle and that too in a partuclar ID.
Here GET's are done inorder to check the list of JSON entities are available or not.And incase of POST we need to add a raw JSON data to check whether the lifecycle is working properly or not.If it returns 200 or 201 as the Gateway response then its good. Regardless this if we face anuthing othes then it wont do.

### GET command to get info about the data in the database
### Doctor details in the DB
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/get%20doctors.png)

### Patient details in the DB
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/get%20Patients.png)

### POST command to add new details in api 
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/Post%20doctors.png)
### api listing after posting in DB
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/updated%20doctors.png)

## SQL using MySQL workbench Preview 
### Data in the SQL Database of Doctor and Patient tables
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/sql%20doctors.png)
![preview of code](https://github.com/vasanth26code/Hospital-Management-System-HMS-Intern-Project-/blob/main/screenshot%20of%20HMS/sql%20patients.png)
