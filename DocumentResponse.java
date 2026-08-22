spring:
  application:
    name: edms

  datasource:
    url: jdbc:postgresql://localhost:5432/edms
    username: edms
    password: edms

  jpa:
    hibernate:
      ddl-auto: update
    open-in-view: false
    properties:
      hibernate:
        format_sql: true

server:
  port: 8080

app:
  jwt:
    # Demo value only. In a real system put a 256+ bit secret in an environment variable.
    secret: "change-me-to-a-long-random-secret-key-with-at-least-32-bytes"
    expiration-ms: 86400000

springdoc:
  swagger-ui:
    path: /swagger-ui.html
