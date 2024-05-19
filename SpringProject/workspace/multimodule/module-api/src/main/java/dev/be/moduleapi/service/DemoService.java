package dev.be.moduleapi.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String save(){
        return "save";
    }
    public String find(){
        return "find";
    }
}

