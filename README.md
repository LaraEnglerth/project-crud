# 📌 Project CRUD - Spring Boot + H2

Este é um projeto simples de CRUD de usuários, desenvolvido em **Java 17** com **Spring Boot**, para fins de estudo e portfólio.  
O objetivo é demonstrar a estrutura de um projeto Java organizado em camadas (Controller, Service, Repository e Entity), utilizando **Spring Data JPA** e banco de dados em memória **H2**.

---

## 🚀 Tecnologias usadas
- Java 17
- Spring Boot
- Spring Data JPA
- Banco de dados H2 (em memória)
- Lombok
- Maven

---

## 📂 Estrutura do projeto

project-crud
└── src
└── main
└── java
└── com.englerth.project_crud
├── controller # Endpoints REST (UsuarioController)
├── business # Regras de negócio (UsuarioService)
├── infrastructure
│ ├── entitys # Entidades JPA (Usuario)
│ └── repository # Repositórios de acesso ao banco (UsuarioRepository)
└── ProjectCrudApplication.java # Classe principal


### 🔹 Descrição das camadas
- **Controller** → recebe requisições HTTP e retorna respostas (`UsuarioController`).
- **Service (business)** → contém regras de negócio (`UsuarioService`).
- **Repository** → acesso ao banco via Spring Data JPA (`UsuarioRepository`).
- **Entity** → representa tabelas do banco (`Usuario`).

---

## 📌 Endpoints da API

### ➕ Criar usuário
`POST /usuario`  
Body (JSON):
```json
{
  "nome": "Lara Englerth",
  "email": "lara@email.com"
}
