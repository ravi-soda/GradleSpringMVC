<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<spring:url value="/resources/core/css/bootstrap.min.css" var="bootstrapCss"></spring:url>
<spring:url value="/resources/core/css/hello.css" var="helloCss"></spring:url>
<link href="${bootstrapCss}" rel="styleSheet">
<link href="${helloCss}" rel="styleSheet">
</head>
<body>
  <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Project Name</a>
    </div>
  </div>
  </nav>

  <div class="jumbotron">
    <div class="container">
      <h1>${title}</h1>
      <p>
        <c:if test="${not empty msg}">
			Hello ${msg}
		</c:if>

        <c:if test="${empty msg}">
			Welcome Welcome!
		</c:if>
      </p>
      <p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
      </p>
    </div>
  </div>
</body>
</html>