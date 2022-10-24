<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FlyUs</title>
    <link rel="stylesheet" href="../CSS/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <!-- Link CSS Bootstrap-->
</head>

<body>
    <header>
        <!-- Início da NavBar -->
        <nav class="navbar navbar-expand-lg ">
            <div class="container-fluid">
                <a class="navbar-brand" href="Index.jsp" style="color: #01d170;">FlyUs</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="Destinos.jsp"
                                style="color: #01d170;">Destinos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="Promocoes.jsp" style="color: #01d170;">Promoções</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                                aria-expanded="false" style="color: #01d170;">
                                Contato
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="RedesSociais.jsp">Redes Sociais</a></li>
                                <li><a class="dropdown-item" href="Telefone.jsp">Telefone</a></li>
                                <li>
                                    <hr class="dropdown-divider">
                                </li>
                                <li><a class="dropdown-item" href="Email.jsp">E-mail</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="d-flex" role="search">

                        <a href="Entrar.jsp"><button type="button" class="btn btn-outline-light">Entrar</button></a>
                    </form>
                </div>
            </div>
        </nav>
    </header> <!-- Fim da NavBar-->
    <main>
        <!--Início do conteúdo da Home-->
        <div id="groups">
            <div id="group-a">
                <div id="conteudo-1-1">
                    <img src="../imagens/trip.svg" id="img-1" alt="Viagens extraordinárias">
                </div>
                <div id="conteudo-1-2">
                    <h1>Viagens inesquecíveis e <br> <strong> Extraordinárias </strong> <a href="Destinos.jsp"
                            style="text-decoration: none; color: #5a3092;">Destinos</a></h1>
                </div>
            </div>
            <div id="group-b">
                <div id="conteudo-2-1">
                    <h1>Segurança e qualidade que <br> <strong>Cabem no seu bolso</strong><br><a href="Promocoes.jsp"
                            style="text-decoration: none; color: #5a3092;">Promoções</a></h1>
                </div>
                <div id="conteudo-2-2">
                    <img src="../imagens/preço.svg" id="img-2" alt="Preços que cabem no bolso">
                </div>
            </div>
            <div id="group-c">
                <div id="conteudo-3-1">
                    <img src="../imagens/seguro.svg" id="img-3" alt="Segurança de primeira">
                </div>
                <div id="conteudo-3-2">
                    <h1>Aqui nós protegemos seus dados e <br> <strong>Você</strong> <a href="Privacidade.jsp"
                            style="text-decoration: none; color: #5a3092;">
                            Privacidade</a></h1>
                </div>
            </div>
        </div>
    </main> <!-- Fim do conteúdo da Home-->

    <footer id="rodapé">
        <!-- Footer Humilde -->
        <p>Todos os direitos reservados a Fly us©</p>
        <p>Qualquer forma de plágio é crime. Para utilização de nossos serviços, entre em <a
                href="Email.jsp">contato</a> com a equipe.</p>
        <p>Página atualizada no dia: 31 de agosto de 2022</p>
    </footer> <!-- Fim do Footer Humilde-->




    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script> <!-- Link Script Bootstrap-->
</body>

</html>