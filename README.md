# Appointment-Booking-Application.

A rest api using Spring Boot that enables users to search and book appointments with doctors. Users can view a doctor's profile, including their education, experience, and patient reviews. The application also provide a calendar of available appointments, allowing users to select a time that works for them.



## Tech Stack
- Java.
- Spring Framework
- Spring Boot
- Spring Data JPA
- Hibernate
- Spring Validation
- MySQL
- Lambok
- Swagger Ui.

## Modules
- Login Module
- Admin Module
- Patient Module
- Doctor Module
- Appointment Booking Module


## ER Diagram

![appointment-new-erDiagram](https://user-images.githubusercontent.com/76080960/227708841-feffffa8-8d04-4dda-aba6-4175bea89995.png)


## Features

- Patient, Admin, Doctor authentication, authorization & validation with session UUID.
- Password will store using bcrypt-password-encoder.
- Admin Features:
  - Admin can register and login into application
  - Admin can register Doctor in database
- Patient Features:
  - Patient can register, update and login
  - Patient can book appointment, update appointment and delete appointment
  - Patient can get all doctor register in database
  - Patient can see available doctors
  - Patient can see available timing of doctors
  - Patient can see the upcomming appointment
- Doctor Features:
  - Doctor can see upcomming appointment
  - Doctor can see past appointment
  - Doctor can get all list of appointment
  - Doctor can update, delete appointment
- Email Features:
  - Patient will get email by successfully booking of appointment
  - Patient can get email after successfully cancel the appointment
 


## API Root and Endpoint

```
https://localhost:8083/
http://localhost:8083/swagger-ui/index.html#/
