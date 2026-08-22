services:
  postgres:
    image: postgres:17-alpine
    container_name: edms-postgres
    restart: unless-stopped
    environment:
      POSTGRES_DB: edms
      POSTGRES_USER: edms
      POSTGRES_PASSWORD: edms
    ports:
      - "5432:5432"
    volumes:
      - edms_pgdata:/var/lib/postgresql/data

volumes:
  edms_pgdata:
