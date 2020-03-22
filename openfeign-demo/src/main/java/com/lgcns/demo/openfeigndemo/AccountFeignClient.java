package com.lgcns.demo.openfeigndemo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.hystrix.FallbackFactory;

@FeignClient(name = "mock-service",
		fallbackFactory = AccountFeignClientFallbackFactory.class)
public interface AccountFeignClient {

	@GetMapping("/mock-service/account/v1/{cstmId}")
	List<Account> retrieveAccountList(@PathVariable("cstmId") String cstmId) throws Exception;

}

@Component
class AccountFeignClientFallbackFactory implements FallbackFactory<AccountFeignClient> {

	@Override
	public AccountFeignClient create(Throwable t) {
		return new AccountFeignClient() {

			@Override
			public List<Account> retrieveAccountList(String cstmId) throws Exception{
				System.out.println("************************");

				t.printStackTrace();

				return null;
			}

		};
	}

}