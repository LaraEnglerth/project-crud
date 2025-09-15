# 📌 Project CRUD - Spring Boot + H2

Este é um projeto simples de CRUD de usuários, desenvolvido em **Java 17** com **Spring Boot**, para fins de estudo e portfólio.  
O objetivo é demonstrar a estrutura de um projeto Java organizado em camadas (Controller, Service, Repository e Entity), utilizando **Spring Data JPA** e banco de dados em memória **H2**.

---

## Tecnologias usadas:
- Java 17;
- Spring Boot;
- Spring Data JPA;
- Banco de dados H2 (em memória);
- Lombok;
- Maven.

---

## Estrutura do projeto:

<img width="492" height="625" alt="image" src="https://github.com/user-attachments/assets/89df9749-e428-4363-a4f1-6d69b4958f96" />


### Descrição das camadas:
- **Controller** → recebe requisições HTTP e retorna respostas (`UsuarioController`);
- **Service (business)** → contém regras de negócio (`UsuarioService`);
- **Repository** → acesso ao banco via Spring Data JPA (`UsuarioRepository`);
- **Entity** → representa tabelas do banco (`Usuario`).

---

## Endpoints da API:

![image.png](attachment:d440f93e-0c58-4b8a-bfe9-03dd0a805db9:image.png)









