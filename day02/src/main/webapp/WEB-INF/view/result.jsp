<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- <%@ taglib prefix="c" uri="jakarta.core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Result Page</h1>
	<%-- <p>userName : <%= request.getParameter("userName") %></p>
	<p>userAge : <%= request.getParameter("userAge") %></p> --%>
	
	<%-- ${}는 EL 표현식이다.
	서블릿에서 request 객체에 setAttribute로 담은 데이터로 꺼낼 수 있다--%>
	<p>userName : ${userName} </p>
	<p>userAge : ${userAge}</p>
	
	<%-- <p>name : <c:out value="${userName}"/></p>
	<p>age : <c:out value="${userAge}"/></p> --%>
	
	<c:if test="${userAge > 5}">
		<c:out value="${userName}"/> 님의 나이는 5살을 초과하였습니다.</c>
	</c:if>
</body>
</html>