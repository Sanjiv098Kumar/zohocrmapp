<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
     <h2>Compose Email</h2>
     <form action="triggerEmail" method="post">
     <pre>
     To<input type="text" name="to" value="${email}"/>
     Subject<input type="text" name="sub"/>
     Content<textarea name="content">
     
     </textarea>
     <input type="submit" value="sendEmail"/>
     </pre>
       ${msg}
     </form>
   
</body>
</html>