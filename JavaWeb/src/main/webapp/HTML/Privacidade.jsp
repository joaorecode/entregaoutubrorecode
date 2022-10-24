<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <!doctype html>
<html lang="pt-br">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
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

    <main style="padding-top: 100px; padding-bottom: 100px;">
        <!--  Política de privacidade -->
        <h1 style="text-align: center; color: white;">Privacidade</h1>
        <h4>Nós da Fly US usamos coletamos os dados de nossos clientes. Nossas bases de dados mantém registros dos
            seguintes tipos:




            Dados pessoais: Endereço residencial, CPF(Cadastro de Pessoa Física), telefone, Endereço de E-mail, dados de
            compra com cartão de crédito, data de nascimento e outros dados pessoais.


            Dados de aparelho: Endereço de IP do aparelho que comprou, tempo de atividade e alguns Cookies, que usamos
            para personalizar sua navegação.



            Importante: Não usamos seus dados para outras funções, que não sejam relacionadas ao uso do nosso serviço.
            Também não vendemos dados pessoais de ninguém. Os dados são mantidos em total sigilo, podendo serem
            liberados mediante a solicitação jurídica(em casos processuais), ou pelo próprio titular da conta.

            É possível que alguns dados fiquem armazenados após a exclusão da conta em nossos servidores por, no máximo,
            6 meses para fins legais. Fique tranquilo(a), elas são desvinculadas de qualquer indentificador direto.


            Qualquer dúvida sobre a política, por favor, entre em contato com nosso suporte. Estaremos a disposição para
            sanar quaisquer dúvidas.

        </h4>
    </main> <!--  Fim da Política -->



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