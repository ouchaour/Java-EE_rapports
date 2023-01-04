<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>FORM</title>

<%! public String random() {
	long a=Math.round(Math.random()*1001);
	return "CNE-"+a;
}
%>
</head>
<body>

<div class="container my-4">
        <h4 class="title" style="color: teal">Gestion des Etudiants:</h4>
<form action="SaveEtudiant" method="post" class="form">
<fieldset class="border p-2">
  <div class="form-group row">
    <label for="code" class="col-5 col-form-label" style="font-weight: bold;">Code :</label> 
    <div class="col-7">
      <input id="code" name="code" type="text" required="required" class="form-control" value="<%=random() %>">
    </div>
  </div>
  <div class="form-group row">
    <label for="nom" class="col-5 col-form-label" style="font-weight: bold;">Nom :</label> 
    <div class="col-7">
      <input id="nom" name="nom" type="text" required="required" class="form-control">
    </div>
  </div>
  <div class="form-group row">
    <label for="prenom" class="col-5 col-form-label" style="font-weight: bold;">Prenom :</label> 
    <div class="col-7">
      <input id="prenom" name="prenom" type="text" required="required" class="form-control">
    </div>
  </div>
  <div class="form-group row">
    <label for="age" class="col-5 col-form-label" style="font-weight: bold;">Age :</label> 
    <div class="col-7">
      <input id="age" name="age" type="text" required="required" class="form-control">
    </div>
  </div>
  <div class="form-group row">
    <label for="ville" class="col-5 col-form-label" style="font-weight: bold;">Ville :</label> 
    <div class="col-7">
      <input id="ville" name="ville" type="text" required="required" class="form-control">
    </div>
  </div> 
<button name="valider" type="submit" class="btn btn-primary">Valider</button>
</fieldset>
</form>

<br>

<div class="container my-6" style="background-color:rgb(164, 199, 228)">
    <table class="table">
    
        <thead>
            <tr>
                <th scope="col">Code</th>
                <th scope="col">Date</th>
                <th scope="col">Montant</th>
                <th scope="col">Mode de paiement</th>
                <th scope="col">statut du paiement</th>
                <th scope="col">Mode de livraison</th>
                <th scope="col">statut de la livraison</th>
            </tr>
        </thead>
        <tbody>
            
            <tr>
                <td><c:out value="1"/></td>
                <td><c:out value="Friday, December 30, 2022"/></td>
                <td><c:out value="DH2599.50"/></td>
                <td><c:out value="Cheque"/></td>
                <td><c:out value="En cours"/></td>
                <td><c:out value="48H chrono"/></td>
                <td><c:out value="En cours"/></td>
                <td class="btn btn-primary">Delete</a></td>
            </tr>
       
        </tbody>
    </table>
    </div>
</div>
</body>
</html>