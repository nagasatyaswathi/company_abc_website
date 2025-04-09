# Company ABC Website

This project is a web application for Company ABC that includes a responsive landing page and a Content Management System (CMS) for managing the main heading of the website. The application is built using Spring Boot for the backend, MySQL for the database, and HTML, CSS, and JavaScript for the frontend.

## Features

- Responsive landing page that displays dynamic content.
- CMS page for updating the main heading of the website.
- RESTful APIs for retrieving and updating the heading text.
- MySQL database for storing the heading text.

## Technologies Used

- **Backend**: Java, Spring Boot, Hibernate
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL
- **Build Tool**: Maven
  
### Database Setup

1. Create a MySQL database named `company_abc`.
2. Run the SQL script in `/sql/schema.sql` to set up the database.

### Configuration

1. Clone the repository:
2.Update src/main/resources/application.properties with your database credentials.

*Running the Application

1.Start the application:
  mvn spring-boot:run
2.Access the landing page at http://localhost:8080 and the CMS at http://localhost:8080/cms.html.

*API Endpoints

GET /api/heading: Retrieve the current heading.
POST /api/heading: Update the heading (JSON body: {"headingText": "New Heading"}).

*Contributing

Contributions are welcome! Please submit a pull request or open an issue.

*License

This project is licensed under the MIT License.
