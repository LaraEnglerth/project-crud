# 📌 Project CRUD - Spring Boot + H2

Este é um projeto simples de CRUD de usuários, desenvolvido em **Java 17** com **Spring Boot**, para fins de estudo e portfólio.  
O objetivo é demonstrar a estrutura de um projeto Java organizado em camadas (Controller, Service, Repository e Entity), utilizando **Spring Data JPA** e banco de dados em memória **H2**.


## Tecnologias usadas:
- Java 17;
- Spring Boot;
- Spring Data JPA;
- Banco de dados H2 (em memória);
- Lombok;
- Maven.


## Estrutura do projeto:

<img width="492" height="625" alt="image" src="https://github.com/user-attachments/assets/89df9749-e428-4363-a4f1-6d69b4958f96" />


### Descrição das camadas:
- **Controller** → recebe requisições HTTP e retorna respostas (`UsuarioController`);
- **Service (business)** → contém regras de negócio (`UsuarioService`);
- **Repository** → acesso ao banco via Spring Data JPA (`UsuarioRepository`);
- **Entity** → representa tabelas do banco (`Usuario`).


## Endpoints da API:

'**POST**'

<img width="600" height="174" alt="image" src="https://github.com/user-attachments/assets/7a9c6395-0821-460d-a34a-6b77cb4cf65a" />

'**GET**'

<img width="501" height="133" alt="image" src="https://github.com/user-attachments/assets/b34f3fc1-1002-4fb2-aa6c-7ee0c93929b0" />

'**PUT**'

<img width="612" height="154" alt="image" src="https://github.com/user-attachments/assets/c12146b4-c2b7-4ecf-abd6-daf321676a6e" />

'**DELETE**'

<img width="547" height="171" alt="image" src="https://github.com/user-attachments/assets/7d17b512-ac73-4288-9c53-2443ee6f3ec1" />













