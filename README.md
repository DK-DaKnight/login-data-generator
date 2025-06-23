# Login Data Generator  <img src="/images/icon.png" alt="Login Data Generator Icon" width="30" height="30">

**Login Data Generator** is a simple desktop application that generates random usernames and passwords. It's designed for developers, testers, or anyone who needs quick and customizable login credentials. The application features a clean and user-friendly UI built with JavaFX.

---

## 🔧 Features

* **Random Username Generator**
  Easily generate usernames consisting of letters and/or numbers.

* **Random Password Generator**
  Generate secure passwords with adjustable length and complexity.

* **Custom Character Settings**
  Set the maximum number of characters and digits for both username and password separately.

* **Copy to Clipboard**
  Instantly copy generated usernames and passwords with a single click.

* **Simple JavaFX UI**
  Lightweight and intuitive graphical interface using JavaFX.

---

## 🖼️ User Interface

The UI consists of the following elements:

* Input fields to set the maximum number of letters and numbers for usernames and passwords
* "Generate" buttons for username and password
* Text fields to display the generated values
* Copy buttons to copy the generated data to the clipboard

Example layout (structure may vary):
![Login-Data-Generator-UI](/screenshots/login-data-generator-application-ui.png)

---

## 🛠️ Technologies Used

* **Java 17+**
* **JavaFX** for UI
* **Maven** or **Gradle** (optional, depending on your build system)

---

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/login-data-generator.git
   cd login-data-generator
   ```

2. Build and run the project with your IDE or terminal:

    * If using an IDE: Import the project and run the `Main` class.
    * If using command line with Maven:

      ```bash
      mvn javafx:run
      ```
    * If using Gradle:

      ```bash
      ./gradlew run
      ```

> Note: Make sure JavaFX is correctly set up in your environment.

---

## 📂 Project Structure

```
src/
├─ main/
│  ├─ java/
│  │  └─ com/daknight/generator/
│  │     ├─ ui/
│  │     │  └─ GeneratorUI.java
│  │     ├─ util/
│  │     │  ├─ generators/
│  │     │  │  ├─ UsernameGenerator.java
│  │     │  │  └─ PasswordGenerator.java
│  │     │  └─ lib/
│  │     │     ├─ Characters.java
│  │     │     ├─ Numbers.java
│  │     │     └─ SpecialChars.java
│  │     └─ GeneratorMaster.java
│  └─ resources/
│     └─ com/daknight/generator/logindatagenerator/
│        └─ layout.fxml

```

---

## ✅ Future Improvements

* Option to include special characters in passwords
* Password strength indicator
* Save login data to local file
* Dark mode toggle

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🙋‍♂️ Author

**DK-DaKnight**
GitHub: [DK-DaKnight](https://github.com/yourusername)