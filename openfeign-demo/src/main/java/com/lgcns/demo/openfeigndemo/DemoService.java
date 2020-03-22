package com.lgcns.demo.openfeigndemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Autowired
    private AccountFeignClient accountFeignClient;

    public List<Account> retrieveAccountList(String cstmId) throws Exception {
    	return accountFeignClient.retrieveAccountList(cstmId);
    }
}