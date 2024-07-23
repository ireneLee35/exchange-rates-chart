The Exchange Rates Viewer is a Spring Boot application designed to fetch and display exchange rates for various currencies. The application scrapes data from the ESun Bank website, extracts exchange rates for five specific currencies, and presents this data in JSON format. Additionally, the application uses Bootstrap to create a responsive line chart that visualizes these exchange rates on a web page.

# Features
Data Scraping: Utilizes Jsoup to scrape exchange rate data from the ESun Bank website.
JSON API: Provides a RESTful API endpoint to serve exchange rate data in JSON format.
MVC Architecture: Follows the Model-View-Controller design pattern to separate concerns.
Data Visualization: Implements a Bootstrap Line Chart to visualize the exchange rates on the front end.
Responsive Design: Ensures the web page is responsive and user-friendly across different devices.
# Technologies Used
Spring Boot: For building the back-end application.
Jsoup: For web scraping exchange rate data.
Jackson: For JSON processing.
Thymeleaf: As the template engine for dynamic HTML generation.
Bootstrap: For responsive and aesthetic front-end design.
JavaScript: For front-end logic and chart integration.
# Project Structure
Controller: Manages incoming requests and coordinates responses with the appropriate view and model.
Service: Contains business logic for data scraping and processing.
Model: Represents the data structure of exchange rates.
View: Utilizes Thymeleaf templates and Bootstrap for rendering HTML and charts.
# API Endpoints
GET /api/exchange-rates: Retrieves the latest exchange rates in JSON format.

### Future Enhancements
Add more currencies: Extend the application to support additional currencies.
Historical Data: Implement functionality to display historical exchange rate data.
User Authentication: Add user authentication for secure access to certain features.
### Contributing
Feel free to fork this repository and contribute by submitting pull requests. Any improvements, bug fixes, or new features are welcome.

## License
This project is licensed under the MIT License.
