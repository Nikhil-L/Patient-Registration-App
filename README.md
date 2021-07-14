# App-for-Patient-Registration

App-for-Patient-Registration is a full stack application used to help the heathcare domain user's for storing and retrieving the patient details.
It provides the space to register a patient, view all the previous registered patients and to search for a particular group of patients based on their first name.
It includes the username and password for the authenticity and FirstName, LastName, Gender, RegistrationDate and DateOfBirth for registering a patient. 

## Usage
1. Login to the webapp using the Login page.
2. On successful Login, the user will be redirected to the homepage where the default view is list of already registered patients.
3. Homepage consists of 3 navigation button those are 
    a) Patient Details to view the list of already registered patient details which also has a search option
    b) Register to register a patient
    c) Logout to logout of the app
4. The register button renders a register page to register the patient details
5. The patient details page renders a table which is a list of already registerd patient details.
6. The search option enables the user to search for the particular group of patients based on the first name.

## Project Structure
The entire project is divided into two components, separated by front end and back end.
### Front End
The front end will cover the UI interactions and sending API calls to the Rest API on user input, all while maintaining a reactive state management. 
It is designed using React JS.
### Back End
This is the Rest API developed using Swagger Schema and Jersey framework which connects with the Oracle database and fetches the required details for the specified domain

## Technology Stack
1. React JS
2. Jersey Java Framework
3. Oracle Database - Mysql
4. Testing 
   Jersey - JUnit and Mockito
   React JS - Jest and Enzyme

## Tools Used:
* Intellij
* Visual Studio
* Jenkins
* Postman
* Mysql Workbench

## Environment Setup
### Node
Download and install Node
https://nodejs.org/en/download/
### Visual Studio
Download and install Visual Studio
https://code.visualstudio.com/Download
### Eclipse IDE
Download and install Intellij IDE
https://www.jetbrains.com/idea/download/#section=windows

## Running the project
### React
1. Clone the project
    `https://github.com/Nikhil-L/Patient-Registration-App.git`
2. The react frontend code is in front end folder. Open it in VSCode.
3. Open the terminal and invoke the command `mvn spring-boot:run` to start the server.
   Backend server runs on port number 5000 in the LOCALHOST.
4. Change the directory to workflowqueue-frontend.
5. Run `npm install` to install all the dependencies.
6. Run `npm start` to start the react application.
7. React application will be running at port 3000 in the LOCALHOST.
8. Open `http://localhost:3000` via any browser to use the application.

### Jersey
1. Clone the project
    `https://github.com/Nikhil-L/Patient-Registration-App.git`
2. The Jersey Java backend files is in backend folder. Open it in IntelliJ
3. Setup tomcat server version 9
4. Run 'mvn clean install' to install all the dependencies
5. Run the tomcat server from IntelliJ
6. Open the tomcat configure path to use the application


## Testing the project
### React JS
1. Change the directory to workflowqueue-frontend.
2. Run `npm run test`.

### Jersey 
1. Change to the root directory of the project.
2. Run `mvn clean install test`.
