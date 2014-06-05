<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<table align="center">
   <tr>
     <td>
      <form action="testRegister.action">
                  用&nbsp;户&nbsp;名：<input type="text" name="user.userid"/><font color="red">*</font><br/><br/>
                  真实姓名：<input type="text" name="user.name"/><font color="red">*</font><br/><br/>
                  注册密码：<input type="password" name="user.password"/><font color="red">*</font><br/><br/>
                  确认密码：<input type="password" name="re_password"/><font color="red">*</font><br/><br/>
                  工作单位：<input type="text" name="user.department"/><font color="red">*</font><br/><br/>      
                  是会员吗？<input type="radio" name="user.adminFlag" value="Y"/>是
        <input type="radio" name="user.adminFlag" value="N"/>否<br/><br/> 
        <input type="submit" name="提交"/>
      </form>
     </td>   
   </tr>
</table>
</body>
</html>