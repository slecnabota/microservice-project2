# Java Microservices Example

## Описание проекта

Этот проект демонстрирует архитектуру микросервисов на Java (Spring Boot) с использованием Eureka для сервис-дискавери, PostgreSQL для хранения данных и Docker Compose для контейнеризации и управления зависимостями.

## Общая структура

- **eureka-server** — сервис-дискавери (реестр сервисов).
- **user-service** — сервис управления пользователями (REST API, хранение пользователей в PostgreSQL).
- **order-service** — сервис управления заказами (REST API, хранение заказов в PostgreSQL).

Все сервисы автоматически регистрируются в Eureka и могут находить друг друга по имени.

---

## Как работает

1. **Eureka-server** стартует первым и становится центром регистрации сервисов.
2. **user-service** и **order-service** подключаются к Eureka и регистрируются там.
3. Сервисы обмениваются данными через REST API, используя логические имена (например, `user-service`).
4. Все сервисы запускаются и взаимодействуют внутри одной сети Docker Compose.

---

## Документация по REST API

### user-service

- **GET /users** — получить список всех пользователей
- **POST /users** — создать нового пользователя
  - Пример тела запроса:
    ```json
    { "name": "Имя пользователя" }
    ```
- **GET /users/{id}** — получить пользователя по id
- **DELETE /users/{id}** — удалить пользователя

### order-service

- **GET /orders** — получить список всех заказов
- **POST /orders** — создать новый заказ
  - Пример тела запроса:
    ```json
    { "userId": 1, "description": "Описание заказа" }
    ```
- **GET /orders/{id}** — получить заказ по id
- **DELETE /orders/{id}** — удалить заказ

---

## Как запустить проект (через Docker Compose)

1. Убедитесь, что установлены Docker и Docker Compose.
2. В корне проекта выполните:
   ```sh
   docker compose up --build
   ```
3. Откройте Eureka Dashboard: [http://localhost:8761/](http://localhost:8761/)
4. Проверьте доступность сервисов:
   - User Service: [http://localhost:8081/users](http://localhost:8081/users)
   - Order Service: [http://localhost:8082/orders](http://localhost:8082/orders)

---

## Переменные окружения

- `DB_HOST`, `DB_PORT`, `DB_NAME`, `DB_USER`, `DB_PASSWORD` — параметры подключения к PostgreSQL
- `EUREKA_CLIENT_SERVICEURL_DEFAULTZONE` — адрес Eureka (обычно `http://eureka-server:8761/eureka/` внутри Docker Compose)

---

## Для чего нужен этот проект

- Показывает, как строить микросервисную архитектуру на Java с автоматическим обнаружением сервисов (service discovery)
- Демонстрирует взаимодействие сервисов через REST API
- Подходит как шаблон для старта собственных микросервисных проектов

---

## Требования
- Java 21 (OpenJDK)
- Gradle
- PostgreSQL
- Docker

## Запуск
1. Установите переменные окружения из `.env` (Spring Boot поддерживает dotenv).
2. Сборка:
   ```sh
   ./gradlew build
   ```
3. Запуск:
   ```sh
   ./gradlew bootRun
   ```

## Структура
- `src/main/java/com/example/demo` 
- `src/main/resources/application.properties` - конфиг

## Пример REST API
- `GET /users` — список пользователей
- `POST /users` — создать пользователя
