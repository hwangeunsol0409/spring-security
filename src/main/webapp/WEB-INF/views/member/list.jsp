<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h1>회원목록페이지입니다.</h1>
 	<div>
	 	<table>
			<c:forEach items="${list}" var="board">
				<tr>
					<td>이름 : <c:out value="${board.name}"/></td>
					                  
					<td>생년월일 : 
						<fmt:parseDate value="${board.br}" var="br" pattern="yyyy-MM-dd"/>
						<fmt:formatDate value="${br}"  pattern="yyyy년 MM월 dd일"/>
					</td>
					<td>아이디 : <c:out value="${board.id}"/></td>
					<td>비밀번호 : <c:out value="${board.pass}"/></td>
				</tr>
			</c:forEach>
		</table>
		<button onclick="location.href='/member/log'">회원가입</button>
	</div>
</body>
</html>