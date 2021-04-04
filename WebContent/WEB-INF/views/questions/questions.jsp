<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
      <c:choose>
        <c:when test="${questions.id == null}">
            <c:redirect url='/questions' />
        </c:when>
        <c:otherwise>
        <h2>Q：<c:out value="${questions.quiz}" /></h2>
        <br /><br />

      <form method="POST" action="<c:url value='questions/result' />">
        <label for="user_answer">答え</label><br />
        <input type="text" name="user_answer" value="${user_answer}" />
        <br /><br />


        <input type="hidden" name="_token" value="${_token}" />
        <input type="hidden" name="questions_answer" value="${questions.answer}" />
        <button type="submit">解答</button>
      </form>
      <p>（答えは全て全角で入力してください）</p>
      </c:otherwise>
      </c:choose>
    </c:param>
</c:import>