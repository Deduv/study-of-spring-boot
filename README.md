<div align="center">

# Meu Primeiro Spring Boot

Repositório de estudo do ecossistema Spring Boot

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.1-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-000000?style=for-the-badge&logo=jsonwebtokens&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

</div>

---

## Sobre

Este projeto tem finalidade **exclusivamente educacional**. Ele reúne, em uma API REST simples, os conceitos fundamentais que venho estudando no ecossistema Spring Boot. O foco está em entender como cada peça funciona, e não em entregar um produto final.

## Tópicos estudados

| Tópico | O que foi praticado |
|---|---|
| Injeção de dependência | Beans, `@Service`, `@Repository`, `@Controller` e injeção por construtor |
| Persistência de dados | Spring Data JPA, entidades, repositories e PostgreSQL |
| Tratamento de exceções | Exceções customizadas e `@RestControllerAdvice` global |
| Autenticação | Login com geração e validação de tokens JWT |
| Spring Security | Filtro de autenticação, configuração da cadeia de segurança e `UserDetailsService` |

## Arquitetura

O código segue uma separação em camadas:

```
src/main/java/org/example/meuprimeirospringbooot
├── controller    # Entrada das requisições HTTP
├── service       # Regras de negócio
├── repository    # Acesso a dados com Spring Data JPA
├── model         # Entidades JPA
├── security      # Configuração, filtro e utilitário JWT
└── exceptions    # Exceções customizadas e handler global
```

## Pré-requisitos

- Java 21
- Maven (ou o wrapper `./mvnw` incluso)
- PostgreSQL em execução

## Como executar

**1. Clone o repositório**

```bash
git clone <url-do-repositorio>
cd meu-primeiro-springbooot
```

**2. Crie o banco de dados**

```sql
CREATE DATABASE seu_banco;
```

**3. Configure as credenciais**

Copie o arquivo de exemplo e preencha com os seus dados. O arquivo `application.properties` está no `.gitignore` e nunca deve ser versionado.

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

**4. Execute a aplicação**

```bash
./mvnw spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## Segurança

- Credenciais e arquivos locais são mantidos fora do versionamento.
- Use o arquivo `application.properties.example` como modelo.
- A chave de assinatura do JWT é gerada em memória a cada inicialização, portanto os tokens deixam de valer quando a aplicação reinicia.

## Aviso

Projeto de estudo. Não use as configurações deste repositório em ambiente de produção.
