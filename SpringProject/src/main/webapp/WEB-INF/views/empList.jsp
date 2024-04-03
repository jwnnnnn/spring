<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 사원 조회</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>사원번호</th>
				<th>이름</th>
				<th>이메일</th>
				<th>입사일자</th>
				<th>업무</th>
			</tr>
		</thead>

		<tbody>
			<!-- 1.순환형태(향상된 for of) 
			2.begin, and  -->
			<!-- addAttribute에 담긴 대상 -->
			<!-- 반복문 안에서 사용할 임시변수 (el 필요없음) -->
			<c:forEach items="${empList }" var="info">
				
				<tr><!-- 자바가 가지고 있는 변수를 알려주기 위해서 el var. 붙여서 써야됨 
						VO 클래스가 가지고 있는 getter를 불러오는 것임.	-->
					<td>${info.employeeId }</td>
					<td>${info.lastName }</td>
					<td>${info.email }</td>
					<td>${info.hireDate }</td>
					<td>${info.jobId }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>