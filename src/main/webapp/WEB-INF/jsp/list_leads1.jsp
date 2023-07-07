<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

 <%@ include file="menu.jsp"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 <a href="/zohocrmapp1/viewCreateLeadPage">   Create new Lead</a>
<h2>All leads</h2>
    <table>
    <tr >
      <th>firstName</th>
        <th>lastName</th>
          <th>Email</th>
            <th>Mobile</th>
            <th >Source</th>
    </tr>
    
  
    <c:forEach var="lead" items="${leads}">
    <tr>
        <td><a href="/zohocrmapp1/leadInfo?id=${lead.id}">${lead.firstName}</a></td>  
        <td>${lead.lastName }</td> 
        <td>${lead.email }</td>
        <td>${lead.mobile }</td>
        <td>${lead.source }</td>
       
       </tr>
    </c:forEach>
    
  </table>
</body>
</html>