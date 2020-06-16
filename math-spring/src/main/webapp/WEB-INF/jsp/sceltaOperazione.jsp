<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="sceltaOperazione">
<input type="radio" value="addizione" id="addizione" name="operazione">
<label for="addizione">Addizione</label><br>
<input type="radio" value="sottrazione" id="sottrazione" name="operazione">
<label for="sottrazione">Sottrazione</label><br>
<input type="radio" value="moltiplicazione" id="moltiplicazione" name="operazione">
<label for="moltiplicazione">Moltiplicazione</label><br>
<input type="radio" value="divisione" id="divisione" name="operazione">
<label for="divisione">Divisione</label><br>
<input type="hidden" name="primoNumero" value= ${primoNumero}>
<input type="hidden" name= "secondoNumero" value= ${secondoNumero}>
<input type= "submit" value="Invio">
</form>
</body>
</html>