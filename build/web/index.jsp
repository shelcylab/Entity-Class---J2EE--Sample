<%-- 
    Document   : index
    Created on : 15 Mar, 2021, 5:31:29 PM
    Author     : shelc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>JSP </title>

    </head>

    <body>

        <h1>Add your books here!</h1>

        <form action="BookServlet" method="POST">

            Book name:-<input type="text" name="book" value="" size="40" /><br>

            Author:-<input type="text" name="author" value="" size="20" /><br>

            <input type="submit" value="Add Fields" name="add" /><br>

        </form>

        <form action="ListServlet" method="POST">

            <input type="submit" value="display" name="display" /><br>

        </form>

        <br>

        <form action="RemoveServlet" method="POST">

            Enter Book Id:-<input type="text" name="id" value="" size="20" /><br>

            <input type="submit" value="Delete Book" name="delete" /><br>

        </form>

    </form> 

</body>
</html>
