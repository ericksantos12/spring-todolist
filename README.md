<h1 align="center">🍂 Todo List com Springboot</h1>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/ericksantos12/spring-todolist.svg)](https://github.com/ericksantos12/spring-todolist/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/ericksantos12/spring-todolist.svg)](https://github.com/ericksantos12/spring-todolist/pulls)

</div>

## 📝 Table of Contents

- [🧐 About ](#-about-)
- [🏁 Getting Started ](#-getting-started-)
  - [Prerequisites](#prerequisites)
  - [Installing](#installing)
- [🎈 Usage ](#-usage-)
- [🚀 Deployment ](#-deployment-)
- [⛏️ Built Using ](#️-built-using-)
- [✍️ Authors ](#️-authors-)

## 🧐 About <a name = "about"></a>

Este é um projeto de Todo List desenvolvido com Springboot. Ele permite a criação, leitura e atualização de tarefas, além de autenticação de usuários.

## 🏁 Getting Started <a name = "getting_started"></a>

Para obter uma cópia do projeto em execução em sua máquina local para fins de desenvolvimento e teste, siga as instruções abaixo.

### Prerequisites

Você precisará ter o Java 17 e Maven instalados em sua máquina.

### Installing

1. Clone o repositório.
2. Navegue até a pasta do projeto.
3. Execute o comando `mvn clean install` para construir o projeto.
4. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.

## 🎈 Usage <a name="usage"></a>

Após iniciar a aplicação, você pode acessar os endpoints `/tasks` para gerenciar tarefas e `/users` para gerenciar usuários.

## 🚀 Deployment <a name = "deployment"></a>

Para implantar este projeto usando Docker, siga as instruções abaixo:

1. Certifique-se de ter o Docker instalado em sua máquina.
2. Navegue até a pasta do projeto onde o `Dockerfile` está localizado.
3. Construa a imagem Docker usando o comando:
   ```
   docker build -t spring-todolist .
   ```
4. Após a construção ser concluída, execute a imagem usando o comando:
   ```
   docker run -p 8080:8080 spring-todolist
   ```
5. A aplicação estará disponível no endereço `http://localhost:8080`.

## ⛏️ Built Using <a name = "built_using"></a>

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework
- [H2 Database](https://www.h2database.com/) - Database
- [Lombok](https://projectlombok.org/) - Java Library
- [BCrypt](https://github.com/patrickfav/bcrypt) - Password Encryption

## ✍️ Authors <a name = "authors"></a>

- [@ericksantos12](https://github.com/ericksantos12) - Desenvolvedor Principal