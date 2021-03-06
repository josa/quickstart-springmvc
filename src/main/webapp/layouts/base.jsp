<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>
	<spring:message code="base.title"/>
</title>
</head>
<body>
	<div class="container">
    <div class="page-header">
      <small class="muted-light pull-right">
      	Language : 
      	<a href="?language=en">
      		<spring:message code="base.english" /> 
      	</a> 
      	| 
      	<a href="?language=pt_BR"> 
      		<spring:message code="base.portuguese" /> 
      	</a>
      </small>
      <h1><spring:message code="base.title"/></h1>
      <h2>
      	<tiles:getAsString name="title" />
      </h2>
    </div>
		<tiles:insertAttribute name="body" />
	</div>
</body>
</html>