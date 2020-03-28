<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>

<head>
    <title>Homework 2</title>
    <style>
        table {
            font-family: Times New Roman, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 2px solid #cccccc;
            text-align: left;
            padding: 9px;
        }

        tr:nth-child(odd) {
            background-color: #eeeeee;
        }
    </style>
</head>
<body>

<h2>Items For Store</h2>

<table>
    <tr>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>
    </tr>
    <c:forEach var = "list" items = "${itemlist}">
        <tr>
            <td>${list.description}</td>
            <td>${list.price}</td>
            <td>${list.color}</td>
        </tr>
    </c:forEach>
</table>
ww
</body>
</html>
