<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all contacts</title>
</head>
<body>

<h2>All Contacts</h2>
    <table>
    <tr >
      <th>firstName</th>
        <th>lastName</th>
          <th>Email</th>
            <th>Mobile</th>
            <th >Source</th>
           <th>Billing</th> 
    </tr>
    <c:forEach var="Contact" items="${Contacts1}">
    <tr>
        <td>${Contact.firstName}</td>  
        <td>${Contact.lastName }</td> 
        <td>${Contact.email }</td>
        <td>${Contact.mobile }</td>
        <td>${Contact.source }</td>
        <td><a href="/zohocrmapp1/generateBill?id=${Contact.id}">billing</a></td>
       
       </tr>
    </c:forEach>
    
  </table>
</body>
</html>