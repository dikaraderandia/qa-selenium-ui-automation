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
└── test
└── java
└── com.dikara.ui
├── base
│ └── BaseTestUI.java
├── pages
│ ├── LoginPage.java
│ ├── InventoryPage.java
│ └── CartPage.java
├── tests
│ └── LoginTest.java
├── listeners
│ └── TestListener.java
├── utils
│ └── ScreenshotUtil.java
└── screenshots


---

## 🧪 Features

- Automated UI testing using Selenium WebDriver
- Implemented Page Object Model (POM) for better maintainability and reusable page actions
- Automated end-to-end user scenarios including:
    - Login
    - Negative login validation
    - Add-to-cart functionality
- Applied Explicit Wait for better test stability and synchronization
- Implemented data-driven testing using TestNG DataProvider
- Automated screenshot capture on test failure using TestNG Listener
- UI validation using assertions and dynamic element handling
- Cross-browser setup using WebDriverManager
- Clean and scalable test structure

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

- Successful login validation
- Invalid login validation
- Add product to cart
- Multi-page navigation validation
- Data-driven login testing
- Screenshot capture on failed test execution
---

## 🧠 Best Practices Applied

- Separation of concerns using BaseTest and Page Object Model
- Reusable page methods for better maintainability
- Explicit Wait implementation instead of Thread.sleep
- Stable locator strategy (ID and CSS Selector prioritization)
- Data-driven testing with TestNG DataProvider
- Failure handling using TestNG Listener and screenshot utility
- Modular and scalable automation framework structure

---

## 🔥 Roadmap

- [x] Page Object Model (POM)
- [x] Explicit Wait implementation
- [x] Negative test scenarios
- [x] Data-driven testing
- [x] Screenshot On Failure
- [ ] Test reporting (Allure)
- [ ] Parallel test execution
- [ ] CI/CD integration
- [ ] Cross-browser execution

---

## 👤 Author

Dikara Derandia

---

## 📌 Notes

This project is part of a QA Automation learning journey, focusing on building real-world skills for UI testing and automation engineering roles.

