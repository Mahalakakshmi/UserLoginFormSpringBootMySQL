<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<jsp:include page="welcome.jsp" />
<br><br><br><br>
<form  method="POST" action="add" >
First name:<br>
  <input type="text" name="firstname"><br>
  Last name:<br>
  <input type="text" name="lastname"><br>
  userId:<br>
  <input type="number" name="userId"><br>
  
  corporateGroupId:<br>
  <input type="number" name="corporateGroupId"><br>
  
   Email:<br>
  <input type="email" name="email"><br>
  Password:<br>
  <input type="password" name="password"><br>
  
  Account_locked :<br>
  <input type="checkbox" label="true" name="accountlocked" value="true">
  <label for="true">true</label><br>
  <input type="checkbox"  label="false"  name="accountlocked" value="false">
  <label for="false">false</label><br><br>
  
  Enabled :<br>
  <input type="checkbox" label="true" name="enabled" value="true">
   <label for="true">true</label><br>
  <input type="checkbox"  label="false"  name="enabled" value="false">
  <label for="false">false</label><br>
  
  CreatedDate :<br>
  <input type="date" name="createddate"><br>
  
  ExpiryDate :<br>
  <input type="date"  name="expirydate"><br>
  
  PostCode :<br>
  <input type="text" pattern="[A-Z][0-9]{6}" title="Five digit zip code" /><br>
  
    
</form>
</body>
</html>