package com.firstSB;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class FirstControler {
@RequestMapping("/kapil")
	public String first() {
		System.out.println("chal gya");
	//return"SANTOSH PAGAL HAI";   //// this is use for without jsp 
	return "home";
}
}
