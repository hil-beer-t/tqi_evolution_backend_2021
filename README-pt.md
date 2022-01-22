# Loan Simulator
<img src="https://img.shields.io/badge/in%20development-0.0.1-green">

Simula uma aplicação para empréstimos.

_Em desenvolvimento, considere isso como uma sugestão._

**Veja a branch _test_ para atualizações (v0.0.2). Branch _main_ inalterada.**


## Descrição

Um cliente deverá fazer login ou se cadastrar. Terá uma visão geral dos seus empréstimos, detalhes e situação.
Se não possuir nenhum empréstimo, poderá requisitar um novo.

## Fluxos e casos de uso
[GitBook](https://hil-beer-t-git.gitbook.io/loan-simulator/)

## Getting Started

### Prerequisites

* Java 8 (1.8.x)
* Docker

### Intalando banco de dados

* Download da imagem docker do Postgres
```
docker pull postgres
```

* Cria uma imagem local do Postgres
```
docker run --name company_db -d -p 5432:5432 -e POSTGRES_USER=postgres_user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=company_db postgres
```
* Terminal deve estar na pasta _**resources**_. Onde está localizado o arquivo _schema.sql_
```
docker run -it --rm --net=host -v ${PWD}:/tmp postgres /bin/bash
```

* Cria as tabelas
```
psql -h localhost -U postgres_user company_db -f /tmp/schema.sql
```

* _data.sql_ para _populate_ inicial do banco

### Executando

* Download das dependências
```
mvn dependency:resolve
```

* Geração de código OpenApi advinda do arquivo **_loan-simulator.yaml_** (****OpenApi v3.0.0****)
```
mvn clean install
```
* _Run_ spring
```
mvn spring-boot:run
```

## Autores

[Hilbert Digenio](https://github.com/hil-beer-t)

## Licença

This project is licensed under the MIT License.

## Agradecimentos

* [andrelugomes](https://github.com/andrelugomes/digital-innovation-one)