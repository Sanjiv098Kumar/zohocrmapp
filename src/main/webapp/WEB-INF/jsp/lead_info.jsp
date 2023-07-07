<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ include file="menu.jsp"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead Info</h2>
 
    FirstName:${lead.firstName}<br/>
    LastName:${lead.lastName}<br/>
    email:${lead.email}<br/>
    mobile:${lead.mobile}<br/>
    source:${lead.source}<br/>
    
     <pre>
    <form action ="sendEmail" method="post">
      <input type="hidden"  name="email" value="${lead.email}">
     <input type="submit" value="sendMail">
    </form>
    <form action="convertLead" method="post">
      <input type="hidden" name="id" value="${lead.id}">
      <input type="submit" value="convert"> 
    </form>
</pre>
</body>
</html>