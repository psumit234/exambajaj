package com.app.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.Request;
import com.app.dto.Response;

@RestController
@RequestMapping
public class MainController {
	//"data": [“A”,”1”,”334”,”4”,”R”]
	@PostMapping("/bfhl")
	public Response mainController(@RequestBody Request req) {
		Response response=new Response();
		System.out.println(Arrays.toString(req.getAlphabets()));
		//
		int place=0,place2=0;
		String[] obj=req.getAlphabets();
		String[]  alphabets=new String[obj.length];
		int[] num=new int[obj.length];
		
		for(int i=0;i<obj.length;i++) {
			
			if(Character.isLetter(obj[i].charAt(0))) {	
				
				alphabets[place++]=obj[i];
			}else {
				num[place2++]=Integer.parseInt(obj[i]);
			}
		}
		
		response.set_success(true);
		response.setAlphabets(alphabets);
		response.setNumbers(num);
		response.setEmail("psumitkumar471@gmail.com");
		response.setRoll_number("PD0639");
		response.setUser_id("Sumit_Kumar_Patel_02021997");

		return response;
	}

}
