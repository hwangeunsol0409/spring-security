<%@page import="org.green.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h1>회원가입</h1>
	    
	<form class="member" method="post" action="/member/log"> 
	   <p>이름 : <input type="text" name="name" placeholder="name" /></p>
	   <p>생년월일 : <input type="date" name="br" placeholder="br" /></p>
       <p>아이디 : <input type="text" name="id" placeholder="Id" /></p>
       <p>패스워드 : <input type="password" name="pass" placeholder="Password" /></p>   
       <p><button type="submit" >등록</button></p>     
       <p><button type="reset">취소</button></p>     
    </form>
</body>
</html>