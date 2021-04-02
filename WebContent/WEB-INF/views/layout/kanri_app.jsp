<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>クイズアプリケーション</title>
        <link rel="stylesheet" href="<c:url value='/css/reset.css' />">
        <link rel="stylesheet" href="<c:url value='/css/style.css' />">
    </head>
    <body>
        <div id="wrapper">
             <div id="header">
                  <h1>クイズアプリケーション</h1>&nbsp;&nbsp;&nbsp;&nbsp;
                  <c:if test="${sessionScope.name != null && sessionScope.password != null}">
                       <div id="user">
                           <a href="<c:url value='/logout' />">ログアウト</a>
                       </div>
                  </c:if>
             </div>
             <div id="content">
                  ${param.content}
             </div>
             <div id="footer">
                  by Local User
             </div>
        </div>
    </body>
</html>