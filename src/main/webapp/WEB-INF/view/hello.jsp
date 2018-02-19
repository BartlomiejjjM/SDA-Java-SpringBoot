<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Hello Facebook</title>
</head>
<body>
<h3>Hello, ${facebookProfile.firstName} ${facebookProfile.lastName}!</h3>

<h4>Here is your feed:</h4>

<div>
    <c:forEach items="${feed}" var="post">
        <div>
                ${post.from.name}<br/>
                ${post.message}<br/>
            <img src="${post.picture}"/>
            <hr/>
        </div>
    </c:forEach>
</div>
</body>
</html>