<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0//EN">
<!-- Balise racine unique. -->
<html>
<!-- Balise unique comportant les ent�tes permettant de param�trer la page. -->
<head>
<!-- Texte apparaissant dans le nom de l'onglet du navigateur. -->
<title>Sexy chocolaterie</title>
<!-- Balise utilis�e pour lier une page HTML � un fichier CSS. -->
<link rel="stylesheet" href="./css/index.css">
</head>
<!-- Balise unique permettant de d�crire le contenu de la page. -->
<body>
	<!-- La balise div correspond � une division horizontale de la page. 
	Chaque div prend naturellement la largeur maximum (en fonction de la balise parent) 
	et la hauteur minimum pour afficher son contenu -->
	<div class="header">
		<!-- Balise qui transforme son contenu en lien Hypertext cliquable. -->
		<!-- Un attribut href avec une valeur vide (ou juste '#') permet de faire un lien
			vers la m�me page HTML -->
		<a href="#"> <!-- Balise permettant d'afficher une image � partir du chemin indiqu�. -->
			<img src="./images/header.jpg">
		</a>
		<!-- L'attribut class permet de caract�riser un �l�ment HTML avec un ou
			plusieurs noms pour permettre sa s�lection -->
		<div class="menu">
			<!-- h2 pour Header 2 ou Titre de niveau 2, plus petit que le niveau 1 -->
			<h2>
				<a href="#">Accueil</a>
			</h2>
			<h2>
				<a href="origins.html">Nos origines</a>
			</h2>
			<h2>
				<a href="chocolates.html">Nos chocolats</a>
			</h2>
			<h2>
				<a href="eshop.html">Boutique en ligne</a>
			</h2>
			<h2>
				<a href="visit.html">Visiter la chocolaterie</a>
			</h2>
			<h2>
				<a href="">Contact</a>
			</h2>
		</div>
	</div>
	<div class="content">
		<!-- h1 pour Header 1 ou Titre de niveau 1, le niveau le plus important et 
			le mieux mit en �vidence dans la page -->
		<h1>Bienvenue au pays du chocolat !</h1>
		<div class="contentText">
			<!-- La balise p correspond � la mise en page d'un paragraphe de texte. -->
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam
				non arcu at massa gravida tincidunt. Aenean vel placerat sapien.
				Vestibulum tincidunt suscipit accumsan. Sed bibendum felis sit amet
				rhoncus vehicula. Ut sodales luctus diam, id tristique libero
				vehicula quis. Curabitur scelerisque est pharetra est lacinia, quis
				mollis tellus elementum. Aliquam aliquet dapibus luctus.</p>
			<p>Mauris ac nisl quam. Nullam sit amet ipsum at quam finibus
				lacinia. Sed sit amet pharetra lorem. Quisque in efficitur quam.
				Suspendisse suscipit tortor vitae tortor fringilla, eu tincidunt
				elit vestibulum. Donec sed rhoncus mi, non mattis eros. Nullam
				pharetra, lorem id consequat fringilla, ex neque lacinia est, vel
				accumsan ante dolor in ipsum. Proin faucibus tempor lectus, eu
				auctor velit venenatis vitae. Nullam libero est, pretium a pulvinar
				ut, commodo sed erat. Aliquam nibh est, hendrerit ut enim non,
				volutpat lacinia odio. Cras iaculis maximus fringilla. Mauris
				pellentesque sapien lacus, id pulvinar quam malesuada id.</p>
			<p>Curabitur mollis lorem at magna gravida rutrum. Sed imperdiet
				nunc non ante pharetra, eu ornare dui varius. Donec malesuada dui a
				lacus mollis, quis lobortis leo vulputate. Aenean consequat porta
				luctus. Sed ante felis, posuere eu felis in, mollis efficitur purus.
				Nulla dictum vehicula lectus. Donec quam dolor, rhoncus quis maximus
				ac, imperdiet sit amet nunc. Fusce ut elit pellentesque, eleifend
				libero id, semper turpis. Fusce commodo aliquam dictum. Aenean
				ultricies nibh a mauris bibendum suscipit. Pellentesque semper metus
				dui, eget cursus eros pharetra non. Praesent volutpat vehicula
				imperdiet.</p>
		</div>
	</div>
	<div class="footer">
		<div class="footerLeft">
			<div class="text">
				<!-- les symboles comme &copy; sont appel�s "HTML character entity" -->
				<span>Made by SexychocoDreamTeam ! &copy; 2018</span>
			</div>
			<div class="icons">
				<!-- Balise de division utilis�e comme conteneur vide pour une image affich�e en fond. -->
				<div style="background-image: url('./images/facebook.png');"></div>
				<div style="background-image: url('./images/google.png');"></div>
				<div style="background-image: url('./images/pinterest.png');"></div>
			</div>
		</div>
		<div class="footerRight">
			<!-- Titre 3, plus petit que les deux premiers. -->
			<h3>Liens utiles :</h3>
			<!-- Unordered List, liste � puces -->
			<ul>
				<!-- Chaque item d'une liste � puce est d�crit par une balise li (list-item) -->
				<li><a href="https://sexychocolat.slack.com/">Lien vers le
						slack</a></li>
				<li><a href="https://www.w3schools.com/">Documentation du
						World Wide Web Consortium</a></li>
			</ul>
		</div>
	</div>
</body>
</html>
