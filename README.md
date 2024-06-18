# TRabalho Final JWT Arquitetura Aplicação WEB
## Visão Geral
Este projeto é uma aplicação de autenticação desenvolvida em Java utilizando o framework Spring Boot e MongoDB como banco de dados. Ele fornece serviços de autenticação e gerenciamento de usuários com diferentes níveis de permissão. O projeto também está configurado para ser executado em um contêiner Docker.

## Estrutura do Projeto
#### https://www.figma.com/design/4gO1V9IpolLq03eogzkEYU/Untitled?node-id=0-1&t=iLFoU17CwooxU6UT-1
![image](https://github.com/mauriciosadala/Trabalho-Arquitetura-Web-JWT/assets/125416578/15cdb105-785b-41a2-b2c4-1ecc993d25d4)

O projeto está estruturado em diversos pacotes, cada um contendo classes com responsabilidades específicas:

- com.example.Autenticacao: Contém a classe principal para inicializar a aplicação.
- com.example.config: Configurações de segurança.
- com.example.controller: Controladores REST para autenticação e gerenciamento de usuários.
- com.example.entity: Entidades do MongoDB.
- com.example.enums: Enumerações utilizadas no projeto.
- com.example.repository: Interface para interação com o banco de dados MongoDB.
- com.example.security: Utilitários para geração e validação de tokens JWT.
- com.example.service: Serviços de autenticação e gerenciamento de usuários.


## Dependências
- Spring Boot
- Spring Security
- Spring Data MongoDB
- JWT (Json Web Token)
- Docker:



## Início Rápido
### Requisitos
- JDK 11+,
- Maven,

- MongoDB
- ![image](https://github.com/mauriciosadala/Trabalho-Arquitetura-Web-JWT/assets/125416578/fca5d66c-c65f-4c28-bde9-13a2503a01c3)

- Docker,
- ![image](https://github.com/mauriciosadala/Trabalho-Arquitetura-Web-JWT/assets/125416578/3ec52688-261b-439e-9451-db4d5793a8d4)

## Configuração,


### SecurityConfig
- Configuração de segurança utilizando Spring Security. Define endpoints públicos e protegidos, além de configurar a autenticação básica.

### AuthController
- Controlador REST para autenticação de usuários. Possui endpoints para login, obtenção de informações do usuário e acesso restrito para administradores.

### UsuarioController
- Controlador REST para gerenciamento de usuários. Permite salvar, deletar e obter usuários.

### Usuario
- Entidade que representa um usuário no MongoDB.

### TipoConta
- Enumeração que define os tipos de conta: ADMIN, MOD e USER.

### UsuarioRepository
- Interface para interação com o banco de dados MongoDB.

### JwtUtil
- Classe utilitária para geração e validação de tokens JWT.

### AuthService
- Serviço para geração e extração de informações de tokens JWT.

### UsuarioService
- Serviço para gerenciamento de usuários. Inclui operações de cadastro, deleção e consulta de usuários.

## Endpoints
Autenticação
POST /auth/login: Realiza o login de um usuário.
GET /auth/user: Retorna informações do usuário autenticado.
GET /auth/admin: Endpoint restrito para administradores.

## Gerenciamento de Usuários
POST /usuario/salvar: Salva um novo usuário.
DELETE /usuario/deletar: Deleta um usuário.
GET /usuario/obtemTodos: Obtém todos os usuários.
GET /usuario/obtemUsuarioPorId: Obtém um usuário pelo ID.

## Segurança
A aplicação utiliza Spring Security para gerenciar a autenticação e autorização. As senhas são criptografadas utilizando BCrypt. Tokens JWT são usados para autenticação de sessões.
