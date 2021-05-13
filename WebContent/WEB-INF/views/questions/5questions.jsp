<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="../layout/app.jsp">
    <c:param name="content">

        <c:forEach var="i" begin="1" end="${questions.size()}" step="1">
        <div id="5questions_${i}">
        <h2>Q：<c:out value="${i}" />&nbsp;&nbsp;<c:out value="${questions[i - 1].quiz}" /></h2>
        <br /><br />



        <label for="user_answer">答え</label><br />
        <input type="text" id="user_answer_${i}" value="${user_answer}" />
        <br /><br />


        <input type="hidden" id="questions_answer_${i}" value="${questions[i - 1].answer}" />
        <button onclick="check_answer_${i}()">解答</button>
        </div>
        </c:forEach>
        <br /><br />
        （答えは全て全角で入力してください)



<script>
var quizIndex = 0;
var right_ans = 0;


      function check_answer_1(){
          if(!document.getElementById)return;
            var ans = document.getElementById("questions_answer_1").value;
            var u_ans = document.getElementById("user_answer_1").value;
            if(u_ans == ans){
            	++right_ans;
                window.alert('正解' + '正解数' + right_ans);
            }else{
                window.alert('不正解。正解は' + ans + 'です。');
            }
            quizIndex++;
        }

      function check_answer_2(){
          if(!document.getElementById)return;
            var ans = document.getElementById("questions_answer_2").value;
            var u_ans = document.getElementById("user_answer_2").value;
            if(u_ans == ans){
                ++right_ans;
                window.alert('正解' + '正解数' + right_ans);
            }else{
                window.alert('不正解。正解は' + ans + 'です。');
            }
            quizIndex++;
        }

      function check_answer_3(){
          if(!document.getElementById)return;
            var ans = document.getElementById("questions_answer_3").value;
            var u_ans = document.getElementById("user_answer_3").value;
            if(u_ans == ans){
                ++right_ans;
                window.alert('正解' + '正解数' + right_ans);
            }else{
                window.alert('不正解。正解は' + ans + 'です。');
            }
            quizIndex++;
        }

      function check_answer_4(){
          if(!document.getElementById)return;
            var ans = document.getElementById("questions_answer_4").value;
            var u_ans = document.getElementById("user_answer_4").value;
            if(u_ans == ans){
                ++right_ans;
                window.alert('正解' + '正解数' + right_ans);
            }else{
                window.alert('不正解。正解は' + ans + 'です。');
            }
            quizIndex++;
        }

      function check_answer_5(){
          if(!document.getElementById)return;
            var ans = document.getElementById("questions_answer_5").value;
            var u_ans = document.getElementById("user_answer_5").value;
            if(u_ans == ans){
                ++right_ans;
                window.alert('正解' + '正解数' + right_ans);
            }else{
                window.alert('不正解。正解は' + ans + 'です。');
            }
            quizIndex++;
        }
</script>

    </c:param>
</c:import>