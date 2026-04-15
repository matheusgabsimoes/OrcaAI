# OrcaAI

OrcaAI is a Spring Boot application for expense management.

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Flyway
- PostgreSQL
- Docker Compose

## Prerequisites

- Java 17
- Maven Wrapper
- Docker and Docker Compose

## Environment Variables

Create a local `.env` file based on `.env.example`.

## Running PostgreSQL

```bash
docker compose up -d
```

The database is exposed locally on `127.0.0.1:5432`.

## Running the Application

```bash
./mvnw spring-boot:run
```

## Notes

- Sensitive values must stay in `.env` and should not be committed.
- Docker Compose reads database settings from environment variables.
- Spring Boot reads datasource settings from environment variables.
