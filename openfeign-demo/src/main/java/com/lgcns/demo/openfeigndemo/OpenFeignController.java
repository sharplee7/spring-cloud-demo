package com.lgcns.demo.openfeigndemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenFeignController {
    private final DemoService demoService;

    @Autowired
    public OpenFeignController(DemoService demoService) {
        this.demoService = demoService;
    }


    @GetMapping("/account/v1/{cstmId}")
    public List<Account> retrieveAccountList(@PathVariable("cstmId") String cstmId) throws Exception {
        return demoService.retrieveAccountList(cstmId);
    }
}
