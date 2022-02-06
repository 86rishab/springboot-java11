package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.component.TestComponent;

@RestController
@RequestMapping(value = "/v1")
public class TestService {

    private TestComponent testComponent;

    @Autowired
    public void setTestComponent(TestComponent testComponent) {
        this.testComponent = testComponent;
    }

    @RequestMapping(value = "loginUser", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String getcall(@RequestParam("test") String test) {
        System.out.println("param value " + test);
        testComponent.testComponentCall();
        return "hello world";

    }

}
