# Spring Gym API

API backend desenvolvida com **Java e Spring Boot** para gerenciamento de alunos e avaliações físicas em uma academia.

O projeto tem como objetivo aplicar conceitos fundamentais do desenvolvimento backend, incluindo arquitetura em camadas, construção de APIs REST, persistência de dados relacionais e consultas utilizando Spring Data JPA.

## Funcionalidades

- **Gerenciamento de alunos:** operações de acesso e gerenciamento dos dados dos alunos.
- **Avaliações físicas:** estrutura para registrar e consultar avaliações físicas.
- **Persistência de dados:** integração com PostgreSQL utilizando Spring Data JPA e Hibernate.
- **Consultas personalizadas:** métodos de repositório para buscar alunos por e-mail, carregar dados relacionados e executar consultas SQL específicas.
- **Paginação de resultados:** suporte a consultas paginadas para organizar os dados retornados pela API.
- **Validação de dados:** utilização de validações para ajudar a manter a consistência das informações recebidas.

## Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Spring Boot** — estrutura principal da aplicação.
- **Spring Web** — desenvolvimento de endpoints HTTP e APIs REST.
- **Spring Data JPA** — abstração da camada de persistência.
- **Hibernate** — implementação de ORM para o mapeamento objeto-relacional.
- **PostgreSQL** — banco de dados relacional.
- **Maven** — gerenciamento de dependências e build.
- **Lombok** — redução de código repetitivo em classes Java.
- **Bean Validation** — validação de dados, conforme as regras implementadas.

## Organização do backend

A aplicação utiliza componentes do ecossistema Spring para separar as responsabilidades do sistema.

```text
spring-gym/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/souza/spring_boot_essentials/
│   │   │       ├── controller/
│   │   │       ├── dto/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       └── ...
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

*Estrutura ilustrativa: os diretórios devem corresponder à organização atual do código-fonte.*

## Banco de dados

O projeto utiliza PostgreSQL para armazenar os dados da aplicação.

O modelo contempla entidades relacionadas a:

- **Alunos:** informações dos alunos cadastrados.
- **Avaliações físicas:** informações referentes às avaliações dos alunos.

A camada de persistência utiliza interfaces baseadas em `JpaRepository`, além de métodos de consulta personalizados para atender às necessidades da aplicação.

## ⚙️ Como executar o projeto

### Pré-requisitos

Antes de iniciar, tenha instalado:

- JDK compatível com a versão Java configurada no projeto.
- Maven.
- PostgreSQL.

### 1. Clone o repositório

```bash
git clone https://github.com/ghsantos-software/spring-gym.git
cd spring-gym
```

### 2. Crie o banco de dados

No PostgreSQL, crie o banco utilizado pela aplicação:

```sql
CREATE DATABASE gym;
```

### 3. Configure as variáveis de ambiente

Configure as credenciais do PostgreSQL nas variáveis de ambiente utilizadas pelo projeto:

```text
DATABASE_USERNAME=seu_usuario
DATABASE_PASSWORD=sua_senha
```

A aplicação deve estar configurada para utilizar o banco `gym` em `localhost:5432`.

**Importante:** não coloque credenciais reais diretamente no repositório.

### 4. Execute a aplicação

Na raiz do projeto, execute:

```bash
mvn spring-boot:run
```

A aplicação está configurada para utilizar a porta `8082`.

Endereço local:

`http://localhost:8082`

## Testando a API

Você pode utilizar ferramentas como **Postman** ou **Insomnia** para enviar requisições HTTP e verificar as respostas da aplicação.

Teste os endpoints implementados nos controllers para validar as operações relacionadas a alunos e avaliações físicas.

## Conceitos praticados

Este projeto faz parte da minha evolução em desenvolvimento backend com Java e Spring Boot. Durante sua construção, são explorados conceitos como:

- Desenvolvimento de APIs REST.
- Programação orientada a objetos com Java.
- Separação de responsabilidades entre componentes.
- DTOs para transferência de dados.
- Mapeamento objeto-relacional com JPA.
- Consultas derivadas e SQL nativo.
- Relacionamentos entre entidades.
- Paginação e otimização de consultas.
- Configuração de aplicações Spring Boot.
- Integração com PostgreSQL.
- 
## Sobre o projeto

Projeto de aprendizado focado em **desenvolvimento backend com Java e Spring Boot**, com ênfase em APIs REST, persistência de dados e boas práticas de organização de código.

Desenvolvido como parte da minha jornada de evolução como desenvolvedor Java Backend.

🔗 **Repositório:** [github.com/ghsantos-software/spring-gym](https://github.com/ghsantos-software/spring-gym)
