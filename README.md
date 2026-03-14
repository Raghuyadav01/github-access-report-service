# GitHub Access Report Service

This project connects to the GitHub API and generates a report showing which users have access to repositories within a GitHub organization.

## Technologies
- Java
- Spring Boot
- GitHub REST API

## API Endpoint

GET /api/access-report

Example:

http://localhost:8080/api/access-report?org=test-org

## Example Response

{
 "alice": ["repo1","repo2"],
 "bob": ["repo2","repo3"]
}

## Authentication

Authentication is done using GitHub Personal Access Token.

## How to Run

Clone repository:

git clone https://github.com/yourusername/github-access-report-service

Run project:

mvn spring-boot:run
