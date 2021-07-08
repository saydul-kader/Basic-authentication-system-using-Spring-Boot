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

![index](https://user-images.githubusercontent.com/64978219/124875329-962ffa00-dfea-11eb-8604-44687b87a14d.JPG)

Login and Registration page:
Can be accessed by anyone.<br>

![login](https://user-images.githubusercontent.com/64978219/124875673-fd4dae80-dfea-11eb-85b6-b9618049b518.JPG)

![Registration](https://user-images.githubusercontent.com/64978219/124875693-02126280-dfeb-11eb-99e8-5b222cf347ef.JPG)
Courses page:
When any user tries to click in the "Free Course" link or access to "/courses", he will be redirected to the "Courses" page. But to access this page authorization is required. Users are needed to be logged in to access this page. Otherwise they will be redirected to the Login page.

![courses](https://user-images.githubusercontent.com/64978219/124876229-954b9800-dfeb-11eb-9507-b8894ec4d6a8.JPG)

MySQL database:
This is where the information of the users are stored.

![MySQL](https://user-images.githubusercontent.com/64978219/124877281-be205d00-dfec-11eb-907b-2c1dd922a79c.JPG)


