<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/style.css">

<title>Bem-Vindo! | Time To Set Fire!</title>

</head>
<body background="img/bg-estadio-mosaico.jpg" style=" background-repeat: no-repeat; background-size: cover;">
<header>

		<div class="boxtop">
			<h4>BEM VINDO AO CAMISA7! O SOCIO TORCEDOR DO BOTAFOGO FUTEBOL E
				REGATAS!</h4>
			<h5>TIME TO SET FIRE!</h5>
		</div>


</header>

<main>

		<div id="login">

			<form class="card" action="home.jsp" method="post">

				<div class="card-header">

					<h2>FACA LOGIN</h2>

				</div>

				<div class="card-content">


					<div class="card-content-area">

						<label for="usuario">USUARIO</label> <input type="text"
							placeholder="Digite seu nome de usuário" id="usuario" required>

					</div>

					<div class="card-content-area">

						<label for="password">SENHA</label> <input type="password"
							placeholder="Digite sua senha" id="password" required>

					</div>

				</div>

				<div class="card-footer">
					
						<input type="submit" value="ENTRAR" class="submit">
						
					<a href="index.jsp" target="_blank" class="recuperar_senha"
						style="text-decoration: none; color: #ffffff;"> Esqueceu a
						senha? </a>
						
						<a href="index.jsp" target="_blank" class="recuperar_senha"
						style="text-decoration: none; color: #ffffff;"> Nao tem login?
						Faca seu cadastro aqui! </a>


				</div>

			</form>

		</div>


</main>





</body>
</html>