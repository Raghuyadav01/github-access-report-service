package com.example.githubreport.controller;

import com.example.githubreport.service.GitHubService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class AccessReportController {

    private final GitHubService gitHubService;

    public AccessReportController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/access-report")
    public Map<String, List<String>> getAccessReport() {
        return gitHubService.getAccessReport();
    }
}
