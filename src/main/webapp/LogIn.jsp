<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn</title>
<style type="text/css">
   #header{
       background-color:lightgreen;
       padding:15px;
      
   }
   #header a{
      float:right;
       margin-right: 10px;
       color:black; 
      
   }
   #header table{
   width:100%;
   }

</style>
</head>
<body> 


    <div id="header"><table>
    <tr>
    <td> <h1>MyApp</h1> </td>
    <td><a href="index.jsp">SignUp</a>
     <a href="ForgetPassword.jsp">Forget Password</a></td>
    </tr>
    </table>
    </div>
     <h4>${responsemsg}</h4>
   <form action="login" method="post">
   <h2>SignIn</h2>
   <pre>
     <label>Email</label>
     <input type="email" name="email">
     
     <label>Password</label>
     <input type="password" name="password">
     
     <input type="submit" value="submit"> <input type="reset" value="reset">
      </pre>
   </form>
</body>
</html>