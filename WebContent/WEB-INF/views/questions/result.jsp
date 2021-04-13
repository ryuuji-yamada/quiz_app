<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
         正解は<c:out value="${questions_answer}" />です。
         <br /><br />

         あなたの答え：<c:out value="${user_answer}" />
         <br /><br />

         <c:choose>
             <c:when test="${questions_answer == user_answer }">
               <div id="flush_success">
                 <div id="answer_result">
                 お見事！正解です。
                 </div>
               </div>
             </c:when>
             <c:otherwise>
               <div id="flush_error">
                <div id="answer_result">
                残念、不正解です。
                </div>
               </div>
             </c:otherwise>
         </c:choose>
         <br />
         <p><a href="<c:url value='/questions' />">再びクイズに挑戦する</a></p>
    </c:param>
</c:import>