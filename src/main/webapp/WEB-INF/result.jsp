<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet"
                integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
                crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">

    <h2>Submitted Results</h2> 
    <%-- <p>Name: <c:out value="${sessionScope.name}"/></p>
    <p>Location: <c:out value="${sessionScope.location}"/></p>
    <p>Location: <c:out value="${sessionScope.location}"/></p>
    <p>Comment: <c:out value="${sessionScope.comment}"/></p> --%>
    <p>Name: <c:out value="${result.name}"/></p>
    <p>Location: <c:out value="${result.location}"/></p>
    <p>Location: <c:out value="${result.language}"/></p>
    <p>Comment: <c:out value="${result.comment}"/></p>
</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
        crossorigin="anonymous"></script>
</body>
</html>