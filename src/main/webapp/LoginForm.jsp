<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

     <h1> User Login </h1>
     <hr>
     
      <a href="index.jsp"> Back </a>
      
      <form action="LoginServlet" method="post">
      
       <p style="color:red">${message}</p>
      
             UserName <input type="text"     name="username">     <br><br>
             Password <input type="password" name="password"> <br><br>
             
                     <input type="submit" value="Login">
      </form>

</body>
</html>