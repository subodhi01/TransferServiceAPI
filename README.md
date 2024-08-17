# Transfer API

This project is a simple RESTful API implemented in Java to handle fund transfers between accounts. It includes a basic setup for account management, transactions, and testing. 

## Project Structure

- **model/**: Contains the data models for `Account` and `Transaction`.
- **service/**: Contains the business logic for transferring funds.
- **controller/**: Handles user input and interacts with the service.
- **TransferServiceTest.java**: Contains JUnit tests for verifying the functionality of the transfer service.

## Requirements

- Java 11 or higher
- JUnit 5 (for testing)

## Setup and Run

1. **Clone the repository:**

   ```bash
   git clone <https://github.com/subodhi01/TransferServiceAPI>
   ```

2. **Navigate to the project directory:**

   ```bash
   cd TransferServiceAPI
   ```

3. **Build the project:**

   ```bash
   mvn clean install
   ```

4. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

5. **Access the API:**

   The API will be available at `http://localhost:8080` by default.

## API Endpoints

- **POST /accounts**: Create a new account.
  

