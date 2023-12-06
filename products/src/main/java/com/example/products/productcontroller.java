package com.example.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class productcontroller {
	@GetMapping(path="/details")
	public boolean Accountdetails(@RequestParam String accId) {
		if(accId!=null) {
			if(accId.substring(0,2).equals("01")) {
				return true;
			}
		}return false;
	}
	}


