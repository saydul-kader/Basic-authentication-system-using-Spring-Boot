# Basic authentication system using Spring Boot
 This is a simple authentication & authorization sytem developed with Spring Boot.
 <br>Technologies used in the Back-end:
 1. Spring Boot
 2. MySQL

Technologies used in the Front-end:
 1. HTML
 2. BootStrap

Important Dependencies:
1. Spring security - for the authorization purposes. 
2. Thymeleaf - used for the front-end.
3. Spring data JPA - to implement data repository 
4. MySQL Driver

Here is a basic overview of the project:<br>
Home page/Index page:
Anyone can access this page by going to "/" or "/index". No authorization needed.

![screencapture-file-D-SpringBoot-Projects-src-main-resources-templates-index-html-2021-07-10-23_57_58](https://user-images.githubusercontent.com/64978219/125172457-aa871900-e1db-11eb-8cc5-23e6796b8a89.png)


Login and Registration page:
Can be accessed by anyone.<br>
![log](https://user-images.githubusercontent.com/64978219/125206715-7cbcd580-e2aa-11eb-8c5c-774d3809b963.JPG)

![Register](https://user-images.githubusercontent.com/64978219/125334957-c7ebec80-e36d-11eb-8b49-a8b7d9a3c59c.JPG)

Courses page:
When any user tries to click in the "Free Course" link or access to "/courses", he will be redirected to the "Courses" page. But to access this page authorization is required. Users are needed to be logged in to access this page. Otherwise they will be redirected to the Login page.

![course](https://user-images.githubusercontent.com/64978219/125334991-d33f1800-e36d-11eb-8d86-490644ced704.JPG)

MySQL database:
This is where the information of the users are stored.

![MySQL](https://user-images.githubusercontent.com/64978219/124877281-be205d00-dfec-11eb-907b-2c1dd922a79c.JPG)


