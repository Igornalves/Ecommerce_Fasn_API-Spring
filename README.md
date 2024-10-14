# Projeto de sistema Ecommerce para Loja de Roupa

Esse projeto, tem como intuito da vida a criacao de um sistema para ecommerce completo como todas as rotas possiveis do projeto, voltado para empresa de roupa.

## Índice

- [Tecnologias e Ferramentas Utilizadas](#tecnologias-e-ferramentas-utilizadas)
- [Docs da Aplicacao](#Docs-da-Aplicacao)
- [Pré-requisitos](#pré-requisitos)
- [Instalação e Configuração](#instalação-e-configuração)
- [Execução do Projeto](#execução-do-projeto)

## Tecnologias e Ferramentas Utilizadas

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">
<img width="100" src="https://skillicons.dev/icons?i=spring">
<img width="100" alt="Spring" width="120" src="https://skillicons.dev/icons?i=hibernate">
<img width="100" src="https://skillicons.dev/icons?i=postgres">
<img width="100" src="https://skillicons.dev/icons?i=postman">

</div>
<br>

- ***Linguagem:*** Java

- ***Fremework:*** Spring-Boot 

- ***Banco de Dados:*** PostgreSQL 

- ***ORM:*** Hibernate

- ***Teste De Rotas:*** Postman 

## Docs da Aplicacao 

para visualizar algumas rotas, no caso todas as rotas existentes na aplicacao vc pode se conectar mais entender mais cada funcionalidade da aplicacao.

- se for roda aplicacao de forma local:

    ```bash
    http://localhost:5152/swagger-ui/index.html#/
    ```

## Pré-requisitos

é necessário garantir que seu ambiente de desenvolvimento esteja configurado adequadamente. Aqui estão os principais pré-requisitos:

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=java">
<img width="100" src="https://skillicons.dev/icons?i=maven">
<img width="100" src="https://skillicons.dev/icons?i=gradle">
<img width="100" src="https://skillicons.dev/icons?i=mysql">

</div>
<br>

- Java Development Kit (JDK): ***versão 8*** ou superior como a ***JDK 11*** recomendada pela documentacao

- Maven ou Gradle: ferramentas de ***build*** para gerenciar ***dependências*** e criar artefatos da aplicação.

- Banco de Dados (SQL or NoSQL): Certifique-se de que o ***PostgreSQL*** ou outros se ja estam instalados e configurados corretamente.

#### IDE (Ambiente de Desenvolvimento Integrado):

<br>
<div style="display: inline_block" align="center">

<img width="100" src="https://skillicons.dev/icons?i=vscode">
<img width="100" src="https://skillicons.dev/icons?i=eclipse">
<img width="100" src="https://skillicons.dev/icons?i=idea">

</div>
<br>

 - ***IntelliJ IDEA*** (com o plugin Spring Boot integrado).
 - ***Eclipse*** (com o plugin Spring Tools Suite - STS).
 - ***VS Code*** (com extensões para Java e Spring Boot)


## Instalação e Configuração

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-repositorio/sistema-gerenciamento-escola.git
    ```
2. **Configuração do banco de dados**:

    - Crie um banco de dados PostgreSQL ou outros.
    - Configure as credenciais de acesso ao banco no arquivo application.properties ou application.yml

        ```bash
        spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
        spring.datasource.username=seu_usuario
        spring.datasource.password=sua_senha
        spring.jpa.hibernate.ddl-auto=update
        ```

3. **Instalação das dependências**:

    - Se estiver usando Maven:

        ```bash
        mvn clean install
        ```

    - Se estiver usando Gradle:

        ```bash
        gradle build
        ```

## Execução do Projeto

1. **Rodando a aplicação:**

    - Se estiver usando Maven:

        ```bash
        mvn spring-boot:run
        ```

    - Se estiver usando Gradle:

        ```bash
        gradle bootRun
        ```

2. **Acessando a aplicação:**

    <br>
    <div style="display: inline_block" align="center">

    <img width="100" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/chrome/chrome-original.svg" />

    </div>
    <br>

    - A aplicação estará rodando em ```http://localhost:8080``` por padrão, OBS :. veeja see na aplicacao nao ah alguma alteracao de porta padrao a ser rodada na aplicacao.

3. **Testando as rotas da API:**

    <br>
    <div style="display: inline_block" align="center">

    <img width="100" src="https://skillicons.dev/icons?i=postman">

    </div>
    <br>

    - Utilize o Postman para testar as requisições como GET, POST, PUT e DELETE.

## License

This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

