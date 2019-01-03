<!-- Ent�te commune � toutes les pages/vues JSP. -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Ent�te d'import de classe Java permettant d'importer la d�finition d'une classe pour l'utiliser dans la page. -->
<%@ page import="java.time.LocalDate"%>
<!-- Import de la librarie JSTL core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Ent�te HTML 5 standard -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<!-- Cette balise g�re les m�ta-donn�es de la page, 
	toute les caract�ristiques propres � la page. -->
<meta charset="ISO-8859-1">
<title>Boutique</title>

<script src="https://code.jquery.com/jquery-3.3.1.js"
	integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
	crossorigin="anonymous"></script>
<script src="//code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="js/eshop.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
<link rel="stylesheet" href="css/eshop.css">
</head>
<body>
	<h1>
		Hello world JSP :
		<!-- Le symbole '=' apr�s '%' signifie : ins�rer le r�sultat de l'unique
			instruction Java dans le code HTML -->
		<%=LocalDate.now()%>
		<!-- la m�thode now() donne un objet de type LocalDate, pour �crire cet objet 
			en que texte dans le HTML, toString() est appel� implicitement. -->
	</h1>
	<div>
		<!-- La syntaxe ci-dessous sert � d�clarer que la suite du fichier doit 
			�tre interp�t� comme du code Java et non du code HTML. -->
		<%
			// A l'int�rieur des '%' on est dans le langage Java.
			String test = "-------=========== SUPER CHAINE ===========----------";
			System.out.println(test);
		%>
		<!-- Le symbole ci-dessus correspond � d�clarer la fin du bloc de code Java,
			on est de nouveau en HTML -->
	</div>

	<h1>Lise des chocolats</h1><br/>
	<table style=" border-collapse: collapse;">
<thead>
   <tr>
       <th style="border: 1px solid black;">id</th>
       <th style="border: 1px solid black;">label</th>
       <th style="border: 1px solid black;">value</th>
       <th style="border: 1px solid black;">action</th>
   </tr>
</thead>
   <c:forEach var="chocoType" items="${chocoTypes}">
   <tr>
   
					  
       <td style="border: 1px solid black;">${chocoType.id}</td>
       <td style="border: 1px solid black;">${chocoType.label}</td>
       <td style="border: 1px solid black;">${chocoType.value}</td>
       <td>
       <a href="delete.html?id=${chocoType.id}">
       <button class="btn btn-success">Supprimer</button>
       </a>
       <a href="eshop.html?id=${chocoType.id}">
       <button class="btn btn-success">Modifier</button>
		</a>
		</td>
   </tr>
   </c:forEach>
</table>
 

		<h2>${ isEdit ? "Cr�er un Chocolat" : "Modifier un chocolat" }:</h2>
		<form:form modelAttribute="chocoType" method="post" action="">
			<div>
				<label for="label">label</label> 
				<form:input id="label" path="label" required="required"/>
			</div>
			<div>
				<label for="value">value</label> 
				<form:input id="value" path="value" required="required"/>
			</div>
		
	
		
				<div id="stockinfo">
				
				</div>
		
			<button>Commander</button>
		</form:form>


	<c:if test="${ not empty message }">
		<div>${message}</div>
		<a href="index.html">Retour � l'accueil</a>
	</c:if>
</body>
</html>