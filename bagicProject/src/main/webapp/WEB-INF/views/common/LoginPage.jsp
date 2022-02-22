<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	<style>
   form{
       text-align: center;
       margin:0 auto;
   }

   .border{
       margin:0 auto;
       width:400px;
       height:500px;
       border:1px solid #000;
       border-radius: 10%;
   }

   img{
       margin-top:20px;
       margin-bottom:80px;
   }

   input{
       width:300px;
   }
	</style>
	</head>
	<body>
    	<form action ="/login" method="POST">
	        <div class="border">
	            <h1>로그인</h1>
	            <img src ="/images/profle.jpg"><br>
	            <c:if test="${empty msg ? true : false}" var="result">
	            	<h2><c:out value="${msg}" /></h2>
	            </c:if>
	            <input type="text"  name="username" id="username" placeholder="아이디를 입력해주세요."><br>
	            <input type="password" name="password" id="password" placeholder="비밀번호를 입력해주세요."><br><br>
	            <input type="submit" value="로그인">
	            
	            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	        </div> 
	    </form>
	</body>
</html>