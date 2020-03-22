package com.lgcns.demo.mockservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MockController {
    @Value("${server.port}")
    String port;

    @GetMapping("/account/v1/{cstmId}")
    public List<Account> retrieveAccountList(@PathVariable("cstmId") String cstmId) {
        System.out.println("Spring Boot Run at " + port);
        try {
            Thread.sleep(1000 * 10);
        } catch (Exception e) {
            //
        }
        List<Account> list = new ArrayList<Account>();
        Account account = new Account("1234", cstmId, "홍길동", "2020-03-16", "2020-03-16", (long) 10000000);
        list.add(account);
        return list;
    }
}
