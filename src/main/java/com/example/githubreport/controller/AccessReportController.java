package com.example.githubreport.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class AccessReportController {

    @GetMapping("/access-report")
    public Map<String, List<String>> getAccessReport(
            @RequestParam String org) {

        Map<String, List<String>> report = new HashMap<>();

        report.put("alice", Arrays.asList("repo1", "repo2"));
        report.put("bob", Arrays.asList("repo2", "repo3"));

        return report;
    }
}
