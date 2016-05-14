<!doctype html>
<html>

  <head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
    <script src="app.js"></script>

  </head>

  <body ng-app="teste">
    <form ng-controller="ControllerUsuario as Usuario" novalidate>
      <H1>
<div>
Recolhe Recicláveis
</div>

</H1>
      <H2>
<div>
Cadastro de Usuário
</div>
</H2>
<p>
<a href="index.jsp" target="_self">Ínicio</a>
</p>

 	  
 	  <p>Email:
        <input type="email" ng-model="Usuario.Usuario.email">
      </p>
 	  
      <p>Nome:
        <input type="text" ng-model="Usuario.Usuario.nome">
      </p>
      
      <H3>
      <div> Endereço: 
      </div>
      </H3>
      
      <p>Logradouro:
        <input type="text" ng-model="Usuario.Usuario.logradouro">
      </p>
      
      <p>Número:
        <input type="text" ng-model="Usuario.Usuario.numero">
      </p>
      
      <p>Complemento:
        <input type="text" ng-model="Usuario.Usuario.complemento">
      </p>
      
      <p>CEP:
        <input type="text" ng-model="Usuario.Usuario.cep">
      </p>
      
      <p>bairro:
        <input type="text" ng-model="Usuario.Usuario.bairro">
      </p>
      
      <p>Cidade:
        <input type="text" ng-model="Usuario.Usuario.cidade">
      </p>
      
      <p>UF:
        <input type="text" ng-model="Usuario.Usuario.uf">
      </p>
      
      <p>
       <input type="button" value="Salvar" ng-click="Usuario.addUsuarioRest();">

      </p>
    	
    </form>
  </body>

</html>