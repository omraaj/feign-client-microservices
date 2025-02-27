


# Feign Client Microservices

This project demonstrates the use of Spring Boot microservices with Eureka for service discovery and Feign Client for inter-service communication.

## Prerequisites

- Java 8 or higher
- Maven
- Spring Boot
- Eureka Server
-lombok

## Project Structure

- **Eureka Server**: Responsible for service discovery.
- **Book Service**: The producer service providing book-related data.
- **Student Service**: The consumer service that consumes data from the Book Service.

## Running the Application

Follow these steps to run the microservices:

1. **Start the Eureka Server**:
   - Run the application containing the Eureka Server.

2. **Start the Book Service (Producer)**:
   - Run the Book service application.

3. **Start the Student Service (Consumer)**:
   - Run the Student service application.

4. **Test the Endpoints**:
   - Open a web browser and navigate to the following URLs to test the functionality:
     - **Get Student Data**: 
       - `http://localhost:9100/student/data` 
     - **Get All Books**: 
       - `http://localhost:9100/student/allBooks`

## Expected Results

- **For `http://localhost:9100/student/data`**: You should see the data related to students as fetched from the Student service.
- **For `http://localhost:9100/student/allBooks`**: This should return a list of all books available in the Book service, as consumed by the Student service.

## License

This project is licensed under the MIT License.
