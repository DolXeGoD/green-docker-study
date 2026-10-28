# Docker 실습 프로젝트

Docker 수업에서 사용할 Spring Boot 예제 프로젝트입니다.

MySQL에 저장된 데이터를 조회하는 간단한 API로, 도커 환경 내의 애플리케이션과 데이터베이스 컨테이너를 연동하는 실습에 사용합니다.

## 기술 스택

- Java 21
- Spring Boot 4.0.1
- Spring Data JPA
- MySQL
- Gradle

## 실행 전 설정

`src/main/resources/application.properties`에 MySQL 접속 정보를 입력합니다.

## API

- `GET /test` : 데이터 목록 조회