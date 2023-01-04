<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="UTF-8">
<title>FORM</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous" defer></script>
</head>
<body>
	<div class="container my-4">
		<h4 class="title" style="color: teal">>>Informations de lauréat:</h4>

		<form action="ControlClient" method="post" class="form">
			<fieldset class="border p-2">

				<label for="nom">Nom : <span style="color: red"> *</span></label> <input
					type="text" name="nom" class="form-control" style="width: 30%;"
					required /> <label for="prenom">Prénom : <span
					style="color: red"> *</span></label> <input type="text" name="prenom"
					class="form-control" style="width: 30%;" required /> <label
					for="tele">Numéro téléphone : <span style="color: red">
						*</span></label> <input type="text" name="tele" class="form-control"
					style="width: 30%;" required /> <label for="adress">Adresse
					: <span style="color: red"> *</span>
				</label>
				<textarea class="form-control" cols="6" rows="5" name="adress"></textarea>

				<label for="pay">Pays : <span style="color: red"> *</span></label> <input
					type="text" name="pay" class="form-control" style="width: 30%;"
					required /> <label for="ville">Ville : <span
					style="color: red"> *</span></label> <input type="text" name="ville"
					class="form-control" style="width: 30%;" required /> <label
					for="etre">Entreprise/organisme : <span style="color: red">
						*</span></label>
				<textarea class="form-control" cols="6" rows="5" name="etre"></textarea>

				<label for="fct">Fonction : <span style="color: red">
						*</span></label>
				<textarea class="form-control" cols="6" rows="5" name="fct"></textarea>

				<label for="email">Email : <span style="color: red">
						*</span></label> <input type="text" name="email" class="form-control"
					style="width: 30%;" required /> <label for="age">Age : </label> <input
					type="text" name="age" class="form-control" style="width: 30%;" />


				<label for="fb">Contact Facebook : </label> <input type="text"
					name="fb" class="form-control" style="width: 30%;" />
			</fieldset>
			<br>
			<button name="valider" type="submit" class="btn btn-outline-primary">Valider</button>
			<button name="annuler" type="reset" class="btn btn-outline-primary">Annuler</button>
		</form>
	</div>
</body>
</html>