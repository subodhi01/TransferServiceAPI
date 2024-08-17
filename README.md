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
   java -cp target/classes com.example.transferapi.controller.TransferController

   ```

5.**Run the tests:**

   ```bash
   mvn test
   ```

## API Endpoints

- **POST /transfer**: Initiates a fund transfer between two accounts.

## Usage

To use the API, send a POST request to the `/transfer` endpoint with the necessary payload.

## Testing

The project includes a basic test suite in `TransferServiceTest.java` to verify the functionality of the transfer service. You can run the tests using the `mvn test` command.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
  

