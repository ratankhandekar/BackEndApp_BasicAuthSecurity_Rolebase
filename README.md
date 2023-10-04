# MyAppSecurity_Auth

## Description of Project
-  Authentication Overview
-  Auth is the most basic option to secure the REST APIs. 
-  Auth uses an HTTP header in order to provide the username and password when making a request to a server. 
-  Auth uses **Base 64 encoded** username and password in the header. with **BCryptPasswordEncoder**
-  Authentication DO NOT use cookies, hence there is no concept of a session or logging out a user, which means each request has to carry that header in order to be authenticated.

 ## OUTPUT on Postman: 
 ![BasicAuthPostman](https://github.com/ratankhandekar/BackEndApp_BasicAuthSecurity_Rolebase/assets/67790363/4ed435df-3662-4366-b6f0-785fe9d9f6f5)



### Thank you
