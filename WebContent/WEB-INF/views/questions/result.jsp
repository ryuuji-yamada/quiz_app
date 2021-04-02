<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
         <p>正解は<c:out value="${questions_answer}" />です。</p>
         <br />
         <p>あなたの答え：<c:out value="${user_answer}" /></p>
    </c:param>
</c:import>