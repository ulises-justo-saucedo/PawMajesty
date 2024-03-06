## PawMajesty
PawMajesty is a dynamic web were you can upload kittens with a lot amounts of money and a backstory that tells others how it got rich.
This project was created because I thought it was a funny idea to build a web like this.
PawMajesty is still under development, since it needs more validations, security and a decent frontend.

## Tools
PawMajesty is built with:
- Spring Framework core
- Servlets
- JSP
- Hibernate

Spring is used to manage the repositories and services of the project. Instead of manually managing these objects, Spring handles them with the help of the Spring Container and IoC.
PawMajesty interacts with the database using Hibernate and HQLs, following this structure: Repository -> Service -> Servlet -> JSP.
The corresponding repository uses HQLs to fetch data from the database. The service layer takes this data and performs necessary operations on it. Then, with the help of Spring, the service layer is injected into the Servlet. This allows the Servlet to retrieve the data for the user upon request.
Having many layers seems tedious, but for me is a great way of modulating the project. A workflow like this helps to separate responsabilities, guaranteeing a solid structure if the project grows or new functionalities are added.

## Set up
In order to deploy PawMajesty in your machine, make sure to use Apache Tomcat as a local server. Configure it so PawMajesty uses the port 8080 to receive requests.
You also might want to replace some properties on hibernate.cfg.xml file. There make sure to use your MySQL credentials so the project can communicate with your DBMS.
