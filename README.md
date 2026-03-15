# GitHub Access Report Service

## Overview
This project connects to the GitHub API and generates a report showing which users have access to repositories within a GitHub organization.

The service retrieves repositories from an organization, identifies collaborators with access, and exposes an API endpoint that returns a structured JSON report mapping users to repositories.

## GitHub API Integration

The service is designed to integrate with the GitHub REST API to retrieve repository and collaborator information from a given organization.

The application can fetch:
- Organization repositories
- Repository collaborators
- User access mapping across repositories
---

## Technologies Used
- Java
- Spring Boot
- GitHub REST API
- Maven

---

## Authentication

Authentication is performed using a GitHub Personal Access Token (PAT).

Steps:
1. Go to GitHub → Settings → Developer Settings → Personal Access Tokens
2. Generate a new token
3. Set the token as an environment variable:

```
GITHUB_TOKEN=your_token_here
```

---

## API Endpoint

```
GET /api/access-report
```

Example request:

```
http://localhost:8080/api/access-report?org=test-org
```

---

## Example Response

```json
{
 "alice": ["repo1","repo2"],
 "bob": ["repo2","repo3"]
}
```

This response shows which repositories each user has access to.

---

## How to Run the Project

Clone the repository:

```
git clone https://github.com/yourusername/github-access-report-service
```

Navigate to the project directory:

```
cd github-access-report-service
```

Run the application:

```
mvn spring-boot:run
```

---

## Scalability Considerations

The application is designed to support organizations with:

- 100+ repositories
- 1000+ users

Approaches used:
- Efficient API usage
- Aggregation using hash maps
- Avoid unnecessary sequential calls

---

## Assumptions

- Authentication uses GitHub Personal Access Token
- Only repository collaborators are considered
- GitHub API pagination may be required for large organizations

---

## Future Improvements

- Add caching for frequently accessed data
- Handle GitHub API rate limits
- Add pagination support
- Add role-based access details
