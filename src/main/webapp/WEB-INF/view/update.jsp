<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
        crossorigin="anonymous">
</head>
<body>

<h1>Edit User</h1>

<br>

<form action="/RegisterForm_JDBC/demo/editUser" method="post" class="form">
    <input type="hidden" name="id" value="${user.id}" />

    <div class="mb-3">
        <label for="fullName" class="form-label">Full Name</label>
        <input type="text" id="fullName" name="fullName" class="form-control" value="${user.fullName}"  />
    </div>

    <div class="mb-3">
        <label for="email" class="form-label">Email</label>
        <input type="email" id="email" name="email" class="form-control" value="${user.email}"  />
    </div>

    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" id="password" name="password" class="form-control" value="${user.password}" />
    </div>

    <button type="submit" class="btn btn-success">Update</button>
    <a href="/RegisterForm_JDBC/demo/users" class="btn btn-secondary">Cancel</a>
</form>

</body>
</html>
