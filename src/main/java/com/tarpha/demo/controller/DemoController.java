package com.tarpha.demo.controller;

import java.util.List;

import com.tarpha.demo.domain.Demo;
import com.tarpha.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api/demo/")
@Api
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/list")
    public List<Demo> getList() {
        return demoService.getList();
    }

    @GetMapping("/search/{key}")
    public List<Demo> search(@PathVariable("key") String keyText) {
        return demoService.search(keyText);
    }

    @PostMapping("/save")
    public void save(Demo demo) {
        demoService.save(demo);
    }

    @PostMapping("/save-all")
    public void saveAll(List<Demo> demos) {
        demoService.saveAll(demos);
    }

    @PostMapping("/delete")
    public void delete(Demo demo) {
        demoService.delete(demo);
    }

    @PostMapping("/delete-all")
    public void deleteAll() {
        demoService.deleteAll();
    }
    
}
