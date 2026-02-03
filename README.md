# 🕵️‍♂️ AirBnTruta - Sistema de Esconderijos para Fugitivos
O AirBnTruta é uma plataforma desenvolvida para conectar hospedeiros (donos de locais discretos) a fugitivos que precisam de um abrigo temporário. O projeto foi construído utilizando Java, Spring Boot, Thymeleaf e persistência de dados via JDBC.

# 🛠️ Tecnologias Utilizadas
Java 17+: Linguagem base do sistema.

Spring Boot: Framework para o backend e rotas web.

Thymeleaf: Motor de templates para renderização dinâmica do HTML.

JDBC (Java Database Connectivity): Persistência de dados direta sem uso de ORMs pesados.

Bootstrap 5: Estilização do frontend.

📋 Requisitos Implementados
Fugitivo (Foragido)
Login & Auto-Registro: Sistema de autenticação para acesso à área restrita do fugitivo.

Busca de Hospedagens: Listagem de todas as "tocas" disponíveis no sistema.

Filtros Avançados: Busca por localidade e preço máximo diário.

Registro de Interesse: Envio de proposta de pagamento e tempo de permanência para o hospedeiro.

Meus Interesses: Tela para acompanhar propostas enviadas que ainda estão com a hospedagem disponível.

# 🏠 Hospedeiro
Gestão de Hospedagens: Cadastro de novos esconderijos.

Sinalização de Interesse: Cards de hospedagem exibem a quantidade de fugitivos interessados em tempo real.

Visualização de Propostas: Tela detalhada com o vulgo do fugitivo e sua respectiva proposta.

Aceite de Interesse: Ao aceitar um fugitivo, a hospedagem torna-se automaticamente indisponível para outros usuários.

# 🏗️ Estrutura do Projeto (Padrão Repository/Facade)
O projeto segue um padrão arquitetural para garantir a separação de responsabilidades:

Entities: Classes de modelo (Hospedagem, Interesse, Fugitivo).

Repositories: Classes que executam o SQL via JDBC.

Facade: Ponto central de acesso aos repositórios, simplificando as chamadas nos Controllers.

Controllers: Gerenciamento das rotas e lógica de sessão.
