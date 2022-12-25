<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style>
    #heading{
    background-color:lightgreen;
     padding:10px;
    }
    
    #heading table{
     width:100%;
    }
    #profile a{
       float:right;
       margin-right: 10px;
       display: inline;
      
    }
  
    
  
  </style>
</head>
<body>
  <div id="heading">
   <table>
     <tr>
     <td><h2>MyApp</h2></td>
    
     <td>
            <div id="profile">
               <a href="LogIn.jsp">LogOut</a>
               <a href="getprofile/${responsemsg}">MyProfile</a>
              
           </div> 
     </td>
     
     </tr>
   
   </table>
 </div>
    
     <h4>WelCome${responsemsg}</h4>
     <h1>Profile details</h1>
     <div>Email id :${details.email}</div>
      <div>Contact : ${details.contact}</div>
     
</body>
</html>