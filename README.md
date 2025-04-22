# prog5121A1-st10443474-luke-fourie

This project implements a basic login and registration system for a Java-based chat application. It includes input validation, user feedback, authentication logic, and JUnit tests. The system is built using Maven.

##Project Structure

```
chatapp/
├── Login.java         # Handles user data, registration, and authentication
├── Main.java          # Demonstrates the usage of the Login class
├── LoginTest.java     # Unit tests using JUnit 5 for validation and login logic
├── pom.xml            # Maven configuration file for dependencies and build info
```

##Features

- **User Registration** with validation checks:
  - Username must include an underscore and be no more than 5 characters long.
  - Password must include at least 8 characters, an uppercase letter, a number, and a special character.
  - Cell number must be a South African number starting with `+27` and contain 9 to 10 digits.
- **User Login** that validates against stored credentials.
- **Custom Messages** for user feedback during registration and login.
- **JUnit Testing** for:
  - Username validity
  - Password complexity
  - Cell phone format
  - Login success/failure

##Example Usage

```java
Login login = new Login("kyl_1", "Ch&&sec@ke99!", "+27838968976", "Kyle", "Smith");

System.out.println(login.registerUser());
System.out.println(login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!"));
```

##Validation Criteria

| Field        | Validation Rule |
|--------------|------------------|
| Username     | Contains `_` and ≤ 5 characters |
| Password     | ≥ 8 characters, includes uppercase, number, and special character |
| Cell Number  | Must match `+27` followed by 9 or 10 digits |

##Unit Testing

Tests include:
- Valid and invalid usernames
- Strong and weak passwords
- Correct and incorrect cell phone numbers
- Successful and failed login attempts

JUnit 5 is used for all tests.

### Run Tests

```bash
mvn test
```

##Maven Configuration (pom.xml)

The Maven file includes:

- Project metadata
- Source encoding and Java version
- JUnit 5 dependency

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

##Requirements

- Java 17+
- Maven 3.8+
- IDE such as NetBeans or IntelliJ IDEA (recommended)


##License

Default NetBeans license (can be updated to your preferred open-source license).
