<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">
         <c:if test="${hasError}">
             <div id="flush_error">
                 ユーザーネームかパスワードが間違っています。
             </div>
         </c:if>
         <c:if test="${flush != null}">
              <div id="flush_success">
                   <c:out value="${flush}" />
              </div>
         </c:if>
         <h2>ログイン</h2>
         <form method="POST" action="<c:url value='/quizes/login' />">
         <label for="name">ユーザーネーム</label><br />
         <input type="text" name="name" value="${name}" />
         <br /><br />


         <label for="password">パスワード</label><br />
         <input type="password" name="password" value="${password}">
         <br /><br />


         <input type="hidden" name="_token" value="${_token}">
         <button type="submit">ログイン</button>
         </form>
         <br />

         <p><a href="<c:url value='/' />">TOPへ戻る</a></p>
    </c:param>
</c:import>