<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${errors != null}">
    <div id="flush_error">
          入力内容にエラーがあります<br />
          <c:forEach var="error" items="${errors}">
              ・<c:out value="${error}" /><br />
          </c:forEach>


    </div>
</c:if>
<label for="quiz">クイズ</label><br />
<textarea name="quiz" rows="10" cols="20">${quiz.quiz}</textarea>
<br /><br />


<label for="answer">答え</label><br />
<input type="text" name="answer" value="${quiz.answer}" />
<br /><br />


<input type="hidden" name="_token" value="${_token}" />
<button type="submit">クイズ作成</button>