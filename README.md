# GrowAI Cucumber Selenium Java Project

## Project Overview

This project is an Automation Testing Framework built using:

* Java
* Selenium WebDriver
* Cucumber (BDD)
* TestNG
* Maven

The framework automates Login Functionality test scenarios using Behavior Driven Development (BDD) with Cucumber feature files.

---

# Project Structure

```text
GrowAI_Cucumber_Selenium_Project_Snehal_Manjarekar
│
├── pom.xml
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── base
│   │   │   │   └── BaseClass.java
│   │   │   ├── pages
│   │   │   │   └── LoginPage.java
│   │   │   ├── runner
│   │   │   │   └── TestRunner.java
│   │   │   └── steps
│   │   │       └── LoginSteps.java
│   │   │
│   │   └── resources
│   │       └── features
│   │           └── Login Functionality.feature
│
└── target
```

---

# Technologies Used

| Technology         | Purpose                              |
| ------------------ | ------------------------------------ |
| Java               | Programming Language                 |
| Selenium WebDriver | Browser Automation                   |
| ChromeDriver       | Browser Driver for Chrome Automation |
| Cucumber           | BDD Framework                        |
| TestNG             | Test Execution                       |
| Maven              | Dependency Management                |

---

# Test Scenarios Covered

## Valid Login

* Enter valid username and password
* Verify Secure Area page is displayed

## Invalid Login

* Enter invalid username and password
* Verify error message is displayed

## Blank Login

* Keep username and password blank
* Verify validation/error message is displayed

---

# Prerequisites

Before running the project, install the following:

* Java JDK 17 or above
* Maven
* IntelliJ IDEA / Eclipse
* Google Chrome Browser
* ChromeDriver compatible with browser version

---

# Dependencies

Dependencies are managed through the `pom.xml` file.

Main dependencies used:

* Selenium Java
* Cucumber Java
* Cucumber TestNG
* TestNG

---

# How to Run the Project

## Using IntelliJ IDEA

1. Open the project in IntelliJ IDEA
2. Wait for Maven dependencies to download
3. Open:

```text
src/test/java/runner/TestRunner.java
```

4. Right click on `TestRunner`
5. Click **Run TestRunner**

---

## Using Maven Command

Run the following command from the project root directory:

```bash
mvn test
```

---

# Test Reports

After execution, the HTML report will be generated at:

```text
target/cucumber-report.html
```

Open the report in any browser to view execution results.

---

# Feature File Example

```gherkin
Scenario Outline: Valid Login

Given the user navigates to the login page
When enter valid "<username>" and "<password>"
And click login button
Then Secure Area page should display
```

---

# Author

**Snehal Manjarekar**
