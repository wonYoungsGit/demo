package com.tarpha.demo.service;

import java.util.List;

import com.tarpha.demo.domain.Demo;
import com.tarpha.demo.repository.DemoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;
    
    public List<Demo> getList() {
        return demoRepository.findAll();
    }

    public List<Demo> search(String keyText) {
        return demoRepository.findByKeyText(keyText);
    }

    public void save(Demo demo) {
        demoRepository.save(demo);
    }

    public void saveAll(List<Demo> demos) {
        demoRepository.saveAll(demos);
    }

    public void delete(Demo demo) {
        demoRepository.delete(demo);
    }

    public void deleteAll() {
        demoRepository.deleteAll();
    }

}
