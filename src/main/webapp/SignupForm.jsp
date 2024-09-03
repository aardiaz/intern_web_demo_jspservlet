<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup</title>
</head>
<body>

     <h1> User Signup </h1>
     <hr>
     
      <a href="index.jsp"> Back </a>
      
      <form action="SignupServlet" method="post">
      
             FirstName <input type="text"     name="fname">     <br><br>
             LastName <input type="text"     name="lname">     <br><br>
             UserName <input type="text"     name="username">     <br><br>
             Password <input type="password" name="password"> <br><br>
             
                     <input type="submit" value="Signup">
      </form>

</body>
</html>