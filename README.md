# Demo-Spring-Api
This is Demo Api Creation using SpringBoot

This code is a simple Java program that uses the Spring Boot framework to run a web application.

To run the application, make sure you have Java installed on your machine and download the code.

The main class of the application is DemoApplication.java, which contains the main method that starts the application.

When you run the application, Spring Boot will automatically configure and start an embedded web server, which will serve web pages on port 8080.

You can modify the behavior of the application by adding additional configuration files or modifying the existing configuration files.

If you encounter any issues or have any questions about the code, please refer to the Spring Boot documentation or seek help from the Spring community.


UserController:

This Java class is a REST controller that handles HTTP requests related to user management. It includes two methods: addUser and getUserDetails.

The addUser method is mapped to the "/user/addUser" endpoint and takes in a User object as a request body. It calls the addUser method of a UserService instance to add the user to the application, and then saves the user to the database via a UserRepository instance. It returns a string indicating that the user was added successfully.

The getUserDetails method is mapped to the "/user/getUserDetails" endpoint and retrieves the details of a user via a UserService instance. In this implementation, it returns only the User object's name field.

This class uses Spring annotations such as @RestController, @RequestMapping, @PostMapping, and @GetMapping to define its behavior.

To use this controller in your Spring Boot application, you can inject an instance of it into your main application class or into another controller class. Then, you can make HTTP requests to the specified endpoints to add or retrieve user information.


UserService:

This Java class is a service class that handles user-related logic. It includes two methods: addUser and getUser.

The addUser method takes in a User object and sets the instance variable of the class to that object. This method can be used to add a new user to the application.

The getUser method returns the User object that is currently stored in the instance variable of the class. In this implementation, it returns the same User object that was previously added via the addUser method.

This class is annotated with @Service, which tells Spring that it should be treated as a service and be eligible for dependency injection.

To use this service in your Spring Boot application, you can inject an instance of it into your main application class or into a controller class. Then, you can call its methods to add or retrieve user information.

UserRepository:

This Java class is a repository class that handles database operations related to users. In this implementation, it includes a single save method that takes in a User object and does not perform any actual saving to a database.

This class is annotated with @Repository, which tells Spring that it should be treated as a repository and be eligible for dependency injection.

To use this repository in your Spring Boot application, you can inject an instance of it into your main application class or into a controller class. Then, you can call its methods to perform database operations related to user information.

If you encounter any issues or have any questions about the code, please refer to the Spring documentation or seek help from the Spring community.
