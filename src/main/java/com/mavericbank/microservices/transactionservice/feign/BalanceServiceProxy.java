package com.mavericbank.microservices.transactionservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mavericbank.microservices.transactionservice.model.Balance;

@FeignClient(name = "balance-service",url = "http://localhost:3015")
public interface BalanceServiceProxy {
	
	@GetMapping("/balance/find/{id}")
	public Balance retrieveBalance(@PathVariable Long id);
	
	@GetMapping("/balance/findacc/{id}")
	public Balance retrieveBalanceByAcc(@PathVariable String id);
	
	@PutMapping("/balance/update/{id}")
	public Balance updateBalance(@PathVariable long id, @RequestBody Balance balance);

}
