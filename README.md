# qa-selenium-ui-automation
UI automation testing project using Selenium, TestNG, and Java, focusing on scalable test design, Page Object Model, and best practices.


# Selenium UI Automation Project

This project demonstrates UI automation testing using Selenium WebDriver with Java and TestNG. It focuses on building a clean, scalable, and maintainable automation framework following best practices used in real-world QA engineering.

---

## 🚀 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- WebDriverManager
- Maven

---

## 📁 Project Structure
src
└── test
└── java
└── com.dikara.ui
├── base
│ └── BaseTestUI.java
├── tests
│ └── LoginTest.java
└── pages (coming soon)


---

## 🧪 Features

- Automated UI testing using Selenium WebDriver
- Cross-browser setup with WebDriverManager
- Test execution with TestNG
- Clean test structure with reusable base class
- Ready for Page Object Model (POM) implementation

---

## ⚙️ Setup Instructions

### 1. Clone the repository
git clone https://github.com/your-username/selenium-ui-automation.git

### 2. Open in IDE

Recommended:
- IntelliJ IDEA
- Eclipse

### 3. Install dependencies

Maven will automatically install dependencies:
mvn clean install


---

## ▶️ Run Tests

Using Maven:
mvn test


Or run directly from TestNG in your IDE.

---

## 🧪 Sample Test Case

Login test using https://www.saucedemo.com:

- Input username and password
- Click login button
- Validate successful login

---

## 🧠 Best Practices Applied

- Separation of test setup using BaseTest class
- Avoid hardcoded drivers using WebDriverManager
- Clean locator usage (prefer ID over XPath)
- Scalable structure for future enhancements

---

## 🔥 Roadmap

- [ ] Page Object Model (POM)
- [ ] Explicit Wait implementation
- [ ] Negative test scenarios
- [ ] Data-driven testing
- [ ] Test reporting (Allure)
- [ ] CI/CD integration

---

## 👤 Author

Dikara Derandia

---

## 📌 Notes

This project is part of a QA Automation learning journey, focusing on building real-world skills for UI testing and automation engineering roles.

