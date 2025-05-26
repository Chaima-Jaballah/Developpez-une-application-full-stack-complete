![image](https://github.com/user-attachments/assets/98f7211d-93e9-4fc9-b182-6969fac96705)
# MDD

Steps to follow to run the project

---

## Technologies Used

- **Frontend**: Angular 14 (with Angular Material)
- **Backend**: Java Spring Boot
- **Database**: MySQL

---

## How to Run the Project

### 1. Clone the Repository

```bash
git clone [https://github.com/Chaima-Jaballah/Developpez-une-application-full-stack-complete.git](https://github.com/Chaima-Jaballah/Developpez-une-application-full-stack-complete.git)
```

---

### 2. Frontend Setup

Navigate to the frontend folder:

```bash
cd front
```

Install dependencies:

```bash
npm install
```

Start the development server:

```bash
ng serve
```

> The app will be available at [http://localhost:4200/](http://localhost:4200/)

Or simply run 

```bash
ng serve -o
```

to start the development server and automatically open the app in your default browser

---

### 3. Backend Setup

Navigate to the backend folder:

```bash
cd ../back
```

Set your database credentials (replace with your actual MySQL values):
> Make sure that your `mdd_db` database is created beforehand


```bash
set DB_URL=jdbc:mysql://localhost:3306/mdd_db
set DB_USERNAME=your_mysql_username
set DB_PASSWORD=your_mysql_password
```

Start the Spring Boot backend:

```bash
mvn spring-boot:run
```

> Make sure your MySQL server is running and the database `mdd_db` exists

---

### 4. Initialize the Database

Inside the backend directory, you’ll find an SQL file:

```
back/src/main/resources/SQL
```

This file contains the initial data for the `theme` table:

```sql
INSERT INTO theme (`id`,`description`,`name`) VALUES (1,'JavaScript theme','JavaScript');
INSERT INTO theme (`id`,`description`,`name`) VALUES (2,'Java theme','Java');
INSERT INTO theme (`id`,`description`,`name`) VALUES (3,'Python Theme','Python');
INSERT INTO theme (`id`,`description`,`name`) VALUES (4,'Angular Theme','Angular');
```

Run this script in your MySQL database after creating the `theme` table

---

## Final Notes

- The frontend will call the backend APIs — make sure both are running.
- The initial themes will be visible once the database is correctly populated.

---

You're all set to get started! 🚀
