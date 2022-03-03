# Calero-MSDL

End to End user Journey automation, where user is placing order with two devices. 

## Tech Stack
- Java 8 - Used for programming/automating the testcase.
- Maven - Build automation tool.
- Page Object Model (POM) - Design pattern POM used for the automation, POM is used as it provides easy scalabilty and maintainability.
- Cucmber - Used to support Behaviour Driven Development(BDD).
- Gherkin - Lanuage used to develope tests in Cucumber.
- Junit - Unit testing framework 

## Getting Started
- Download or clone the project.
- Open the project using UDE (Intellij or Eclipse)
- Once project is loaded open TestRunner.Java file. (Located ./src/test/runner) 
- Run the TestRunner class by clicking on the Green run button next to it.

## What does the test do
This test runs e2e journey/workflow of a user who is placing an order and completing the order by making payment. 
Test starts with taking user to the website than adds two items from different categories in the cart, verify the contains of the cart and then proceed for the payment.  


