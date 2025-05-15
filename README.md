## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

uses jsoup libary
Write up:
WEBSCRAPER 
2025 CLHS CYbersecrity
- EASTERN NGUYEN
WebScraping and Web Cracking:
Webscraping is using tools to extract data or content from a website and then the information is collected to be formatted to be easier for the user. It typically involves writing code to that sends web requests to web pages and retrieves HTML content. Some examples of web scraping are collecting prices of products from e-commerce, compiling statistics or scores, and viewing stock prices. Web cracking can be refered to as using a tool or code to crack passwords. It tries different combinations of emails and passwords in order to login into a website.
Description:
In my project, it extracts data from wikipedia's top 100 singles of 2024 and prints out the song name along with the artist. It uses the Jsoup program in order to connect to the url and extract content from the website's table which than pulls data from each of the table's rows.
Use:
In order to use this program, you just run the code in VS code as it will not compile in the terminal as there are some problems with the imports but does not affect the functionality. Some dependencies are that the code as to reference the Jsoup jar files in order for this to work.
Research:
https://jsoup.org
https://www.youtube.com/watch?v=tI1qGwhn_bs
To begin my research process, I initally was looking at the Spotify API and its documentation on the developers website to try and understand how I could use this for my intial intention of this project. After figuring out that I did not fully understand how to use the API and watching videos, I decided to use JSOUP after being recommended by a friend. In order to understand how to use this program, I watched a youtube video which uses Jsoup to web scrap and read the documentation of Jsoup on its website. I also had to do a little of learning to see how HTML is structured so I could figure out what data from the website I specifically wanted to be extracted.
