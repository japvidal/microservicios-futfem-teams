# microservicios-futfem-teams

`microservicios-futfem-teams` is the main team catalog service for the Tikitakas Women Football backend. It is responsible for storing and exposing the team entities used across competitions, squads, matchday flows, and frontend views, making it one of the central domain services in the platform.

The repository is built with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. It relies on `microservicios-common` for shared CRUD abstractions, registers in Eureka, and is exposed externally through the gateway route. This keeps the service aligned with the rest of the backend and reduces duplicated technical code.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/teams/**`

The `v0.1.0` release includes the current platform standards for Docker publishing, Jenkins pipelines, test isolation, and gateway-aware Swagger/OpenAPI behavior. As a result, the service can be deployed consistently with the rest of the stack and its API documentation works correctly from the central Swagger UI.

This repository should be your primary reference whenever the platform needs canonical team information, rather than temporary, matchday-specific, or derived team views.
