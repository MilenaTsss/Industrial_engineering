# Промышленная инженерия программного обеспечения

## Запуск docker-compose

```shell
docker-compose -f docker/docker-compose.yaml --env-file .env up
```
 
Остановка:

```shell
docker-compose -f docker/docker-compose.yaml --env-file .env down
```

Запуск с сборкой:

```shell
docker-compose -f docker/docker-compose.yaml --env-file .env up --build
```

## Request examples

### Get all

```http request
POST http://localhost:9000/api/wishes
Content-Type: application/json

{
  "name": "Wish 2",
  "imageUrl": "http://example.com/image2.png",
  "cost": 75
}
```

### Post one

```http request
GET http://localhost:9000/api/wishes
Content-Type: application/json
```