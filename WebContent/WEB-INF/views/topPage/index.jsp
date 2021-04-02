<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
     <c:param name="content">
           <h2>クイズアプリケーション  TOPページ</h2>
           <br /><br />


            <p><a href="<c:url value='/questions' />">クイズに挑戦する</a></p>
            <br /><br />


            <p><a href="<c:url value='/login' />">管理者の方はこちら</a></p>
     </c:param>
</c:import>