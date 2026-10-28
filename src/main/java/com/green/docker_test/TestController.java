package com.green.docker_test;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestController {
    private final TestRepository testRepository;

    @GetMapping("/test")
    public List<TestEntity> test() {
        return testRepository.findAll();
    }
}
