<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<style type="text/css">
     #header{
       background-color:lightblue;
       padding:15px;
       } 
       
       #header a{
        color:black;
        float:right;
        margin-right: 15px;
       }
       #header table{
         width:100%;
      }
      #register{
        text-align: center;
      }
      .id{
      background-color:fuchsia;
      }
      #login a{
           float:right;
      }
     #loginTwo a{
       float:right;
     }
     }  
</style>
</head>
    <body  class="bg">
        <div id="header">
        <table>
        <tr>
        <td> <h2>MyApp</h2></td>
         <td id="login"> <a href="LogIn.jsp">LogIn</a>
         <a href="ForgetPassword.jsp">Forget Password</a></td>
        
        </tr>
        </table>
       </div>
       <h2>SignUp</h2> 
      
         <form action="register" method="post" >
         <pre>
         <label>Name</label>
         <input type="text" name="name">
         
         <label>LastName</label>
         <input type="text" name="lastname">
         
         <label>Email</label>
         <input type="email" name="email">
         
         <label>Password</label>
         <input type="password" name="password">
         
         <label>confirm Password</label>
         <input type="password" name="cofmpassword">
         
         <label>PhoneNumber</label>
         <input type="tel" name="contact">
         
         <label>address</label>
         <textarea name="address" rows="4" cols="15"></textarea>
         
         <label>Gender</label>
         <input type="radio" name="gender" value="Male">Male
         <input type="radio" name="gender" value="female">Female
         <input type="radio" name="gender" value="other">Other
         
         <label>Technical Skills</label>
          <input type="checkbox"  name="technicalSkills" value="java">Java
          <input type="checkbox" name="technicalSkills" value="HTML">HTML
          <input type="checkbox" name="technicalSkills" value="CSS">CSS
          <input type="checkbox"  name="technicalSkills" value="Java Script">JavaScript
         
         <input type="submit"  value="submit">
         
         <input type="reset" value="reset">
         
         </pre>
          </form>
  </body>
</html>
