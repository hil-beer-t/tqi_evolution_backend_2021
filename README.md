# Loan Simulator
<img src="https://img.shields.io/badge/in%20development-0.0.1-green">

Simulates an application for loans.

_In development, consider it as suggestion._

**See branch _test_ for updates (v0.0.2). Branch _main_ unchanged**

## Description

A client should **_sign up_** or **_sign in_**. Take an **_overview_** of your loans if not have any, should have the possibility
to **_create_** a new requisition.

## Flows and use cases
[GitBook](https://hil-beer-t-git.gitbook.io/loan-simulator/)

## Getting Started

### Prerequisites

* Java 8 (1.8.x)
* Docker

### Installing db

* Gets Postgres docker image
```
docker pull postgres
```

* Creates local Postgres docker image
```
docker run --name company_db -d -p 5432:5432 -e POSTGRES_USER=postgres_user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=company_db postgres
```
* Terminal must be located in _**resources**_ folder.
```
docker run -it --rm --net=host -v ${PWD}:/tmp postgres /bin/bash
```

* Creates tables
```
psql -h localhost -U postgres_user company_db -f /tmp/schema.sql
```

* _data.sql_ to seed data bank

### Executing program

* Maven download dependencies
```
mvn dependency:resolve
```

* Maven code generate from **_loan-simulator.yaml_** (OpenApi)
```
mvn clean install
```
* Run spring
```
mvn spring-boot:run
```

## Authors

[Hilbert Digenio](https://github.com/hil-beer-t)

## License

This project is licensed under the MIT License.

## Acknowledgments

Inspiration.

* [andrelugomes](https://github.com/andrelugomes/digital-innovation-one)