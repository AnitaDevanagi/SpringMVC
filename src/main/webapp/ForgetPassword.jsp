<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
      #header{
          background-color:yellow;
          padding:9px;
      }
      #header table{
          width:100%;
      }
       
       #data a{
          float:right;
          margin-right:8px;
          padding:3px;
       } 
       
      }
</style>
</head>
<body>
  <div id="header">
  <table>
         <tr>
            <td> <h2>MyApp</h2></td>
             <td id="data"><a href="index.jsp">SignUp</a>
             <a href="LogIn">SignIn</a></td>
          </tr>
     </table>
     </div>
       <h2>Forget Password</h2>
       
       <form action="OTP" method="post">
       <pre>
       <label>Email</label>
       <input type="email" name="email">
     
       <input type="submit" value="Send OTP"> <input type="reset" value="clear">
       </pre>
       </form>
       <h4 style="color:red">${responsemsg}</h4>
       
       <form action="forgetPassword" method="post">
       <pre>
       <label>Email</label>
       <input type="email" name="email">
       
       <label>OTP</label>
       <input type="number" name="otp">
       
       <label>New password</label>
       <input type="password" name="newpassword" >
       
       <label>Confirm NewPassword</label>
       <input type="password" name="confirmNewpassword">
       
       <input type="submit" value="submit"> <input type="reset" value="reset">
       </pre>
       </form>
</body>
</html>