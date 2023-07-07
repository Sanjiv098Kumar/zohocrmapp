<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Created</title>
</head>
<body>
    <h2>Your bill</h2>
     
       <pre>
         FirstName<input type="text" name="firstName " value="${bill.firstName }"  />
         LastName <input type="text" name="lastName" value="${bill.lastName } " />
         Email    <input type="text" name="email"    value="${bill.email }" />
         Mobile   <input type="text" name="mobile" value="${bill.mobile }" />
         Product<input type="text" name="product">
          Amount<input type="text" name="amount" >
        
         </pre>
      
</body>
</html>