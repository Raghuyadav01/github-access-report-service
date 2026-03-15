package com.example.githubreport.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class GitHubService {

    public Map<String, List<String>> getAccessReport() {

        Map<String, List<String>> report = new HashMap<>();

        report.put("alice", Arrays.asList("repo1","repo2"));
        report.put("bob", Arrays.asList("repo2","repo3"));

        return report;
    }
}
