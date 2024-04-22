Assignment for Data Managment


to setup the project 

go to DB Scrtibts then follow the setps 

setp 01: create users 
setp 02: create schema 
setp 03: insert pre defined data for example (optional)


after create the DB Table and users  run the java project by :

assignment -> srv -> main -> java -> AssignmentApplication -> run 

http://localhost:8080/api/   "endpoints"

endpoints: 

get all : 
http://localhost:8080/api/patient
http://localhost:8080/api/appointment

get by ID:  
http://localhost:8080/api/patient/1
http://localhost:8080/api/appointment/1


search endpoints: http://localhost:8080/api/appointment/search

to search in appointment list by id
http://localhost:8080/api/appointment/search/findByPatientId?id=1

to search in appointment list by first name
http://localhost:8080/api/appointment/search/findByPatientFirstName?name=mohamed

to search in appointment list by first name
http://localhost:8080/api/appointment/search/findByPatientLastName?name=ghareeb

Search by Date: 

find by date for example Appointment date was 20/8/2021 ENDPOINT : findAllWithDateBefore?before=1/9/2021
http://localhost:8080/api/appointment/search/findAllWithDateBefore?before=25/8/2022

http://localhost:8080/api/appointment/search/findAllWithDateAfter?after=1/1/2020

http://localhost:8080/api/appointment/search/findAllWithDateBetween?from=1/1/2020&to=1/1/2022


you can use post man for POST, PUT , DELETE api  for example :
Delete : http://localhost:8080/api/appointment/1


POST: http://localhost:8080/api/patient/add
BODY:
{
    "patient": {
        "firstName": "mostafa",
        "lastName": "Ahmed",
        "email": "mostafa@gmail.com"
    },
    "appointment": [
        {
            "review": "fever",
            "cancelation": {
                "patientRequest": "phone Call Cancel",
                "physicianApology": "none"
            }
        },
        {
            "review": "covid"
        }
    ]
}
