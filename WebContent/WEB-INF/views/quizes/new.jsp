<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/kanri_app.jsp">
    <c:param name="content">
          <h2>クイズ  新規作成ページ</h2>


          <form method="POST" action="<c:url value='/quizes/create' />">
                <c:import url="_form.jsp" />
          </form>


          <p><a href="<c:url value='/quizes/index' />">一覧に戻る</a></p>
    </c:param>
</c:import>