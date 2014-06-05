<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.buju{
   color:black;
   
     }
a{text-decoration:none;}
</style>
  </head>  
  <body>
    <table align="center" border="0px" width="687px" height="400px">
       <tr>
          <td align="center" height="250px"><img src="images/left_img.jpg"></td>
          <td>     
             <form action="testlogin.action">            
                                            用户名:<input type="text" name="user.userid"/><br/><br/>
                                            密&nbsp;&nbsp;码:<input type="password" name="user.password"/><br/><br/>
                <input type="checkbox" name="auto_login"/>下次自动登录<br/><br/>                
                    <input type="submit"/><a href="">忘记密码？</a><br/><br/>
                                           没有账号？&nbsp;&nbsp;<font size="4" color="blue">
                                           <a href="jsp/register.jsp">立即注册</a></font>            
             </form>           
          </td>
       </tr>
       <tr>
         <td colspan="2" background="images/bottom_bg.png" align="center" height="50px">
             <div class="buju">
                <a href="">科学技术部&nbsp;&nbsp;|</a><a href="">&nbsp;&nbsp;黑龙江省科学技术厅&nbsp;&nbsp;|</a>
                <a href="">&nbsp;&nbsp;黑龙江典型产业集包群科技服务平台</a>
             </div>
             <p align="center">黑龙江省科技特派员工作网 @版权所有&nbsp;&nbsp;联系电话：0451-51920656
         </td>
       </tr>
    </table>   
  </body>
</html>
