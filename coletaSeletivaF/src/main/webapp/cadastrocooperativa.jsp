<!doctype html>
<html>

  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
    <script src="app.js"></script>

  </head>

  <body ng-app="teste">
    <form ng-controller="ControllerCooperativa as Cooperativa" novalidate>
      <H1>
<div>
Recolhe Recicláveis
</div>

</H1>
      <H2>
<div>
Cadastro de Cooperativa
</div>
</H2>

<p>
<a href="index.jsp" target="_self">Ínicio</a>
</p>

 	  
 	  <p>Email:
        <input type="email" ng-model="Cooperativa.Cooperativa.email">
      </p>
 	  
      <p>Nome Fantasia:
        <input type="text" ng-model="Cooperativa.Cooperativa.nomefantasia">
      </p>
      
      <p>CNPJ:
        <input type="text" ng-model="Cooperativa.Cooperativa.cnpj">
      </p>
      
      <H3>
      <div> Endereço: 
      </div>
      </H3>
      
      <p>Logradouro:
        <input type="text" ng-model="Cooperativa.Cooperativa.logradouro">
      </p>
      
      <p>Número:
        <input type="text" ng-model="Cooperativa.Cooperativa.numero">
      </p>
      
      <p>Complemento:
        <input type="text" ng-model="Cooperativa.Cooperativa.complemento">
      </p>
      
      <p>CEP:
        <input type="text" ng-model="Cooperativa.Cooperativa.cep">
      </p>
      
      <p>bairro:
        <input type="text" ng-model="Cooperativa.Cooperativa.bairro">
      </p>
      
      <p>Cidade:
        <input type="text" ng-model="Cooperativa.Cooperativa.cidade">
      </p>
      
      <p>UF:
        <input type="text" ng-model="Cooperativa.Cooperativa.uf">
      </p>
      
      <p>
       	<input type="button" value="Salvar" ng-click="Cooperativa.addCooperativaRest();">
	  </p>
        	
    </form>
  </body>

</html>