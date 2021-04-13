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
    <script src="${pageContext.request.contextPath}/js/quiz.js"></script>
        <div id="wrapper">
             <div id="header">
                <div id="header_menu">
                   <h1><a href="<c:url value='/' />">クイズアプリケーション</a></h1>
                </div>
                     <div id="login">
                         <a href="<c:url value='/quizes/login' />">管理者の方はこちら</a>
                     </div>
             </div>
        </div>
             <div id="content">
                  ${param.content}
             </div>
             <div id="footer">
                  by Local User
             </div>
    </body>
</html>