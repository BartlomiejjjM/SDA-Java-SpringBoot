<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Hello World</title>
</head>
<body>
<h2>Players</h2>
<ul>
    <c:forEach items="${players}" var="player">
        <li>
                ${player.name} ${player.surname} plays at ${player.teamName}
        </li>
    </c:forEach>
</ul>
</body>
</html>
