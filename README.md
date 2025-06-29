# Student Directory with Doubly Linked List 📖🔗

This is a Java application designed to manage student records using a **Doubly Linked List** data structure. It was developed as a term project for the **Algorithm and Programming II** course at **Ege University, Department of Computer Engineering (Spring 2021-2022)**.

The application allows users to add, delete, search, and display student records. Each student has an ID, name-surname, and multiple phone numbers.

---

## 🚀 Features

- 🔢 Add a student to the list (sorted by student ID)
- 🔍 Search student(s) by name and surname
- 🗑️ Delete a student by student ID
- 📜 Display all students in:
  - ✅ Ascending order (by student ID)
  - 🔽 Descending order (by student ID)
- 📄 Load students from a file (`ogrenciler.txt`)

---

## 🏗️ Project Structure

- `Student.java`: Defines the student object with ID, name-surname, and phone numbers (stored in an ArrayList).
- `Node.java`: Represents a node in the doubly linked list (can be an inner class or a separate class).
- `DoublyLinkedList.java`: Manages the doubly linked list with all CRUD operations.
- `Main.java`: Contains the menu-driven interface for user interaction.

---

## 📄 Example Input File (`ogrenciler.txt`)

```plaintext
125, Veli Tuz, 0 533 1111111, 0 232 1111111
112, Ali Can Kara, 0 554 2222222, 0 543 3333333, 0 312 1111111
144, Canan Demir, 0 216 4444444
118, Veli Tuz, 0 505 2222222
102, Ayse Demir, 0 532 6667777, 0 232 2233455
