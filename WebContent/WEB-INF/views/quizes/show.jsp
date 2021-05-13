<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/kanri_app.jsp">
      <c:param name="content">
           <c:choose>
                 <c:when test="${quiz != null}">
                       <h2>id：${quiz.id}のクイズ詳細</h2>

                       <table>
                            <tbody>
                                 <tr>
                                       <th>クイズ番号</th>
                                       <td><c:out value="${quiz.code}" /></td>
                                 </tr>
                                 <tr>
                                       <th>クイズ</th>
                                       <td><c:out value="${quiz.quiz}" /></td>
                                 </tr>
                                 <tr>
                                       <th>答え</th>
                                       <td><c:out value="${quiz.answer}" /></td>
                                 </tr>
                            </tbody>
                       </table>


                       <p><a href="<c:url value='/quizes/edit?id=${quiz.id}' />">クイズ内容を編集する</a></p>
                 </c:when>
                 <c:otherwise>
                      <h2>お探しのクイズは見つかりませんでした</h2>
                 </c:otherwise>
           </c:choose>
           <br /><br />
           <p><a href="<c:url value='/quizes/index' />">一覧に戻る</a></p>
      </c:param>
</c:import>