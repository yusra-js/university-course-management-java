# SRS_TaibaCCSE — University Course Management System (Java)

A console-based Java application (IntelliJ IDEA project) that models a simplified university system: students, faculty staff (teaching & administrative), and courses — built around a `Staff` inheritance hierarchy, as required by the project's UML class diagram.

**Author:** Yusra 

## ✨ Features
- **Console menu** — choose between Student / Lecturer / Administrator / Exit.
- **Staff inheritance hierarchy**:
  - `Staff` — base class (ID, name, contact, address)
  - `FacultyMember extends Staff` — adds academic rank, email, specialization
  - `AdministartorMember extends Staff` — adds admin email & specialization
  - `Teaching extends FacultyMember` — manages a list of assigned `Course`s
- **Course management (Admin menu)** — allocate a course to a lecturer, drop a course from a lecturer, print a report.
- **Student & Course** — simple data classes.

## 🛠️ Tech Stack
- Language: Java
- Paradigm: Object-Oriented Programming (inheritance, encapsulation, type casting)

## 📂 Project Structure
```
SRS_TaibaCCSE/
└── com/
    └── company/
        ├── Main.java               # Entry point — menus and program flow
        ├── Staff.java               # Base class for all staff members
        ├── FacultyMember.java       # Faculty member details (extends Staff)
        ├── AdministartorMember.java # Administrative staff (extends Staff)
        ├── Teaching.java            # Teaching staff with course management (extends FacultyMember)
        ├── Course.java              # Course data (code, name, credit hours)
        └── Student.java             # Student data
```

## ⚠️ Note on sample data
In `Main.java`, `staffList`, `courseList`, and `studentList` are created empty and are never pre-populated with sample records in the original source — this matches the recorded demo run, where searching for a student/lecturer ID returns nothing because the lists start empty. To test the app fully, add some sample `Student`/`Teaching`/`Course` objects to the lists near the top of `main()` before the loop, e.g.:
```java


## ▶️ How to Run
1. Open the project in **IntelliJ IDEA** (File → Open → select the `SRS_TaibaCCSE` folder, with `com/company/*.java` as the source root).
2. Run `Main.java`.
3. Follow the on-screen menu prompts.
