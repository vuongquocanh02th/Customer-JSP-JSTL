<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Danh sách khách hàng</title>
  <style>
    table {
      width: 80%;
      border-collapse: collapse;
      margin: 20px auto;
    }
    th, td {
      border: 1px solid #ddd;
      padding: 10px;
      text-align: center;
    }
    th {
      background-color: #f2f2f2;
    }
    img {
      width: 80px;
      height: 80px;
    }
  </style>
</head>
<body>
<h1 style="text-align:center;">Danh sách khách hàng</h1>
<table>
  <tr>
    <th>Tên</th>
    <th>Ngày sinh</th>
    <th>Địa chỉ</th>
    <th>Ảnh</th>
  </tr>
  <c:forEach var="customer" items="${customerList}">
    <tr>
      <td>${customer.name}</td>
      <td>${customer.dob}</td>
      <td>${customer.address}</td>
      <td>
        <img src="${customer.image}" alt="Customer Image"/>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>