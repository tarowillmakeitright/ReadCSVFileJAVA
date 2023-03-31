<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
 <%
 List<Sales> list=(List<Sales>)application.getAttribute("list");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr><th>年度</th><th>SalesA</th><th>SalesB</th></tr>
<%for(Sales s:list){%>
<tr><td><%=s.getYear() %></td><td><%=s.getSalesA() %></td><td><%=s.getSalesB() %></td><tr>
<%} %>
</table>
</body>
</html>