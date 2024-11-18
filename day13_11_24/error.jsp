<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error - Educational Institution</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="container">
    <h1>Error</h1>
    <p style="color: red;">
        <%
        // Retrieve the error message from the request
        String errorMessage = (String) request.getAttribute("errorMessage");
        if (errorMessage != null) {
        out.print(errorMessage);
        }
        %>
    </p>
    <p><a href="login.jsp">Go back to login page</a></p>
</div>
</body>
</html>

