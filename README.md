# Knight


## Setting up Project

```shell
cp .env.example .env
```

[![Java CI with Maven](https://github.com/akbatra567/knight/actions/workflows/maven.yml/badge.svg)](https://github.com/akbatra567/knight/actions/workflows/maven.yml)
- Docker compose file available for running postgres instance
- Swagger Documentation Available

Technology: 
- Java 21
- Docker Compose
- Springboot
- Flyway DB Migrations

### Run Application using

```shell
./mvnw spring-boot:run
```

### TODO:
- Setup Authentication using [KeyCloak](https://www.keycloak.org/)
- Setup [Prometheus](https://prometheus.io/) for monitoring and alerting. 
- Setup [Grafana](https://grafana.com/) for data visualization

Swagger Docs Available [here](http://localhost:8080/swagger-ui/index.html)
