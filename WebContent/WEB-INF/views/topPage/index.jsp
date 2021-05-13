<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
     <c:param name="content">
           <h2 id="top_deco">クイズアプリケーション  TOPページ</h2>
           <br /><br />


            <a class="quiz_option" onclick="showHide('option')">クイズに挑戦する</a>
            <div id="option">
            <ul>
               <li><div id="option_li"><a href="<c:url value='/questions' />">一問一答モード</a></div></li>
               <li><div id="option_li"><a href="<c:url value='/5questions' />">５問モード(調整中)</a></div></li>
            </ul>
            </div>

     </c:param>
</c:import>